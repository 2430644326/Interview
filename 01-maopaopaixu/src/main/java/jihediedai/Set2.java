package jihediedai;

import java.util.HashSet;

/**
 * 张LL
 * 2021/7/5
 */
public class Set2 {
    public static void main(String[] args) {


            HashSet hashSet = new HashSet<String>();
            hashSet.add("我是第一个插入");
            hashSet.add("我是第二个插入");
            hashSet.add("我是第三个插入");
            hashSet.add("我是第四个插入");

            System.out.println("有序的输出应该是：");
            System.out.println("我是第一个插入");
            System.out.println("我是第二个插入");
            System.out.println("我是第三个插入");
            System.out.println("我是第四个插入");

            System.out.println("---------------");
            System.out.println("hashSet实际的的输出：");

            for (Object o : hashSet) {
                System.out.println(o.toString());
            }

    }
}
