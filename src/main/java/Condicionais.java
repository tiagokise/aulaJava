
public class Condicionais {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else if (idade >= 13) {
            System.out.println("É adolescente.");
        } else {
            System.out.println("É menor de idade.");
        }

        String clima = "sol";
        if (clima.equals("sol")) {
            System.out.println("Dia ensolarado!");
        } else {
            System.out.println("Dia não ensolarado.");
        }
    }
}
