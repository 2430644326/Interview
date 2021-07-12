package com.example.fuzhiduixiang.qiankelong;

public class KeLong {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p =new Person("张三",12,1);


        Student student=new Student("aa",11,p);
        System.out.println("student"+student);

        Student student1 = (Student)student.clone();//student克隆对象出student1
        System.out.println(student1);

        System.out.println("----------student1中的引用对象的值被修改时1000，student中的引用对象的值也被改 " +
                " 浅克隆只克隆出当前对象，并不克隆当前对象的内部对象。--------");
        student1.getPerson().setAge(1000);//两个Student指向同一个Person对象的地址  所以改变Person中的值  时，两个对象中的都发生改变
        student1.setAge(1);//而改变student1对象本身的值，student的值不会受影响
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student==student1);//false  浅克隆出的两个对象

    }
}
