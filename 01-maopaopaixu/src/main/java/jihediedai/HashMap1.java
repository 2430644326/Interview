package jihediedai;


import sun.applet.Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 张LL
 * 2021/7/5
 */
public class HashMap1 {
    public  void hashitco() {

//    }
//    public void hashitco() {

        Map map=new HashMap();
        map.put("1", "一");
        map.put("2", "二");
        map.put("3", "三");
        map.put(null, "三");
        //itco
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Object next = iterator.next();
            System.out.println(next);
        }

        Iterator<Map.Entry> iterator = map.entrySet().iterator();
        while ( iterator.hasNext() ) {
            Map.Entry next =  iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());

        }

    }
}
