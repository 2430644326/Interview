package com.example;

public class DubboAndSpringCloud {
    public static void main(String[] args) {
       /*
        *dubbo与springcloud的区别？
        *
        * Dubbo使用RPC进行通信
        *Dubbo是一款轻量级的RPC框架，它提供了三大核心能力：面向接口的远程方法的调用，智能容错和负载均衡，以及服务的自动注册和发现
        * dubbo的依赖jar包有一些问题，很多大型工程无法解决，所以开发难度大
        * dubbo使用的是二进制传输，占用的宽带（数据传输能力）少一些，
        * dsubbo的注册号中心可以是zookeeper或者redis等
        *
        * springcloud使用的是http的restAPI方式进行通信
        * 而springCloud使用的是http协议进行传输，带宽会多一些，同时使用http协议一般会使用Json报文，消耗会更大
        * springCloud对第三方的继承可以一键式生成，天然集成
        * springCloud的注册中心只能是Eureka
        * 总的来说都是分布式框架  springcloud相当于整机 dubbo相当于组装机，整机的性能好，组装机的更自由（选择不同的服务注册）
        *  */

        System.out.println("");
    }
}
