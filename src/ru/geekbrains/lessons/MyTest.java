package ru.geekbrains.lessons;

public class MyTest {

    @BeforeSuite
    public static void test3(){
        System.out.println("test3 BeforeSuite");
    }

    @Test
    public static void test1(){
        System.out.println("test1 Test");
    }

    @Test
    public static void test9(){
        System.out.println("test9 Test");
    }

    @Test(priority = 1)
    public static void test5(){
        System.out.println("test5 priority = 1");
    }

    @Test(priority = 6)
    public static void test4(){
        System.out.println("test4 priority = 6");
    }

    @AfterSuite
    public static void test2(){
        System.out.println("test2 AfterSuite");
    }
}
