public class TestPersonne {
   public static void main(String[] args) {

      Personne P1 = new Personne("Laurence", "Ago");
      System.out.println(P1);
      Personne P2 = new Personne("Lolo");
      System.out.println(P2);

      System.out.println(P1);
      System.out.println("Le nom est " + P1.getNom());
   }
}