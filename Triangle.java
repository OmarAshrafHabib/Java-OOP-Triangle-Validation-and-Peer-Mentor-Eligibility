/**
 * This class represents a triangle shape using 3 points.
 * 
 * @author Natalie Webber
 * @author Omar Habib ID:3742418
 */

public class Triangle {

   private CartesianPoint pointA;
   private CartesianPoint pointB;
   private CartesianPoint pointC;

   public Triangle(double x1, double y1,
         double x2, double y2,
         double x3, double y3) {
      pointA = new CartesianPoint(x1, y1);
      pointB = new CartesianPoint(x2, y2);
      pointC = new CartesianPoint(x3, y3);
   }

   public Triangle(CartesianPoint p1,
         CartesianPoint p2,
         CartesianPoint p3) {
      pointA = p1;
      pointB = p2;
      pointC = p3;
   }

   public double getPerimeter() {
      return pointA.distance(pointB)
            + pointB.distance(pointC)
            + pointC.distance(pointA);
   }

   /**
    * the method calculates if the triangles all sides are equal
    * 
    * @return true if the triangle is an equilateral
    * @return false if the triangle is not an equilateral
    */
   public boolean isEquilateral() {
      double TOLERANCE = 1E-14;
      if ((Math.abs(pointA.distance(pointB) - pointA.distance(pointC)) < TOLERANCE)
            && (Math.abs(pointA.distance(pointC) - pointC.distance(pointB)) < TOLERANCE)) {
         return true;
      }
      return false;

   }

   /**
    * the method calculates if the carteasian points maek a right triangle or not
    * 
    * @return true if the triangle is Right
    * @return false if the triangle is not Right
    */
   public boolean isRight() {
      double TOLERANCE = 1E-14;
      double sideA = pointA.distance(pointC);
      double sideB = pointA.distance(pointB);
      double sideC = pointB.distance(pointC);

      if (sideA >= Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2)) - TOLERANCE &&
            sideA <= Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2)) + TOLERANCE) {
         return true;
      }

      else if (sideB >= Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2)) - TOLERANCE &&
            sideB <= Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2)) + TOLERANCE) {
         return true;
      }

      else if (sideC >= Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideA, 2)) - TOLERANCE &&
            sideC <= Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideA, 2)) + TOLERANCE) {
         return true;
      }
      return false;
   }

}
