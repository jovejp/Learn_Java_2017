package homework;

public class Case5 {
	static void score(int a) {
		String rank;
		if (a>=90){
			rank="A";
		}
			else if(a>=60) {
				rank="B";
		}
			else rank="C";
		System.out.print("³É¼¨Îª"+rank);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		score(89);
	}

}
