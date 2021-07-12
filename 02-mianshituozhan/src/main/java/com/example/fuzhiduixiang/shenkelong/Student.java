package com.example.fuzhiduixiang.shenkelong;

public class Student implements Cloneable {
    private String name;
    private int age;
    private Person person;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.person= (Person) person.clone();
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", person=" + person +
                '}';
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Student(String name, int age, Person person) {
        this.name = name;
        this.age = age;
        this.person = person;
    }

    public Student() {
    }
}
