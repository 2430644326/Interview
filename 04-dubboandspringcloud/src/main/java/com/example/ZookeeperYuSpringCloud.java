package com.example;

public class ZookeeperYuSpringCloud {
    public static void main(String[] args) {
        /*
        * dubbo的注册中心zookeeper与springcloud的注册中心Eureka的区别？
        * 前提：CAP理论
                Consistency，一致性的意思。
                Availability，可用性的意思。
                Partition tolerance，分区容错的意思。
        *                   Zookeeper注册中心
        *Zookeeper注册中心是cp的，保证了一致性，不保证可用性，Zookeeper集群的各个节点之间有主从情况
        * 服务注册中心对可用性的要求要高于一致性的，我们可以接收服务短期达不到一致性的情况
        * 对于zk来说，当主节点由于网络故障失去联系，会从其余节点重新选举，而选举的时间太长30秒~120秒，此时整个zk集群是不可用的，
        * 会导致选举期间注册服务的瘫痪。
        *
        *                   Eureka注册中心
        * Eureka注册中心是ap的  保证了高可用性，不保证一致性。Eureka集群的各个节点是平等的，没有主从的情况
        * 当服务启动后向eureka注册，eureka server（eureka服务）会向其他eureka server（eureka服务）把注册信息进行同步，
        * 当消费者调用提供者时，直接去eureka服务中进行查找提供者的地址，找到后缓存到本地，在下次调用时直接去本地缓存中进行查找，
        * 完成调用。
        *
        * 当服务提供者宕机时，eureka会将提供者的服务置位Down的状态，并将服务提供者的状态发送到服务订阅者，服务订阅者更新本地缓存中的提供者的地址。
        * （服务提供者启动后，默认30秒发送一次心跳向Eureka Server,Eureka Server在90秒内没有接受到心跳，默认提供者宕机）
        * 有时由于网络原因（网络中断）会误认为服务宕机（此时把服务者置于down的状态会导致大部分微服务不可用），此时的Eureka会有自我保护机制，在短时间内丢失大量的客户端时，会启动自我保护机制，
        * 不注销任何实例（不把服务者置于down的状态），当网络故障恢复后，该节点自动退出自我保护模式
        *
        * */

        System.out.println("");
    }
}
