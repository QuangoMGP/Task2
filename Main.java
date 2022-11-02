import java.util.Arrays;

public class Main {

    public static String repeat(String s, int count) {
        StringBuilder repeatstring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < count; j++) {
                repeatstring.append(s.charAt(i));
            }
        }   
        return repeatstring.toString();
    }

    public static int differenceMaxMin(int [] array) {
        int min = 0;
        int max = 0;
        if (array.length <= 2) {
            return -1;
        }
        if (array[0] <= array[1]) {
            min = array[0];
            max = array[1];
        }
        else {
            min = array[1];
            max = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        return max - min;
    }

    public static boolean isAvgWhole(int [] array) {
        int sum = 0;
        if (array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum % array.length == 0;
    }

    public static int [] cumulativeSum(int [] array) {
        if (array.length >= 2){
            for (int i = 1; i < array.length; ++i) {
                array[i] += array[i-1];
                System.out.print(array[i-1] + ", ");
            }
            System.out.println(array[array.length - 1] + "\n");

        }
        return array;
    }

    public static int getDecimalPlaces(String s) {
        try {
            return s.split("\\.")[1].length();
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }

    public static int Fibonacci(int number) {
        int[] buff = {1, 1, 0};
        if (number > 2) {
            for (int i = 1; i < number; ++i) {
                buff[2] = buff[0] + buff[1];
                buff[0] = buff[1];
                buff[1] = buff[2];
            }
        }
        return buff[2];
    }

    public static boolean isValid(String postIndex) {
        return postIndex.matches("\\d{5}");
    }

    public static boolean isStrangePair(String string1, String string2) {
        if (string1.length() == 0 && string2.length() == 0) {
            return true;
        }
        return string1.charAt(0) == string2.charAt(string2.length() - 1) && string1.charAt(string1.length() - 1) == string2.charAt(0);
    }

    public static boolean isPrefix(String s, String prefix) {
        return s.startsWith(prefix.replace("-", ""));
    }

    public static boolean isSuffix(String s, String isSuffix) {
        return s.endsWith(isSuffix.replace("-", ""));
    }

    public static int boxSeq(int number) {
        return ((number + 1)/2)*3 - number/2;
    }

    public static void main(String[] args) {
        System.out.println("1.");
        System.out.println(repeat("mice", 5) + "\n");
        System.out.println("2.");
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}) + "\n");
        System.out.println("3.");
        System.out.println(isAvgWhole(new int[]{1, 3}) + "\n");
        System.out.println("4.");
        cumulativeSum(new int[]{1, 2, 3});
        System.out.println("5.");
        System.out.println(getDecimalPlaces("43.20") + "\n");
        System.out.println("6.");
        System.out.println(Fibonacci(3) + "\n");
        System.out.println("7.");
        System.out.println(isValid("59001") + "\n");
        System.out.println("8.");
        System.out.println(isStrangePair("ratio", "orator")  + "\n");
        System.out.println("9.");
        System.out.println(isPrefix("automation", "auto-")  + "\n");
        System.out.println("10.");
        System.out.println(boxSeq(0)  + "\n");

    }
}
