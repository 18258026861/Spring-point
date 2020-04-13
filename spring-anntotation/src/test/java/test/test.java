package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import person.Person;
import person.pet.Cat;
import person.pet.Dog;

/**
 * @author YZY
 * @date 2020/4/12 - 20:58
 */
public class test {

    @Test
            public void te(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = applicationContext.getBean("person", Person.class);
        Cat cat = applicationContext.getBean("cat",Cat.class);
        cat.setName("mwm");
        Dog dog = applicationContext.getBean("dog", Dog.class);
        dog.setName("wmw");
//        person.setName("yy");

        person.shout();
    }
}
