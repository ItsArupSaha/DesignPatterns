import java.text.DecimalFormat;

public class Main {

    private static final DecimalFormat decFor = new DecimalFormat("0.0000");

    public static void main(String[] args) {

        Circle cir = new Circle(3.0);
        Rectangle rec = new Rectangle(5.5, 6.7);

        System.out.println("The area of the circle is: "+decFor.format(cir.calculateArea()));
        System.out.println("The area of the rectangle is: "+rec.calculateArea());
    }
}