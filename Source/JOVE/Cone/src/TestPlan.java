import java.util.ArrayList;

public class TestPlan {
    String planID;
    ArrayList<TestCase> list1 = new ArrayList<TestCase>();

    public void addTestCase(TestCase case1) {
        list1.add(case1);
    }

    public void removeTestCase(TestCase case2) {
        list1.remove(case2);
    }

    public void execute() {
        list1.forEach((testCase3)->{
            testCase3.desc=planID + testCase3.desc;
            testCase3.execute();
        });
    }
}
