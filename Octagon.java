public class Octagon extends GeometricObject implements Comparable, Cloneable { 

    private double side;
    public Octagon() {
        this.side = 1.0;
    }
    public Octagon(double side) {
        this.side = side;
    }
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }
    public double getPerimeter() {
        return 8 * side;
    }
        public int compareTo(Object obj) {
        if (this.getArea() > ((Circle) obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((Circle) obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
        
        
        
    }
}

