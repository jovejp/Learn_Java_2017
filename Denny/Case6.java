package homework;

/*������Ϊa��b(b<a)�����������Լ��(a��b)�Ĳ������£���a/b����a/b=q......r1(0��r)��
 * ��r1=0����(a��b)=b��
 * ��r1��0��������b/r1����b/r1=q......r2 (0��r2).
 * ��r2=0����(a��b)=r1��
 * ��r2��0��
 * �������r1/r2,���������ȥ��ֱ��������Ϊֹ�������һ������������Ϊ(a��b)��
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
