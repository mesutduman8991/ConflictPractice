package day10_conditionals4;

import java.util.Scanner;

public class test {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Please enter a number");
	 int number =scan.nextInt();
	 if(number%3==0 && number%5==0) { // 15 divided 3 and 5 remainder 0
	System.out.println("FizzBuzz");
	 }else if(number%3==0) {
		 System.out.println("Fizz");
	 }else if(number%5==0) {
		 System.out.println("Buzzzzzzzzz");
	 }else {
		 System.out.println("please try again with Oguz");
		 System.out.println("please try again with Oguz");
	 }
 
}
}
