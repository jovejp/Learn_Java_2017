package homework;

/*设两数为a、b(b<a)，求它们最大公约数(a、b)的步骤如下：用a/b，得a/b=q......r1(0≤r)。
 * 若r1=0，则(a，b)=b；
 * 若r1≠0，则再用b/r1，得b/r1=q......r2 (0≤r2).
 * 若r2=0，则(a，b)=r1，
 * 若r2≠0，
 * 则继续用r1/r2,……如此下去，直到能整除为止。其最后一个非零余数即为(a，b)。
 */
public class Case6 {
	static void gongYueShu(int a,int b) {
		int gys = 0;
		if(a<b) {
			int t;
			t=b;
			b=a;
			a=t;
		}
		if(a%b==0) {
			gys=b;
		}
		while(a%b>0) {
			a=a%b;
			if(a<b) {
				int t;
				t=b;
				b=a;
				a=t;
			}
			if(a%b==0) {
				gys=b;
			}
		}
				
	System.out.print(gys);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gongYueShu(32,84);
	}

}
