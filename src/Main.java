import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

        System.out.println("Please enter the first number");
        int number1 = input.nextInt();
        System.out.println("Please enter the second number");
        int number2 = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
//        Test Data:
//        Input a number: 8 Expected
//        Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

        System.out.println("Please enter a number: ");
        number1 = input.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(number1 + " x " + i + " = " + (number1 * i));
        }

//        3. Write a Java program to print the area and perimeter of a circle.
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);


//        4. Java program to find out the average of a set of integers
//        Enter the count of numbers:
//        5
//        Enter an integer:
//        3
//        Enter an integer:
//        8
//        Enter an integer:
//        6
//        Enter an integer:
//        7
//        Enter an integer:
//        2
//        The average is: 5.2

        System.out.println("Enter the count of numbers");
        number1 = input.nextInt();
        int sum = 0;

        for (int i=1; i <= number1; i++) {
            System.out.println("Enter an integer: ");
            number2 = input.nextInt();
            sum += number2;
        }
        int average = sum / number1;
        System.out.println("The average is: " + average);


//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.
//        Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//                --------
//        Input the first number : 10
//        Input the second number: 20
//        Input the third number : 25
//        The result is: false

        System.out.println("Please enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        number2 = input.nextInt();
        System.out.println("Please enter the third number: ");
        int number3 = input.nextInt();

        sum = number1 + number2;
        System.out.println("the number is: " + number1 +
                "\nthe second number is: " + number2 +
                "\nthe third number is: " + number3 +
                "\nthe result is: " + (sum == number3));


//        6. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd

        System.out.println("Please enter a word: ");
        String word = input.next();
        String reverse = "";
        char w;
        for (int i=0; i < word.length(); i++) {
            w = word.charAt(i);
            reverse = w + reverse;
        }
        System.out.println("Reverse word: " + reverse);


//        7 - Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even

        System.out.println("Please enter a number: ");
        number1 = input.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("The number is Even");
        } else System.out.println("The number is Odd");


//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        Enter temperature in Centigrade:
//        43
//        Temperature in Fahrenheit is: 109.4

        System.out.println("Enter temperature in Centigrade: ");
        double temp = input.nextDouble();

        double Fahrenheit = (temp * 9 / 5 ) + 32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);


//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//        Test Data:
//        Input a string: Java Bootcamp
//        Input a number: 1
//        Expected Output:
//        a

        System.out.println("Enter a string: ");
        word = input.next();
        input.nextLine();
        System.out.println("Enter a number: ");
        number1 = input.nextInt();

        char l = word.charAt(number1);
        System.out.println(l);

//        10. Write a Java program to print the area and perimeter of a rectangle.
//                Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20

        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        System.out.println("Enter the width: ");
        double width = input.nextDouble();

        area = width * height;
        perimeter = 2 * (height + width);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);


//        11. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//        25 != 39
//        25 < 39
//        25 <= 39

        System.out.println("enter first number");
        number1 = input.nextInt();
        System.out.println("enter second number");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.println(number1 + " == " + number2);
        } else {
            if (number1 > number2) {
                System.out.println(number1 + " > " + number2);
            } else {
                System.out.println(number1 + " < " + number2);
            }


            if (number1 >= number2) {
                System.out.println(number1 + " >= " + number2);
            }
            if (number1 <= number2) {
                System.out.println(number1 + " <= " + number2);
            }
            if (number1 != number2) {
                System.out.println(number1 + " != " + number2);
            }
        }

//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59

        System.out.println("Enter milliseconds: ");
        number1 = input.nextInt();

        int hour = number1 / 3600;
        int seconds = number1 % 3600;
        int minute = seconds / 60;
        int second = seconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);


//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//                Sample Output:
//        Input first number: 25
//        Input second number: 37
//        Input third number: 45
//        Input fourth number: 23
//        Numbers are not equal!

        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        System.out.println("Enter the third number: ");
        number3 = input.nextInt();
        System.out.println("Enter the fourth number: ");
        int number4 = input.nextInt();

        if (number1 == number2 && number2 == number3 && number3 == number4) {
            System.out.println("Numbers are equal!");
        } else System.out.println("Numbers are not equal!");


//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive
//        Test Data Input a number: 7 Expected Output :
//        Number is positive

        System.out.println("Enter a number: ");
        number1 = input.nextInt();

        if (number1 == 0) {
            System.out.println("Number is zero");
        } else if (number1 > 0) {
            System.out.println("Number is positive");
        } else if (number1 < 0 ) {
            System.out.println("Number is negative");
        }


//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).
//                Test data
//        1
//        3
//        0
//        -2
//        -4
//        -1
//        2 positives
//        1 zero
//        2 negatives

        int pos_count =0;
        int neg_count =0;
        int zero_count =0;

        do {
            System.out.println("Enter a number or \"-1\" to quit: ");
            number1 = input.nextInt();

            if (number1 == -1) {
                break;
            }

            if (number1 == 0) {
                zero_count += 1;
            } else if (number1 > 0) {
                pos_count += 1;
            } else {
                neg_count += 1;
            }

        } while (true);

        System.out.println(pos_count + "positive");
        System.out.println(zero_count + "zero");
        System.out.println(neg_count + "negaitve");




//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
//                For example, if the input is 12345, the output should be 54321.

        System.out.println("Enter a number: ");
        number1 = input.nextInt();
        int num_reverse = 0;


        while (number1 != 0) {
            int reminder = number1 % 10;
            num_reverse = num_reverse * 10 + reminder;
            number1 /= 10;
        }
        System.out.println(num_reverse);


//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//                enter the number : 4
//        enter the number : 5
//        enter the number : -1
//        enter the number : 9
//        the large number : 9
//        the small number : -1

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {

            System.out.println("Enter a number or \"0\" to quit");
            number1 = input.nextInt();

            if (number1 == 0) {
                break;
            }
            if (number1 < min) {
                min = number1;
            }
            if (number1 > max) {
                max = number1;
            }

        } while (true);

        System.out.println("The large number: " + max);
        System.out.println("The small number: " + min);

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.
//        Enter String:
//        Java bootcamp
//        Output: Number of a's: 3

        input.nextLine();
        System.out.println("Enter a string: ");
        word = input.nextLine();
        int count = 0;

        for (int i=0; i < word.length(); i++) {
           if (word.charAt(i) == 'a'){
               count += 1;
           }
        }
        System.out.println("Number of a's: " + count);


    }
}