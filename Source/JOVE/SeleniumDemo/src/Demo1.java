import com.jove.testing.model.CommonData;
import com.jove.testing.steps.CommonFunctions;

		
public class Demo1 {

	public static void main(String[] args) {

		CommonData data1 = new CommonData();
		//load data from excel		
		//todo set data to data class
		data1.url ="https://ap2.salesforce.com";
		
		//load keyword from excel
		// todo call keyword
		CommonFunctions.init(data1);
		CommonFunctions.login(data1);
		
		
	}
}
