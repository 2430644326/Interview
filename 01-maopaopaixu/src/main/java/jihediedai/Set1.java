package jihediedai;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 张LL
 * 2021/7/5
 */
public class Set1 {
    public static void main(String[] args) {

        Set set=new HashSet();//
        set.add("1");
        set.add("18");
        set.add("2");
        set.add("3");
        set.add("4");
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();

            System.out.print(next+",");
        }
        System.out.println();
        System.out.println("-----------------------");
        Set linkedSet=new LinkedHashSet();
        linkedSet.add("1");
        linkedSet.add("18");
        linkedSet.add("2");
        linkedSet.add("3");
        linkedSet.add("4");
        for (Iterator iterator = linkedSet.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();

            System.out.print(next+",");
        }







    }
}
