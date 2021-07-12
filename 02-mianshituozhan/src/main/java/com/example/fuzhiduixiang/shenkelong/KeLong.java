package com.example.fuzhiduixiang.shenkelong;

public class KeLong {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p =new Person("张三",12,1);
        Student student=new Student("aa",11,p);

        System.out.println("student"+student);

      Student student1= (Student) student.clone();//student克隆对象出student1
        System.out.println(student1);

        System.out.println("----------student1中的值被修改时，student中的值不变  深克隆--------");
        student1.getPerson().setAge(1000);
        student1.setAge(1);
        System.out.println(student);
        System.out.println(student1);

    }
}
