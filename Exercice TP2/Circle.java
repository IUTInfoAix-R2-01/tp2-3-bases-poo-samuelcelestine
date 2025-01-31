public class Circle {  

   private double radius;
   private String color;

   public Circle() { 
      radius = 1.0;
      color = "red";
   }
   
   public Circle(double r) {  
      radius = r;
   }
  
   public double getRadius() {
     return radius; 
   }
   
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   public void setRadius (double radius) {
	   this.radius = radius;
	}
   
   public double getCircumference() {
	   return radius*radius*Math.PI;
   }
}