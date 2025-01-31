public class TestCircle {  
   public static void main(String[] args) {
      Circle c1 = new Circle();
      System.out.println("Le rayon du cercle est de " 
         + c1.getRadius() + " avec une aire de " + c1.getArea());
      Circle c2 = new Circle(2.0);
      System.out.println("Le rayon du cercle est de " 
         + c2.getRadius() + " avec une aire de " + c2.getArea());
   }
}