import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class ServidorWeb {

    // Classe interna que representa uma aula
    static class Aula {
        String titulo;
        String descricao;
        String[] arquivos;
        String[] explicacoes;

        Aula(String titulo, String descricao, String[] arquivos, String[] explicacoes) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.arquivos = arquivos;
            this.explicacoes = explicacoes;
        }
    }

    // Mapa com todas as aulas (id -> Aula)
    static final Map<Integer, Aula> aulas = new LinkedHashMap<>();

    static {
        aulas.put(1, new Aula(
            "Hello World",
            "O ponto de partida clássico para qualquer linguagem de programação.",
            new String[]{"HelloWorld.java"},
            new String[]{
                "<code>public class HelloWorld</code> — Declara uma classe. Em Java, todo código deve pertencer a uma classe.",
                "<code>public static void main(String[] args)</code> — O método principal e ponto de entrada do programa.",
                "<code>System.out.println(\"Olá, Mundo!\")</code> — Imprime texto no console."
            }
        ));
        aulas.put(2, new Aula(
            "Variáveis",
            "Como declarar e usar variáveis com tipos explícitos em Java.",
            new String[]{"Variaveis.java"},
            new String[]{
                "<code>String nome = \"João\"</code> — Variável do tipo texto.",
                "<code>int idade = 25</code> — Variável do tipo número inteiro.",
                "<code>double altura = 1.80</code> — Variável do tipo número com casas decimais.",
                "<code>boolean estudante = true</code> — Variável do tipo verdadeiro/falso."
            }
        ));
        aulas.put(3, new Aula(
            "Condicionais",
            "Como controlar o fluxo do programa com base em condições.",
            new String[]{"Condicionais.java"},
            new String[]{
                "<code>if (idade >= 18)</code> — Verifica se a condição é verdadeira e executa o bloco seguinte.",
                "<code>else if (idade >= 13)</code> — Condição alternativa, verificada se o <code>if</code> anterior for falso.",
                "<code>else</code> — Executado se nenhuma das condições anteriores for verdadeira.",
                "<code>clima.equals(\"sol\")</code> — Compara strings em Java usando <code>.equals()</code> em vez de <code>==</code>."
            }
        ));
        aulas.put(4, new Aula(
            "Loops",
            "Laços de repetição para executar um bloco de código múltiplas vezes.",
            new String[]{"Loops.java"},
            new String[]{
                "<code>for (int i = 0; i < 5; i++)</code> — Loop que executa 5 vezes, incrementando <code>i</code> a cada repetição.",
                "<code>while (contador < 3)</code> — Loop que continua enquanto a condição for verdadeira.",
                "<code>do { ... } while (outroContador < 2)</code> — Semelhante ao <code>while</code>, mas garante pelo menos uma execução."
            }
        ));
        aulas.put(5, new Aula(
            "Arrays",
            "Como armazenar múltiplos valores em uma única variável.",
            new String[]{"ArraysJava.java"},
            new String[]{
                "<code>int[] idades = new int[3]</code> — Cria um array de inteiros com 3 posições.",
                "<code>idades[0] = 25</code> — Atribui um valor à primeira posição (índice começa em 0).",
                "<code>String[] nomes = {\"Alice\", \"Bob\", \"Charlie\"}</code> — Forma curta de declarar e inicializar.",
                "<code>for (String nome : nomes)</code> — Loop for-each para percorrer todos os elementos."
            }
        ));
        aulas.put(6, new Aula(
            "Métodos",
            "Blocos de código reutilizáveis que realizam tarefas específicas.",
            new String[]{"Metodos.java"},
            new String[]{
                "<code>public static String saudacao(String nome)</code> — Método que recebe um parâmetro e retorna uma String.",
                "<code>public static void imprimirSoma(int a, int b)</code> — Método <code>void</code> que não retorna valor, apenas executa uma ação."
            }
        ));
        aulas.put(7, new Aula(
            "Orientação a Objetos",
            "Conceitos básicos de POO: classes, objetos, atributos, construtores e métodos.",
            new String[]{"Carro.java", "Garagem.java"},
            new String[]{
                "<strong>Atributos</strong> (<code>cor</code>, <code>modelo</code>, <code>ano</code>) — As características que todo objeto <code>Carro</code> terá.",
                "<strong>Construtor</strong> (<code>public Carro(...)</code>) — Método especial para criar um novo objeto com valores iniciais.",
                "<strong>Métodos</strong> (<code>ligar</code>, <code>desligar</code>, <code>exibirInfo</code>) — Os comportamentos do objeto.",
                "<code>Carro meuFusca = new Carro(\"Azul\", \"Fusca\", 1970)</code> — Cria uma instância (objeto) da classe.",
                "<code>meuFusca.exibirInfo()</code> — Chama um método no objeto específico."
            }
        ));
    }

    public static void main(String[] args) throws IOException {
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);

        // Rota principal: serve o arquivo index.html
        servidor.createContext("/", exchange -> {
            String html = Files.readString(Path.of("index.html"));
            enviarResposta(exchange, html);
        });

        // Rota de aula: lê o template e preenche com os dados da aula
        servidor.createContext("/aula", exchange -> {
            String query = exchange.getRequestURI().getQuery();
            int id = 0;
            if (query != null && query.startsWith("id=")) {
                try {
                    id = Integer.parseInt(query.substring(3));
                } catch (NumberFormatException e) {
                    // id continua 0
                }
            }

            Aula aula = aulas.get(id);
            if (aula == null) {
                String erro = "<html><body><h1>Aula não encontrada</h1><a href='/'>Voltar</a></body></html>";
                enviarResposta(exchange, erro);
                return;
            }

            // Lê o código-fonte dos arquivos da aula
            StringBuilder codigoBuilder = new StringBuilder();
            for (int i = 0; i < aula.arquivos.length; i++) {
                if (i > 0) {
                    codigoBuilder.append("\n// ──────────────────────────────────\n// ");
                    codigoBuilder.append(aula.arquivos[i]);
                    codigoBuilder.append("\n// ──────────────────────────────────\n\n");
                }
                String codigo = Files.readString(Path.of(aula.arquivos[i]));
                codigoBuilder.append(codigo.strip());
            }

            // Monta a lista de explicações como <li>
            StringBuilder explicacaoHtml = new StringBuilder();
            for (String item : aula.explicacoes) {
                explicacaoHtml.append("<li>").append(item).append("</li>\n");
            }

            // Nome dos arquivos para exibição
            String nomeArquivos = String.join(" + ", aula.arquivos);

            // Navegação anterior/próxima
            String navAnterior = id > 1
                ? "<a href=\"/aula?id=" + (id - 1) + "\">&larr; Aula anterior</a>"
                : "<span></span>";
            String navProxima = aulas.containsKey(id + 1)
                ? "<a href=\"/aula?id=" + (id + 1) + "\">Próxima aula &rarr;</a>"
                : "<span></span>";

            // Escapa o código para exibição segura em HTML
            String codigoEscapado = codigoBuilder.toString()
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");

            // Lê o template e substitui os placeholders
            String template = Files.readString(Path.of("aula.html"));
            String html = template
                .replace("{{NUMERO}}", String.valueOf(id))
                .replace("{{TITULO}}", aula.titulo)
                .replace("{{DESCRICAO}}", aula.descricao)
                .replace("{{ARQUIVO}}", nomeArquivos)
                .replace("{{CODIGO}}", codigoEscapado)
                .replace("{{EXPLICACAO}}", explicacaoHtml.toString())
                .replace("{{NAV_ANTERIOR}}", navAnterior)
                .replace("{{NAV_PROXIMA}}", navProxima);

            enviarResposta(exchange, html);
        });

        // Rota de saudação dinâmica
        servidor.createContext("/saudacao", exchange -> {
            String query = exchange.getRequestURI().getQuery();
            String nome = "Mundo";
            if (query != null && query.startsWith("nome=")) {
                nome = java.net.URLDecoder.decode(query.substring(5), "UTF-8");
            }
            String template = Files.readString(Path.of("saudacao.html"));
            String html = template.replace("{{NOME}}", nome);
            enviarResposta(exchange, html);
        });

        servidor.start();
        System.out.println("Servidor rodando em http://localhost:8080");
        System.out.println("Pressione Ctrl+C para parar.");
    }

    private static void enviarResposta(HttpExchange exchange, String html) throws IOException {
        byte[] bytes = html.getBytes("UTF-8");
        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
        exchange.sendResponseHeaders(200, bytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        }
    }
}
