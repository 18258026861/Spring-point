package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author YZY
 * @date 2020/3/31 - 11:09
 */
//等价于<bean id="person" class="entity.Person">
//    @Component 组件，
@Component
public class Person {

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;

    @Value("YZY")
    private String name;


    public void shout(){
        dog.shou();
        cat.shout();
    }
    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
