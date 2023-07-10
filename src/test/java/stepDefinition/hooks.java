package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    //like "breakdown" keyword in feature, but it's running before every scenario for desired tag
    //it's recommended to use either hooks or "breakdown" keyword
    @Before("@SmokeTest")
    public static void BeforeSmokeTest(){

        System.out.println("hook BeforeSmokeTest");

    }

    @Before("@RegressionTest")
    public static void BeforeRegressionTest(){

        System.out.println("hook BeforeRegressionTest");

    }

    @After("@RegressionTest")
    public static void AfterRegressionTest(){

        System.out.println("hook AfterRegressionTest");

    }

}
