package suanfa;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * 张LL
 * 2021/6/27
 */
public class XuanZePaiXu {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 8, 9, 6};
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = min + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
//                    赋予min最小元素下标
                    min = j;
                }

            }
            if (min!=i){
//                交换元素
                int m=a[min];
                a[min]=a[i];
                a[i]=m;
            }
        }

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

    }


}
