package homework;

public class Case1 {

	int m;
		// TODO Auto-generated method stub
	static	int sum(int m) {
			if(m==1) 
				return 1;
			else if(m==2) 
				return 1;
			else
				return sum(m-1) + sum(m-2);
		}
				

public static void main(String[] args) {
	System.out.print(sum(8));
}

}
