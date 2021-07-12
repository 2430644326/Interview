package com.example;

public class springboot_springmvc_springCloud_difference {
    public static void main(String[] args) {
//           框架之间的区别
        /*
        第一：spring与springboot之间的区别？
        springboot是spring家族中的一个，可以进行快速，敏捷的开发；
        它提供了大量的第三方库的配置，让我们开箱即用，直接在pom。xml文件中添加依赖就可以使用了,是开发人员专注于业务逻辑。
        它还可以使用javaconfig的两个注解@confrguration与@Bean定义配置类与对象；
        还内置了Tomcat ，基于maven打包，约定大于配置，开箱即用
        好比自动挡与手动挡的汽车，springboot就是自动挡的。
            springboot的注解
        主要注解是@springbootApplication
        这个注解中含有三个注解@springbootConfigration定义一个配置类
                        @CompomentScan扫描配置类对象
                        @EnableAutoConfigration启动自动配置的功能并把扫描到的对象放入spring的容器中
        可以使用Restful的功能（表现层状态转移）
        可以使用@GetMapping @postMapping等
        还有@RestController相当于整合了controller与responseBody两个注解的
        第二：springboot与springCloud的区别？
        springCloud依赖于springboot框架，
        springboot是为了快速的开发单个个体微服务，
        springCloud是为了全局微服务的协调管理，将单个个体为服务组合并管理起来


        *
        * */
        System.out.println("");




    }
}
