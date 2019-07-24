package com.jiumu.test;

import com.jiumu.entity.TestEntity;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test0() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestEntity te = (TestEntity)context.getBean("test");
        System.out.println(te.getId());
    }
}
