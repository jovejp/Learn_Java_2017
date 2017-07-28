package close;

public class BancaP1 {
	static void createTestCase(int m){
			for(int i=1;i<=m;i++) {
				TestCase TC = new TestCase();
				TC.caseID="TC-"+i;
				TC.desc="This is "+TC.caseID;
			} 
		}
	static void createTestScenario(int n){
			for(int k=1;k<=n;k++) {
				TestScenario TS = new TestScenario();
				TS.scenarioID="TS-"+k;
				TS.desc="This is "+TS.scenarioID;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createTestCase(100);
		createTestScenario(10);
		//TBD
	}

}
