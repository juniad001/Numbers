package numbers;

import java.util.Scanner;

/*
//write a program to check whether a number is neon number
if a number is same after squaring and summing the squared number if it is same as 
the number then it is neon number*/
public class p14 {
	public static int neon(int n) {
		int square = n*n;
		int rem = 0;
		int sum = 0;
		for(int i = 0;i<square;i++) {
			rem = square % 10;
			sum = sum + rem;
			square = square/10;
		}
		if(sum == n) return 1;
		else return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(neon(num));
	}
}
