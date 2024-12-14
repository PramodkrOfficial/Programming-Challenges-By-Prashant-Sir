package in.kgcoding.challenge81;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String id;

    public Person(String name,int age,String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
