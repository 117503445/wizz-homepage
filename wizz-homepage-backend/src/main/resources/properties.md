# application.properties usage

为防止密码泄露，请手动添加配置文件

同目录下创建 application.properties

---

spring.jpa.hibernate.ddl-auto=update

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:域名}:端口号/数据库名

spring.datasource.username=用户名

spring.datasource.password=密码

spring.jpa.show-sql=true

---
