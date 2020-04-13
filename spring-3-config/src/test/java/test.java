import entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author YZY
 * @date 2020/4/13 - 14:13
 */
public class test {
    @Test
    public void test(){
//        使用javaconfig需要用AnnotationConfig上下文获取容器
       ApplicationContext a = new AnnotationConfigApplicationContext(config.Config.class);
        Person person = a.getBean("person", Person.class);
        person.shout();
    }
}
