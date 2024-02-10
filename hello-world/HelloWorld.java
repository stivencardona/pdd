class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Point p1 = new Point();
        Point p2 = new Point(4.0, 3.0);

        double distance = p2.distance(p1);
        System.out.println("Distance between p1 and p2 equal to: " + distance);
    }
}