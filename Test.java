public class Test{
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.1);
        System.out.println("Area of Circle c2 is " + c2.getArea());
        System.out.println("Perimeter of Circle c2 is " + c2.getPerimeter());
        if (c1.compareTo(c2) == 0) {
            System.out.println("Circle c1 and c2 have equal coverage of area");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("Circle c1 has larger area than the circle c2");
        } else {
            System.out.println("Circle c1 has smaller area than the circle c2");
        }
        Circle c3 = c2.clone();
        if (c2.compareTo(c3) == 0) {
            System.out.println("Circle c2 and c3 have equal coverage of area");
        } else if (c2.compareTo(c3) > 0) {
            System.out.println("Circle c2 has larger area than the circle c3");
        } else {
            System.out.println("Circle c2 has smaller area than the circle c3");
        }
        System.out.println("Circle c3 -->" + c3);
        
        Circle o1 = new Circle();
        Circle o2 = new Circle(2.8);
        System.out.println("Area of Octagon o2 is " + o2.getArea());
        System.out.println("Perimeter of Octagon o2 is " + o2.getPerimeter());
        if (c1.compareTo(o2) == 0) {
            System.out.println("Octagon o1 and o2 have equal coverage of area");
        } else if (o1.compareTo(o2) > 0) {
            System.out.println("Octagon o1 has larger area than the Octagon o2");
        } else {
            System.out.println("Octagon o1 has smaller area than the Octagon o2");
        }
        Circle o3 = o2.clone();
        if (o2.compareTo(o3) == 0) {
            System.out.println("Octagon o2 and o3 have equal coverage of area");
        } else if (o2.compareTo(o3) > 0) {
            System.out.println("Octagon o2 has larger area than the Octagon o3");
        } else {
            System.out.println("Octagon o2 has smaller area than the Octagon o3");
        }

       
        
        Circle t1 = new Circle();
        Circle t2 = new Circle(5.2);
        System.out.println("Area of EquilateralTriangle t2 is " + t2.getArea());
        System.out.println("Perimeter of EquilateralTriangle t2 is " + t2.getPerimeter());
        if (t1.compareTo(t2) == 0) {
            System.out.println("EquilateralTriangle t1 and t2 have equal coverage of area");
        } else if (t1.compareTo(t2) > 0) {
            System.out.println("EquilateralTriangle t1 has larger area than the circle t2");
        } else {
            System.out.println("EquilateralTriangle t1 has smaller area than the circle t2");
        }
        Circle t3 = t2.clone();
        if (t2.compareTo(t3) == 0) {
            System.out.println("EquilateralTrianglele t2 and o3 have equal coverage of area");
        } else if (t2.compareTo(t3) > 0) {
            System.out.println("EquilateralTriangle t2 has larger area than the EquilateralTriangle t3");
        } else {
            System.out.println("EquilateralTriangle t2 has smaller area than the EquilateralTriangle t3");
        }

        
        
               
        
        }
    }



    
    


