package numbers;
//wap to check the year is leap or not
public class p29 {
	public static int islp(int year) {
		if(year%400 == 0 || year%4==0 && year%100!=0) {
			return 1;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		System.out.println(islp(2002));
		System.out.println(islp(2000));
	}
}
