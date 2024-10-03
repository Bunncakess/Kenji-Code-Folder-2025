public class AreaOfTriangle {

    public AreaOfTriangle() {
    }
    public void perimeter(int a, int b, int c){
        System.out.println("The perimeter of the triangle is: " + (a + b + c));
    }

    public void semiperimeter(int a, int b, int c){
        int s = (a + b + c) / 2;
        System.out.println("The semiperimeter of the triangle is: " + (s));
    }

    public void area(int a, int b, int c, int s){
        double areaOfTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + areaOfTriangle);
    }
}

