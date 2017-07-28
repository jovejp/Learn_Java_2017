public class BancaP1 {
     public static void main(String[] args) {
        TestPlan p1 = new TestPlan();
        p1.planID="regional bank";
        TestScenario[] scenario = new TestScenario[10];
        for(int i=0;i<10;i++) {
            scenario[i] = new TestScenario();
            scenario[i].reqId = "reqID" + i;
            scenario[i].scenarioID = "scenarioID" + i;
            scenario[i].desc = "scenario desc" + i;
        }

        TestCase[] cases = new TestCase[100];
        for(int i=0;i<100;i++) {
            cases[i] = new TestCase();
            cases[i].caseId = "case" + i;
            cases[i].scenarioID = "scenarioID" + i%10;
            cases[i].desc = "scenario desc" + i;
            p1.addTestCase(cases[i]);
        }

        for(int i=0;i<5;i++) {
            p1.removeTestCase(cases[i]);
        }

        p1.execute();
    }

}
