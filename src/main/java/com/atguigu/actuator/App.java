package com.atguigu.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * https://www.liaoxuefeng.com/wiki/1252599548343744/1282386381766689
 * https://edu.aliyun.com/lesson_1913_16413#_16413
 * 第8章 » 课时39 监管端点测试
 * 自定义健康状态指示器
 * 1、编译一个指示器,必须实现HealthIndicator接口
 * 2,指示器的名字必须是xxxHealthIndicator,必须以HealthIndicator结尾
 * 3,使用@Component将自定义健康状态指示器加入到容器中
 * 4,访问的时候使用xxxHealthIndicator前面的xxx访问就行了
 * 可以参考spring-boot-actuator-2.3.0.RELEASE.jar里面的org.springframework.boot.actuate.redis.RedisHealthIndicator类;
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
