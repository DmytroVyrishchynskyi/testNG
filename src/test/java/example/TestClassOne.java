import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassOne {
    @BeforeMethod(groups = "setupGroup")
    public void setupGroupMethod() {
        System.out.println("Setup for test group");
    }

    @AfterMethod(groups = "teardownGroup", enabled = false)
    public void excludedTeardownMethod() {
        System.out.println("Teardown for test group (excluded)");
    }

    @Test(groups = "group1")
    public void testMethod1() {
        System.out.println("Executing test method 1");
    }

    @Test(groups = "group2")
    public void testMethod2() {
        System.out.println("Executing test method 2");
    }
}
