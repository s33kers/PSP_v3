package us.martink.imp;

import us.martink.interfaces.AnotherService;

/**
 * Created by tadas on 2016-12-14.
 */
public class QualifierServiceImpl implements AnotherService {

    String name;
    int age;

    public void knockKnock() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
