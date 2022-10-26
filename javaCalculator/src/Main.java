import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.println("What operation? ('+', '-', '*', '/')");
        System.out.println(" Enter 1 for Addition");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplication");
        System.out.println(" Enter 4 for Division");
        System.out.println(" Enter 5 to Square a Number");
        int menuChoice = input.nextInt();
        System.out.println("Enter your first number:");
        int firstNumber=input.nextInt();
        if(menuChoice !=5) {
            System.out.println("Enter your second number");
            int secondNumber = input.nextInt();
            System.out.println("Your answer is: ");
            calc.calc(menuChoice, firstNumber, secondNumber);
        }
        else{
            System.out.println("Your answer is: ");
            calc.calc(menuChoice, firstNumber,null);
        }
    }
    }
