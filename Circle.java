public class Circle extends Ellipse implements Comparable, Cloneable { 
    private double radius; 
    
    public Circle() {
        super(1.0,1.0);
    }
    public Circle(double radius) {
        super(radius,radius);
        System.out.println("This is a circle with Radius or " + radius);
        this.radius=radius;
    }
    
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius=radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    
    public String toString() {
        return "[Circle] radius = " + radius;
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

    
    public boolean equals(Object obj) {
        return this.radius == ((Circle) obj).radius;
    }

    
    public Circle clone() { //
        try {
            
            System.out.println("YESS>>");

            return (Circle) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
  }


