import com.sun.jdi.PathSearchingVirtualMachine;
import com.sun.security.jgss.GSSUtil;

public class Multiply_Nums {
    public static void main(String[] args) {
        welcome();
        multiply(5,23);
        multiply(4,5);
        multiply(6,89);
        divide(200,20);
        add(66 , 23);
        sub(75,34);



    }

    public static void welcome() {
        System.out.println("welcome to my Calculator");
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }

    public static void divide(int a, int b) {
        System.out.println(a/b);

    }

    public static void add(int a, int b) {
        System.out.println(a+b);

    }

    public static void sub(int a, int b) {
        System.out.println(a - b);

    }

}
