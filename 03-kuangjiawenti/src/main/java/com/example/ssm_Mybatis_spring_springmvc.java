package com.example;

public class ssm_Mybatis_spring_springmvc {
    public static void main(String[] args) {
//      ssm之  mMybatis框架的介绍
        /*
        * 第一步：mybatis框架里封装了JDBC连接，因为JDBC可以创建连接通道，连接数据库，所以我们直接使用Mybatis框架，
        * 就相当于使用了JDBC对数据库进行操作了，增删改查。
        * 创建mapper接口以及xml文件，在配置中设置xml文件的位置以及需要连接的数据库账户密码名称
        *
        ssm之业务的处理层
        * 第二步：处理业务逻辑service层
        * 进行各种业务逻辑的操作，使用注解（@Resouce或者new对象）得到mapper层接口的对象，然后就可以操作mapper层
        *（Web模式是  c/s（客户端小程序/服务端） 或者 B/S通信（浏览器/服务端）通信）
        ssm之springmvc框架（ssm中springmvc要配置web.xml文件的内容 springboot中则不用，它简化了配置）
        * 第三步：springmvc框架是spring家族中的一种，它是一个实现了webmvc模式的轻量级框架，对web层进行了职责解耦。
        * 在前端页面进行访问过程中，dispatcherServlet前端控制器将调用处理器映射器找到要访问的controller层中的方法（@requestMapping），然后
        * 前端控制器将调用处理器适配器执行controller层，当执行完毕之后controller层将返回数据与视图；之后
        * 前端控制器调用视图解析器将视图解析出来（比如对index添加前缀或者后缀（。html）；
        * 最终前端控制器将数据渲染到视图后展示到前端页面上。
        *
        ssm框架之spring
        * 第四步：spring是一个容器，封装了springmvc与mybatis，
        * 比如第二步的业务层需要注入对象，而对象必须初始化后才可以注入，此时就需要用到spring了。
        * spring有两大功能ioc与aop
        *                       ioc是控制反转
        * 当项目启动时，spring的ioc会根据一些注解（比如@service和@Controller）找到需要注入的对象（类），
        * ioc找到这些对象后会（通过动态代理的方式）把这些对象初始化后放入spring的容器中；在之后使用到这些对象时，
        * 就不用再进行创建了，而是直接在spring的容器中拿就可以了。
        *                       aop则是面向切面
        * 切面其实就是一个类，我们把业务之外的一些操作放入这个切面中，然后根据注解对业务方法进行一个增强功能；
        * 比如@beffer @after  @Arount  可以在业务处理之前对用户注册账号时对密码进行一个加密处理，又或者
        * 在业务处理完成之后对得到的数据进行一个加密然后展示到前端页面
        *
        *                     如何使用aop面向切面
        * 主业务类
        *   书写主业务类
        * 注解配置切面
            @Aspect 注解表示这是一个切面
            @Component 表示这是一个bean,由Spring进行管理
            @Around(value = "execution(* com.how2java.service.ProductService.*(..))")
            * 表示对com.how2java.service.ProductService 这个类中的所有方法进行切面操作（或者说定位要加入的主业务类）
        * 配置文件信息applicationContext.xml
            定位主业务类与切面类标签，然后aop动态代理标签  <aop:aspectj-autoproxy/>
                                spring的事务
        * spring的事务如何使用
        *   我们先在类中为方法名做一个规范，然后再配置文件中为需要事务的方法添加事务，还要定义事务的传播特性。
        * 比如：没有事务就添加一个事务。
        * 有事务则挂起，重新添加一个事务。
        * 没有事务就抛出异常。
        * a中使用到了b，a方法上有事务，b没有，则b发生异常时，ab都会回滚
        *
        *                       事务的隔离级别
        * 读未提交   读已提交      可重复读   串行化
        * 脏读：读取了未提交的数据   a修改数据后 b拿到这个数据操作，此时a回滚了
        * 不可重复读；a读取了一个数据，b对这个数据进行了修改，a又读了一次，前后数据不一致
        * 幻读：a读到表中数据行个数，b增加或者删除了数据行，a再次读取的时候发现表中数据行个数不一致了
        *
        * mysql的隔离级别是可重复读：解决了脏读与不可重复读，在根据索引查询时会把查到的数据行加锁，使用的是乐观锁机制。
        * 当没有根据条件进行查询时，会对整张表进行加锁，此时解决了幻读。
        *                       事务的四大特性
        * 原子性：比如i++  三步操作 拿到变量i的值  对i的值进行加1  重新赋值给i，这三个操作要么都成功，要么都失败
        * 一致性：当a给账户充值100，没到账时，b也充了100，最终结果为100
        * 隔离性：解决了一致性的问题，对数据行加锁CAS乐观锁
        * 持久性：当数据提交后被持久化到数据库中时，无法被回滚
        * */
        System.out.println("ssm面试内容基本完成");



    }
}
