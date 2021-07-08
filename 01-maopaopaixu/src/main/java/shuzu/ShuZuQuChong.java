package shuzu;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 张LL
 * 2021/7/5
 * 让数组的不重复元素输出
 */
public class ShuZuQuChong {
    public static void main(String[] args) {

        int [] array1={2,6,8,4,5,4,3,9,8};
        Set array2=new HashSet();//有序 去重   2345689
//        Set array3=new LinkedHashSet();//无序 去重   2684539
        //fori
        for (int i = 0; i < array1.length; i++) {
            array2.add(array1[i]);
//            array3.add(array1[i]);

        }
        //iter
        for (Object o : array2) {
            System.out.print(o);//2345689
        }
       /* System.out.println("----------------");
        for (Object o : array3) {
            System.out.print(o); //2684539
        }*/

    }
}
