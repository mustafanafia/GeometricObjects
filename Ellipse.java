// Complete all methods
// Add JavaDoc with explanations.
    public class Ellipse extends GeometricObject implements Eccentric, Comparable, Cloneable {
        double a, b;
        
    public Ellipse(double s1, double s2) {
    
    if(s1 < s2) {
        
        a = s2;
        b = s1;
  }
    else {

    a = s1;
    b = s2;
  }
}
    public double getPerimeter() {
        return(Math.PI)*(Math.sqrt(2*(Math.pow(a,2)+Math.pow(b,2)+((a-b)/2))));
    }//perimeter


    public double getArea() {
        return(Math.PI*a*b);
    }//area


   public double eccentricity() {

            double ans = 0;
            ans = Math.sqrt(a*a-b*b)/a;
            return ans;

}





    public String toString() {
        return "Ellipse = " + a + b;
    }
    
 


    public int compareTo(Object obj) {
        if (this.getArea() > ((Ellipse) obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((Ellipse) obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
        
}






