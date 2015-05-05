package com.qatestlab.utils;



import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "person1")
    public static Object[][] createData1() {
        return new Object[][]{
                {"qa3905test", "password!"}
        };
    }
    @DataProvider(name = "person2")
    public static Object[][] createData2() {
        return new Object[][]{
                {"qa3907test_", "password!"}
        };
    }
    @DataProvider(name = "person3")
    public static Object[][] createData3() {
        return new Object[][]{
                {"aleksandr_aleksandrov_ff", "123456"}
        };
    }

    @DataProvider(name = "personQuestions1")
    public static Object[][] createData4() {
        return new Object[][]{
                {"qa3905test", "password!"}
        };
    }

    @DataProvider(name = "personQuestions2")
    public static Object[][] createData5() {
        return new Object[][]{
                {"qa3906test", "password!"}
        };
    }


}
