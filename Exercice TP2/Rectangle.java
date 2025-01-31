public class Rectangle {  

   private double Length;
   private double Width;
   private String color;

   public Rectangle() { 
      Length = 1.0;
      Width = 1.0;
      color = "red";
   }
   
   public Rectangle(double Width, double Length) {  
      Width = Width;
      Length = Length;
   }
   
   public double getLength() {
	     return Length; 
	   }
   
   public double getWidth() {
	     return Width; 
	   }
   
   public double getArea() {
	      return Length*Width*Math.PI;
	   }
   
   public void setLength (double Length) {
	   this.Length = Length;
	}
   
   public void setWidth (double Width) {
	   this.Width = Width;
	}
   
   public double getPerimeter() {
	   return Length*Width*Math.PI;
   }
}