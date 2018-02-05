# Spring Boot学习记录

* 配置多个运行环境
    建立多个applicaion-{name}.yaml文件
    然后在application.yaml中通过
    ```
    spring:
         profiles:
           active: dev #配置的名字
    ```

* 读取配置文件中的值
  1. 通过注解@Value(${key})
  2. 通过@ConfigurationProperties注解读取文件
  
* 注解式事务
    
    * 事务传播级别
    * 事务隔离级别

* 注解式切面

    * @PointCut
    * @Before
    * @After
    * @AfterReturning
    * @ReturnAfter

* 全局异常处理
    
    全局异常抛出
    注解拦截Controller @ControllerAdvice
    对应异常处理@ExceptionHandler

打包跳过测试 -Dmaven.test.skip=true 

打包指定环境-Dspring.profile.active=dev
  