/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab;

import java.util.Scanner;

/**
 *
 * @author Zhel
 */
public class MethodsLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1: Void method that greets the user
        greetuser();

        // Task 2: Ask for two numbers
        System.out.print("\nEnter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));

        if (b != 0) {
            System.out.println("Division: " + divide(a, b));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Task 3: Factorial
        System.out.print("\nEnter a number for factorial: ");
        int n = input.nextInt();

        if (n >= 0 && n <= 20) {
            System.out.println("Factorial: " + factorial(n));
        } else {
            System.out.println("Please enter a number from 0 to 20.");
        }

        // Task 4: Sum of array elements
        int[] numbers = {10, 15, 20, 12, 18};
        System.out.println("\nSum of array elements: " + sumArray(numbers));

        // Task 5: Check if a number is prime
        System.out.print("\nEnter a number to check prime: ");
        int prime = input.nextInt();

        if (isPrime(prime)) {
            System.out.println(prime + " is prime.");
        } else {
            System.out.println(prime + " is not prime.");
        }

        // Task 6: Find the largest element in an array
        System.out.println("\nLargest element: " + maxInArray(numbers));

        // Task 7: Find GCD and LCM
        System.out.print("\nEnter two positive integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("GCD: " + gcd(num1, num2));
            System.out.println("LCM: " + lcm(num1, num2));
        } else {
            System.out.println("Please enter positive integers.");
        }

        // Challenge 1: Recursive factorial
        System.out.print("\nEnter a number for recursive factorial: ");
        int recursiveNum = input.nextInt();

        if (recursiveNum >= 0 && recursiveNum <= 20) {
            System.out.println("Recursive Factorial: " + recursiveFactorial(recursiveNum));
        } else {
            System.out.println("Please enter a number from 0 to 20.");
        }

        // Challenge 2: Fibonacci
        System.out.print("\nEnter a number for Fibonacci: ");
        int fibNum = input.nextInt();

        if (fibNum >= 0 && fibNum <= 40) {
            System.out.println("Fibonacci: " + fib(fibNum));
        } else {
            System.out.println("Please enter a number from 0 to 40.");
        }

        // Challenge 3: Check palindrome
        input.nextLine();

        System.out.print("\nEnter a word to check palindrome: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        input.close();
    }

    // Task 1: Void method that greets the user
    static void greetuser() {
        System.out.println("Hello user! Welcome!");
    }

    // Task 2: Arithmetic methods
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    // Task 3: Factorial using a loop
    static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Task 4: Sum of array elements
    static int sumArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    // Task 5: Check if a number is prime
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Task 6: Find the largest element in an array
    static int maxInArray(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    // Task 7: Find the greatest common divisor
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Task 7: Find the least common multiple
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // Challenge 1: Recursive factorial
    static long recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    // Challenge 2: Recursive Fibonacci
    static long fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // Challenge 3: Check if a word is a palindrome
    static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
