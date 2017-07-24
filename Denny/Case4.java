package homework;

public class Case4 {
	static void zhiYinShu(int m) {
		int first=2;
		while(first<=m) {
		if (m==first) {
			System.out.print(m);
			break;
			}
			else if(m%first==0) {
				System.out.print(first+"*");
				m=m/first;
			}
			else {
				first++;
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zhiYinShu(14);
	}

}
