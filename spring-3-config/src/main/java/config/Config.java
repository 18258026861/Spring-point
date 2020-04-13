package config;

import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author YZY
 * @date 2020/4/13 - 14:10
 */
@Configuration

//加上扫描，不然找不到组件会报错，
// 如果加上了扫描，那么被扫描的对象就不用载这个javaconfig配置类里使用get方法了
@ComponentScan("entity")
public class Config {

//    加了包扫描，这个就不用写了，自动配置
    /*@Bean
    public Person getPerson(){
        return new Person() ;
    }*/
}
