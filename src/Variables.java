import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Variables {
    public static void main(String[] args){
//        Primitive Types
        int age = 30;
        System.out.println("int: " + age);

        double price = 33.22;
        System.out.println("double: " + price);

        float floatNumber = 33.22F;
        System.out.println("float: " + floatNumber);

        byte small = 99;
        System.out.println("byte: " + small);

        long hugeNumber = 3213123123123L;
        System.out.println("long: " + hugeNumber);

        char character = 'd';
        System.out.println("char: " + character);

        boolean trueFalse = true;
        System.out.println("boolean: " + trueFalse);

//        Reference Types
        String word = "Word";
        System.out.println("String: " + word);

        Date someDate = new Date();
        System.out.println("Date: " + someDate);

        long timestamp = someDate.getTime();
        System.out.println("long Timestamp: " + timestamp);

//        Memory reference
        Point point1 = new Point(1,2);
        Point point2 = point1;

        point1.x = 23;
        System.out.println(point1);
        System.out.println(point2);

//        Strings
        String message = "Message in a \"bottle";
        System.out.println(message.length());

        System.out.println(message.indexOf('e'));
        System.out.println(message.replace('s', 'b'));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.compareTo("test"));

//        Arrays
        // An array can be initialised as int[] numbers = { 1,2,3,4,4,5,1 }
        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = 123;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // multidimensional arrays
        int[][] mtNumbers = new int[6][8];
        mtNumbers[3][4] = 12;

        System.out.println(Arrays.deepToString(mtNumbers));
    }
}
