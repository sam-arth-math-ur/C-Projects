/* I am going to create rectangles and triangles in this main class
 * using the Rectangle and Triangle blueprints (those blueprints are
 * the class definitions).
 */

class ExampleClass {
    public static void main(String[] args) {
        //System.out.println("cccccc");
        //Scanner s = new Scanner(System.in);
        // words that start with capital letters are objects created by someone else
        // Prelimary info in this case is Rectangle, in previous projects it was Scanner
        Rectangle yard = new Rectangle(10, 20);     //created an object of type Rectangle called "yard"
        Rectangle brownie = new Rectangle(.01, .02); //created another object called "brownie"

        //can use or access public values but not private 
       
        System.out.println("My yard is " + yard.getWidth() + " feet wide.");
        System.out.println("My brownie is " + brownie.getHeight() + " feet tall.");
        System.out.println("The area of my yard is " + yard.getArea() + ".");

        yard.printInfo();
        brownie.printInfo();

        Triangle pyramid = new Triangle(3, 7);
        pyramid.printInfo();
        double twoBases = pyramid.getBase() + pyramid.getBase();
        System.out.println("Two bases added = " + twoBases);
    }
}