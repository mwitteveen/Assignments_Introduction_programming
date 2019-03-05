/**
 * @AUTOR: MARTIJN WITTEVEEN
 * @DESC: WEEK 1
 */
import java.io.NotActiveException;
import java.lang.Math;
import java.util.Scanner;

public class Week_1 {

    public static void main(String[] args) {
        System.out.println("\n" + "Assignment 1:\n" + "");
        hello_world();

        System.out.println("\n" + "Assignment 2:\n" + "");
        write_name();

        System.out.println("\n" + "Assignment 3:\n" + "");
        show_faculty(20);

        System.out.println("\n" + "Assignment 4:\n" + "");
        float_and_integer_test();

        System.out.println("\n" + "Assignment 5:\n" + "");
        //ask_input_and_print();

        System.out.println("\n" + "Assignment 6:\n" + "");
        loop_excercise();
    }

    //print out hello world
    private static void hello_world(){
        System.out.println("Hello World");
    }

    //fancy name print
    private static void write_name(){
        System.out.println("---------------------\n" +
                            "|                   |\n"+
                            "| Martijn Witteveen |\n" +
                            "|                   |\n" +
                            "---------------------");
    }

    /**
     * @DESC: SHOW A FACULTY CALCULATION
     * @PARAM: THE TERM FOR WHICH THE FACULTY HAS TO BE CALCULATED
     * @RETURN: PRINTS THE CALCULATIONS AS TEXT
     * @RETURN: PRINTS THE RESULT
     */
    private static void show_faculty(int Max){

        String text = "1";
        long calc = 1;
        for (int i=2; i <= Max; i++){
            text = text + " x " + i;
            calc = calc * i;
        }

        System.out.println("Result:\n" + text + " = " + calc);

    }

    //shows usage of the import-statement and math.round
    private static void float_and_integer_test(){

        //test 1
        System.out.println("Without round:\n" + "Result: " + 4.35 * 100);

        //test 2
        System.out.println("With round:\n" + "Result: " + Math.round(4.35 * 100));
    }

    private static void ask_input_and_print(){

        //startup scanner
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?: ");

        //ask name
        String name = in.nextLine();
        System.out.println("Hello " + name + "\n" + "I'm a JAVA program. \n" + "What'a your favorite food?");

        //aks food
        String food = in.nextLine();
        System.out.println("I like " + food + " too!!" );

    }

    private static void loop_excercise(){

        Double sum1,sum2,sum3;
        sum1 = sum2 = sum3 = .0;

        for (int i=1; i<=6; i++){
            sum1 =  sum1 + Math.pow(2,i);
            if (i >=4){
                sum2 = sum2 + Math.pow(i,2);
            }
            if (i<=4){
                sum3 = sum3 + Math.pow(i,3);
            }
        }

        System.out.println("Serie 1 result: " + sum1 + "\n" +
                "Serie 2 result: " + sum2 + "\n" +
                "Serie 3 result: " + sum3);
    }

    private static void very_hard_test(int number_of_products) {

        String[] products = new String[number_of_products - 1];
        Double[] prices = new Double[number_of_products - 1];

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            Boolean price_added = Boolean.FALSE;
            System.out.println("Please give the name of product " + i + ":");
            products[i - 1] = in.nextLine();

            System.out.println("What is the price of " + products[i - 1] + "?");
            do {
                try {
                    prices[i - 1] = Double.parseDouble(in.nextLine());
                    price_added = Boolean.TRUE; }
                catch (NumberFormatException e) {
                    System.out.println("Please enter a number:");
                }
            } while (!price_added);
        }

        System.out.println("Item list and prices:");
        for (int i=0;i<= number_of_products -1;i++){
            System.out.println(prices[i]);
        }
    }

}
