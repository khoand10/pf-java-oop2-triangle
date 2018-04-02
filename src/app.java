public class app {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red",4,5,7);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}
