public class Circle extends Shape {
    private double radius = 0.0;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
