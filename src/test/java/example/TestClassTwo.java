import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

    @Test
    @Parameters({"param1", "param2"})
    public void testWithParametersFromXML(@Optional("default1") String param1, @Optional("default2") String param2) {
        System.out.println("Param1: " + param1 + ", Param2: " + param2);
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testWithDataProvider(String data1, int data2) {
        System.out.println("Data1: " + data1 + ", Data2: " + data2);
    }

    @org.testng.annotations.DataProvider
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                {"DataA", 1},
                {"DataB", 2},
        };
    }
}