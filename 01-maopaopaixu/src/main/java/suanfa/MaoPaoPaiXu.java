package suanfa;

import sun.awt.image.OffScreenImage;

/**
 * 张LL
 * 2021/6/27
 */
public class MaoPaoPaiXu {
    public static void main(String[] args) {
        int [] a={1,5,3,8,9,6};
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {

                if (a[j]>a[j+1]){
                    int m= a[j];
                    a[j]=a[j+1];
                    a[j+1]=m;
                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
