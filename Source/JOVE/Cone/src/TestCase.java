public class TestCase extends TestScenario {
    String caseId;
    boolean result = false;
    String testPlan;

    @Override
    public void execute() {
        super.execute();
        result = true;
    }
}
