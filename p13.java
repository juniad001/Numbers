package numbers;

import java.util.Scanner;

//write a program to check whether a no is armstrong number
public class p13 {
public static void armstrong(int n) {
	int count = 0;
	int temp = n;
	//for counting 
	while(temp>0) {
		count++;
		temp = temp/10;
	}
	//for adding power and sum
	temp = n;
	int sum = 0;
	while(temp>0) {
		int rem = temp%10;
		int pow = 1;
		for(int i = 0;i<count;i++) {
			pow *= rem;
		}
		sum = sum + pow;
		temp = temp/10;
	}
	if(sum == n) System.out.println("armstrong number");
	else System.out.println("not an armstrong number");
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	armstrong(num);
	
}
}
