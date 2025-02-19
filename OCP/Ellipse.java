public class Ellipse extends Shape{
    private double semimajor_Axis = 0;
    private double semiminor_Axis = 0;
    Ellipse(double semimajor_Axis,double semiminor_Axis){
        this.semimajor_Axis = semimajor_Axis;
        this.semiminor_Axis = semiminor_Axis;
    }
    public double calculateArea() {
        return Math.PI * this.semimajor_Axis * this.semiminor_Axis;
    }
}
