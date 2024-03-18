package homework;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Entity user = new User("Bob");
        Entity admin = new Admin("John");
        Entity dog = new Dog("Buch");
        Saver saver = new Saver();
        Reporter reporter = new Reporter();
        List<Entity> entityList = new ArrayList<>();
        entityList.add(user);
        entityList.add(admin);
        entityList.add(dog);
        for (Entity elem: entityList) {
            saver.save(elem);
            reporter.report(elem);
        }
    }
}