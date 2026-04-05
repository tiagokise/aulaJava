// Code before change

// Line 109 change:
int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
HttpServer servidor = HttpServer.create(new InetSocketAddress(port), 0);

// Rest of the code

// Line 199 change:
System.out.println("Server is running on port: " + port);
