package com.qatestlab.utils;




import jxl.*;
import org.testng.annotations.DataProvider;

import java.io.File;

public class StaticProvider {
//    @DataProvider(name = "person1")
//    public static Object[][] createData1() {
//        return new Object[][]{
//                {"qa3905test", "password!"}
//        };
//    }
//    @DataProvider(name = "person2")
//    public static Object[][] createData2() {
//        return new Object[][]{
//                {"qa3907test_", "password!"}
//        };
//    }
//    @DataProvider(name = "person3")
//    public static Object[][] createData3() {
//        return new Object[][]{
//                {"aleksandr_aleksandrov_ff", "123456"}
//        };
//    }
//
//    @DataProvider(name = "personQuestions1")
//    public static Object[][] createData4() {
//        return new Object[][]{
//                {"qa3905test", "password!"}
//        };
//    }
//
//    @DataProvider(name = "personQuestions2")
//    public static Object[][] createData5() {
//        return new Object[][]{
//                {"qa3906test", "password!"}
//        };
//    }

    @DataProvider(name = "person1")
    public static Object[][] createData1() throws Exception{
        return getTableArray("D:\\Projects\\WebDriverTests\\Base_v2\\config\\data\\DataPool-Askfm.xls",
                "DataPool", "person1");
    }
    @DataProvider(name = "person2")
    public static Object[][] createData2() throws Exception{
        return getTableArray("D:\\Projects\\WebDriverTests\\Base_v2\\config\\data\\DataPool-Askfm.xls",
                "DataPool", "person2");
    }
    @DataProvider(name = "person3")
    public static Object[][] createData3() throws Exception{
        return getTableArray("D:\\Projects\\WebDriverTests\\Base_v2\\config\\data\\DataPool-Askfm.xls",
                "DataPool", "person3");
    }
    @DataProvider(name = "personQuestions1")
    public static Object[][] createData4() throws Exception{
        return getTableArray("D:\\Projects\\WebDriverTests\\Base_v2\\config\\data\\DataPool-Askfm.xls",
                "DataPool", "personQuestions1");
    }
    @DataProvider(name = "personQuestions2")
    public static Object[][] createData5() throws Exception{
        return getTableArray("D:\\Projects\\WebDriverTests\\Base_v2\\config\\data\\DataPool-Askfm.xls",
                "DataPool", "personQuestions2");
    }

    public static String[][] getTableArray(String xlFilePath, String sheetName, String tableName){
        String[][] tabArray=null;
        try{
            Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
            Sheet sheet = workbook.getSheet(sheetName);
            int startRow,startCol, endRow, endCol,ci,cj;
            Cell tableStart=sheet.findCell(tableName);
            startRow=tableStart.getRow();
            startCol=tableStart.getColumn();

            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);

            endRow=tableEnd.getRow();
            endCol=tableEnd.getColumn();
            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                    "startCol="+startCol+", endCol="+endCol);
            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
            ci=0;

            for (int i=startRow+1;i<endRow;i++,ci++){
                cj=0;
                for (int j=startCol+1;j<endCol;j++,cj++){
                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
                }
            }
        }
        catch (Exception e)    {
            System.out.println(e);
            System.out.println("**********************************");
            System.out.println(e.fillInStackTrace());
            System.out.println("**********************************");
            System.out.println(e.getStackTrace());
            System.out.println("**********************************");
            System.out.println("error in getTableArray()");
        }

        return(tabArray);
    }
}
