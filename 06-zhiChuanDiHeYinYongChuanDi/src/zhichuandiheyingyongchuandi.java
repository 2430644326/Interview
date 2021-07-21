//值传递时相当于创建了一个副本，改变变量的值不会导致所有的变量的值都发生改变
class zhichuandi {
    public static void test1(int a){
        a=5;
        System.out.println("test1方法中:"+a);
    }
    public static void main(String[] args) {
        int a=3;
        zhichuandi.test1(a);
        System.out.println("main方法中:"+a);
    }
}
//引用传递时改变变量的值会导致所有变量的值都改变
class yinyongchaundi{
    public static void test1(A a){
        a.age=20;
        System.out.println("引用传递的test1方法中："+a.age);
    }

    public static void main(String[] args) {
        A a=new A();
        a.age=10;
        yinyongchaundi.test1(a);
        System.out.println("引用传递的main方法中："+a.age);
    }
}
class A{
    int age=0;
}