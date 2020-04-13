package person;

import org.springframework.beans.factory.annotation.Autowired;
import person.pet.Cat;
import person.pet.Dog;

/**
 * @author YZY
 * @date 2020/4/12 - 20:44
 */
public class Person {
//    flase表示可以为空
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public String getName() {
        return name;
    }
    public Cat getCat() {
        return cat;
    }
    public Dog getDog() {
        return dog;
    }
    public void shout(){
        System.out.println(cat.getName());
        System.out.println(dog.getName());
    }
}
