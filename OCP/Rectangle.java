public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;
    Rectangle(double width,double height){
        this.width  = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
