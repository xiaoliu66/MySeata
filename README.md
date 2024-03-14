# Seata分布式事务本地实战

* contract 代表合同服务
* measure 代表计量服务
* producer 代表业务服务分别通过feign远程调用这两个服务

### 项目各组件版本
* JDK 11
* Springboot 2.6.13
* Seata 2.0.0
* Nacos 2.3.1
* Mysql 8.0.36
* Postgresql 16.1