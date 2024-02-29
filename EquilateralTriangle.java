  public class EquilateralTriangle extends GeometricObject implements Comparable, Cloneable  {
    
     private double side;
  
  public double getArea() {
       return(Math.sqrt(3)/4)*side;
    }//area
    @Override
    public double getPerimeter() {
        return 3*side;
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
 
