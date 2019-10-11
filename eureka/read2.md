服务注册原理
    服务消费者、服务的提供者都属于eureka-client，提供者将服务再注册中心进行注册，供消费者客户端进行调用
自我保护机制
    每分钟心跳次数(y)小于某个值，当y<n时触发自我保护，实例数*2*续租百分比(例如0.85)=n
    自我保护时候不能进行服务剔除

客服端负载均衡 ribbon、feign
    客户服务中心获取注册列表-->服务列表地址存储与客户端节点
     默认：·RoundRobinRule：以RandonRobin方法轮询选择服务器
服务端负载均衡：nginx
    区别：在于服务端地址列表存储位置

restful和http区别    
    restful使用http4个动作（get post delete put）进行实现的