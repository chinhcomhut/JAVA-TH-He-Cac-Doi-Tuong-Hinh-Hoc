public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", true);
        System.out.println(shape);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,6.4,"orange",true);
        System.out.println(rectangle);
        double area = rectangle.getArea();
        System.out.println("Area is: "+area);
        double primeter = rectangle.getPerimeter();
        System.out.println("Primeter is: "+primeter);
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4,"Pink",true);
        System.out.println(circle);
        area = circle.getArea();
        System.out.println("Area is: "+area);
        primeter = circle.getPrimeter();
        System.out.println("Primeter is: "+primeter);
    }
}
