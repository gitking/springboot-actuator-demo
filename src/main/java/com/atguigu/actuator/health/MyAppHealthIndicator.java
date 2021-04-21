package com.atguigu.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/*
 * 自定义健康状态指示器
 * 1、编译一个指示器,必须实现HealthIndicator接口
 * 2,指示器的名字必须是xxxHealthIndicator,必须以HealthIndicator结尾
 * 3,使用@Component将自定义健康状态指示器加入到容器中
 * 4,访问的时候使用xxxHealthIndicator前面的xxx访问就行了
 * 可以参考spring-boot-actuator-2.3.0.RELEASE.jar里面的org.springframework.boot.actuate.redis.RedisHealthIndicator类;
 * https://blog.csdn.net/alinyua/article/details/80009435
 */
@Component
public class MyAppHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		//自定义检查方法
		//Health.up().build();返回这个代表应用很健康
		return Health.down().withDetail("msg", "服务异常").build();
	}
}
