package jihediedai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 张LL
 * 2021/7/5
 */
public class List1 {
    public static void main(String[] args) {

        List list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();
            System.out.println(next);
        }

    }
}
