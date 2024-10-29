/**
 * this is a driver to initialize the triangle class and the carteasianPoint
 * class objects
 * 
 * @author Omar Habib id:3742418
 */
public class TriangleTest {
    public static void main(String[] args) {
        CartesianPoint cp1 = new CartesianPoint(-0.5, 0.0);
        CartesianPoint cp2 = new CartesianPoint(0.5, 0.0);
        CartesianPoint cp3 = new CartesianPoint(0.0, Math.sqrt(3) / 2);

        CartesianPoint cp4 = new CartesianPoint(2.63, 6);
        CartesianPoint cp5 = new CartesianPoint(2.63, 1.25);
        CartesianPoint cp6 = new CartesianPoint(8.34, 1.25);

        Triangle triangle1 = new Triangle(cp1, cp2, cp3);
        Triangle triangle2 = new Triangle(cp4, cp5, cp6);

        if (triangle1.isEquilateral()) {
            System.out.println("Triangle 1 is Equilateral");
        } else {
            System.out.println("Triangle 1 is not Equilateral");
        }
        if (triangle1.isRight()) {
            System.out.println("Tringle 1 is Right");
        } else {
            System.out.println("Triangle 1 is not right");
        }

        System.out.println();

        if (triangle2.isRight()) {
            System.out.println("Tringle 2 is Right");
        } else {
            System.out.println("Triangle 2 is not right");
        }
        if (triangle2.isEquilateral()) {
            System.out.println("Triangle 2 is Equilateral");
        } else {
            System.out.println("Triangle 2 is not Equilateral");
        }
    }
}
