package danlimoshi;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator;

/**
 * 张LL
 * 2021/7/7
 * 单例模式
 */
//第一种方法
public class DanLiMoShi {
        //    开始就创建   饿汉式
        private static SingletonIterator singletonIterator=new SingletonIterator();
    //构造方法
    private DanLiMoShi() {
    }
        //get方法
        static SingletonIterator getSingletonIterator() {
        return singletonIterator;
        }
}

//第二种方法
class DanLiMoShi2{
    //用到在创建        懒汉式
    private static SingletonIterator singletonIterator=null;
    //构造方法
    private DanLiMoShi2() {
    }
    //get方法
    static SingletonIterator getSingletonIterator() {
        if (singletonIterator!=null){
            return singletonIterator;
        }
        singletonIterator=new SingletonIterator();
        return singletonIterator;
    }
}