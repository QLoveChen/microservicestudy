创建父工程：
    pom.xml


创建公共子模块： api
    pom.xml
    entities

创建提供者模块：provider-8001
    pom.xml
    application.yml
    controller/service/dao/mapper.xml
    测试地址：localhost:8001/dept/findAll
    注意：
        1.数据库连接：url/name/password
        2.mybatis:type-aliases-package
///////////////////////////////////////////////////////////
创建消费者:consumer-80:
    pom.xml
    application.yml
    configBean
    controller
    测试地址：先启动8001， 然后启动consumer-80;
        http://localhost/consumer/dept/findAll

创建注册中心：Eureka-7001/Eureka-7002/Eureka-7003
    pom.xml
    application.yml
    启动类添加注释
创建ribbon：
    创建provider-8002/provider-8003
        pom.xml
        application.yml
        启动类注释
    修改80：
        添加pom.xml:eureka/ribbon/config
        添加yml
        ConfigBean 添加@LoadBalance
        controller替换请求路径
    创建feign：
        pom.xml
        application.xml
        启动类
        在api模块添加service
        controller
创建hystrix：
    创建hystrix模块：
        pom.xml
        application.yml
     创建hystrix-dashbord模块：
        pom.xml
        application.yml
        启动类：@EnableHystrixDashboard
        provider-8001/provider-8002/provider-8003  添加pom监控依赖
创建zuul：
    创建zuul模块：
        pom.xml
        application.yml
        启动类：@EnableZuulProxy
    修改localhost：
        127.0.0.1 myzuul.com



