import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {
    @Test
    @Parameters({"param1", "param2"})
    public void testWithParametersFromXML(String param1, String param2) {
        System.out.println("Param1: " + param1 + ", Param2: " + param2);
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testWithDataProvider(String data1, int data2) {
        System.out.println("Data1: " + data1 + ", Data2: " + data2);
    }

    @DataProvider
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                {"DataA", 1},
                {"DataB", 2}
        };
    }
}
