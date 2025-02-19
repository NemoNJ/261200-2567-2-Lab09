public class Main {
    public static void main(String[] args) {
        AreaCalculator area = new AreaCalculator();
        Shape rect = new Rectangle(2,3);
        Shape circle = new Circle(2);
        Shape ellipse = new Ellipse(2,3);
        System.out.println("Rectangle Area : "+ area.calculateArea(rect)+" mm^2. ");
        System.out.println("Circle    Area : "+area.calculateArea(circle)+" mm^2. ");
        System.out.println("Ellipse   Area : "+area.calculateArea(ellipse)+" mm^2. ");
    }
}
