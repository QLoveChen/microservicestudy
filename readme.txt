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

创建消费者
