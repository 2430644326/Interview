package suanfa;

/**
 * 张LL
 * 2021/6/27
 */
public class ErFenChaZhao {
    public static void main(String[] args) {

        int [] a={1,4,7,9,34,56,78};
        //二分查找查询某个元素34在数组中的位置   下标位置
        int begin=0;
        int end= a.length-1;
        int zhong=(begin+end)/2;

       while (true) {


           if (34 == a[zhong]) {
               System.out.println(zhong);
               break;
           } else if (34 >= a[zhong]) {
               begin = zhong + 1;
               zhong = (begin + end) / 2;

           }else  if (34<=a[zhong]){
               end = zhong - 1;
               zhong = (begin + end) / 2;
           }
       }
    }
}
