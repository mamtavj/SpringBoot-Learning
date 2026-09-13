package org.example;

import org.springframework.stereotype.Component;

//@Component          // =>spring cannot make this class object because what to put into inside parameterized constructor of this class
                    //It does not know what String we want as spring doesn't have any string in the ioc container
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
