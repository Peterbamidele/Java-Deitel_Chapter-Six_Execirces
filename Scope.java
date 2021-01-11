public class Scope {
    public static int x =1; // field that is accessible to all methods of this class

    public static void main(String[] args) {
        int x = 5;// method,s local variables x shadow filed x

        System.out.printf("local x in main is %d%n", x);

        useLocalVarible();
        useField();
        useLocalVarible();
        useField();

        System.out.printf("%n local x in main is %d%n", x);

    }

    // create and initialize local variable x during each call
    private static void useLocalVarible() {
        int x = 25; // initialized each time uselocalVariable is called

        System.out.printf("%nlocal x on entering method useLocalVariables is %d%n", x);

        ++x;// modifies  the method's local variables x

        System.out.printf("local x before exiting method useLocalVariables is %d%n", x);
    }


    // modify class Scope's filed x during each call
    private static void useField() {

        System.out.printf("%nfield x on entering method useField is %d%n", x);

        x*=10; // modifies class Scope's field x

        System.out.printf(
                "field x before exiting method useField is %d%n", x
        );
    }


}
