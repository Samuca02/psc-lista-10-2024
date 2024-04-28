public class App {
    public static void main(String[] args) {
      Carro carro = new Carro("Ford Ka", 2024, "XJ45", "Carro do ano");  

      System.out.print(carro.getRoda() + " é");
      carro.transportar("Pessoas");
    }
}
