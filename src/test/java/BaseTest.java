import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup() {
        System.out.println("Setup method executed");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Teardown method executed");
    }
}
