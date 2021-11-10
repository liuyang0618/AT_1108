package com.ly.testng;

import org.testng.annotations.Test;

@Test(groups = "test")
//类分组
public class TestNGTest {

    @Test(groups = "test1")
    //方法分组
    public void test1(){
        System.out.println("test1()方法执行了！");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    //方法依赖调用
    public void test2(){
        System.out.println("test2()方法执行了！");
    }

    @Test(dependsOnGroups = {"test1"})
    //组依赖调用
    public void test3(){
        System.out.println("test3()方法执行了！");
    }

    @Test()
    public void test4(){
        System.out.println("test4()方法执行了！");
    }

}
