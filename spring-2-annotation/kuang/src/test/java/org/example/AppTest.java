package org.example;

import static org.junit.Assert.assertTrue;
import entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean.xml");
        Person person = applicationContext1.getBean("person",Person.class);
        person.shout();
        System.out.println(person.toString());
    }
}
