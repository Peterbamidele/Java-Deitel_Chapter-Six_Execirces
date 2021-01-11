public class ArrayMethod {

    public static void main(String[] args) {

        int [] awesomeArray = numArrayFromInts(3,4,5,6,2);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
        System.out.println(awesomeArray[3]);
        System.out.println(awesomeArray[4]);

    }

    private static int[] numArrayFromInts(int a, int b, int c, int d, int e) {
        int[] array = new int[5];
        array[0]= a;
        array[1]= b;
        array[2]= c;
        array[3]= d;
        array[4]= e;
        return array;
    }

}
