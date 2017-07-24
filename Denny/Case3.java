package homework;

public class Case3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a=1;a<=9;a++) {
			for (int b=1;b<=9;b++) {
				for (int c=1;c<=9;c++) {
					if (a*a*a+b*b*b+c*c*c == a*100+b*10+c) {
						System.out.println(a*100+b*10+c);
					}
					}
				}
			}
		}
}
