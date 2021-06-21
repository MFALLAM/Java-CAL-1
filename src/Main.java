import java.time.Year;

public class Main {

    public int myInt = 3;
    public short myShot = 122;
    public long myLong = 120L;
    public float myFloat = 12.2f;
    public double myDouble = 121.45d;
    public char myChar = '\u1223';
    public boolean myBoolean = true;

    public static void main(String[] params) {
        System.out.println("Total is --> " + calculate(5.1f, 0.8f, 1.2f, 3.4f));
        System.out.println("Status is --> " + checkSum(11 , 12));
        isTrueOrFalse(-1);

        boolean check = isNegative(3);
        System.out.println(check);

        System.out.println(helloThere("Mohammed"));
    }

    /**
     * Calculate simple passed arguments and return int result
     *
     * @param int a
     * @param int b
     * @param int c
     * @param int d
     * @return int
     */
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /**
     * Check the sum of two inputs, return true otherwise return false
     *
     * @param int a
     * @param int b
     * @return boolean
     */
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20) ? true : false;
    }

    /**
     * Check condition return true or false
     * @param int number
     * @param number
     * @return string
     */
    public static void isTrueOrFalse(int number) {
        if(number >= 0) {
            System.out.println("Number is positive " + number);
        } else {
            System.out.println("Number is negative " + number);
        }
    }

    /**
     * Returns true or false based on param given
     * @param int number
     * @return boolean
     */
    public static boolean isNegative(int number) {
        return number >= 0 ? true : false;
    }

    /**
     * Say hello to yourself
     * @param String name
     * @return string
     */
    public static String helloThere(String name) {
        return "Hello there! .." + name;
    }

    /**
     * Check if the year is leap
     * @param int year
     * @return void
     */
    public static void isLeapYear(int year) {
        // https://docs.oracle.com/javase/tutorial/datetime/iso/date.html
        boolean validLeapYear = Year.of(y).isLeap();
        if(!validLeapYear) {
            System.out.println("Year " + y + " is not a leap year");
        } else {
            System.out.println("Year " + y + " is a leap year");
        }
    }
}
