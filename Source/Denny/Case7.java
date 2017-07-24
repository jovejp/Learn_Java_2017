package homework;

public class Case7 {

	static void count(String abc) {
		int alpha=0;
		int num=0;
		int blank=0;
		int other=0;
		char[] xyz = abc.toCharArray();
		if(abc != "") {
			for(int i =0;i<abc.length();i++)	{
				if (Character.isAlphabetic(xyz[i])) {
					alpha++;
				}
				else if(Character.isDigit(xyz[i])) {
					num++;
				}
				else if(Character.isSpaceChar(xyz[i])) {
					blank++;
				}
				else other++;
			}
		}
		System.out.println("alpha="+alpha);
		System.out.println("num="+num);
		System.out.println("blank="+blank);
		System.out.println("other="+other);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count("yv bg 879");
	}

}
