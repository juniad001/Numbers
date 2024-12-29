package numbers;

import java.util.Scanner;

//write a program to check the emirp no or not
public class p19 {
	//checking the no is prime or not
	public static boolean prime(int n) {
		boolean flag = true;
		for(int i = 2;i<=n/2;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	//reversing a number
	public static int rev(int n) {
		int temp = n;
		int rem  = 0;
		int rev = 0;
		while(temp>0) {
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		return rev;
	}
	//checking if reversed number is prime or not if prime 
	//then it is emirp no
	public static void emirp(int n) {
		if(prime(n)) {
			if(prime(rev(n))) {
				System.out.println(n+" Emirp no");
			}else {
				System.out.println(n+" Not a Emirp no");
			}
		}else {
			System.out.println(n+" Not a Emirp no");
		}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check");
		int num = sc.nextInt();
		emirp(num);
	}

}
