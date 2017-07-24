package homework;
import java.util.Scanner;

public class Case8 {
	static void xyz() {
		int sum=0;
		int temp=1;
		System.out.print("请输入一个数字：");
		Scanner shuZi = new Scanner(System.in);
		int a=shuZi.nextInt();
		
		System.out.print("请输入回数：");
		Scanner kaiSu = new Scanner(System.in);
		int b=kaiSu.nextInt();
		
		for(int i =1; i<=b; i++) {
			if (i==1) {
				temp=1;
			}
			else {
				temp = temp*10+1;
			}
			sum = a + a*temp;
		}
		System.out.print(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz();
	}

}
