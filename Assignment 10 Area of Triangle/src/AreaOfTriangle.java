public class AreaOfTriangle {

    public AreaOfTriangle() {
    }
    public void perimeter(double a, double b, double c){
        System.out.println("The perimeter of the triangle is: " + (a + b + c));
    }

    public void area(double a, double b, double c){
        double s = (a + b + c) / 2;
        double areaOfTriangle = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
        System.out.println("The area of the triangle is: " + (double) areaOfTriangle);
    }
    
}

