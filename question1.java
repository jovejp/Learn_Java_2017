package homework;

public class question1 {

	public static void main(String argus[]) {
		//print rabbit number
		System.out.println(totalRabbit(10));
	}
	
	public static long totalRabbit(int month) {
		//total rabbit 总兔子对数
		long totalRabbitCount = 0;
		//rabbit count that can give birth 能生的兔子对数
		long canGiveBirth = 0;
		//rabbit count that left 1 month can give birth 还剩一个月能生的兔子对数
		long oneMonth = 0;
		//rabbit count that left 2 months can give birth 还剩两个月才能生的兔子对数
		long twoMonth = 1;
		
		for (int i = 1; i <= month; i++) {
			if(i>1) {
				//这个月能生的兔子对数 = 上个月能生的兔子对数 + 上个月还剩一个月能生的兔子对数
			    canGiveBirth = canGiveBirth + oneMonth;
			    //这个月还剩一个月能生的兔子对数 = 上个月还剩两个月能生的兔子对数
			    oneMonth = twoMonth;
			    //这个月还剩两个月能生的兔子对数 = 上个月能生的兔子对数 + 上个月还剩一个月能生的兔子对数 = 这个月能生的兔子对数
			    twoMonth = canGiveBirth;
			    }
			    //这个月
			    //总兔子对数 = 能生兔子对数 + 还剩一个月能生兔子对数 + 还剩两个月能生兔子对数
				totalRabbitCount = canGiveBirth + oneMonth + twoMonth;
				System.out.println(i + "th month, " + "total rabbit count is " + totalRabbitCount);
		}
		return totalRabbitCount;	
		}
	}

