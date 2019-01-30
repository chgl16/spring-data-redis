package xyz.cglzwz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;


/**
 * @EnableRedisRepositories(basePackages = "xyz.cglzwz.dao")没有这个指定注解的话，
 * 是无法使用Redis的操作的。后台会直接报错，说studentRepositry没有一个可以注入的bean。
 */

@Configuration
@EnableRedisRepositories(basePackages = "xyz.cglzwz.dao")
public class RedisConfig {
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedisConFactory
                = new JedisConnectionFactory();
        return jedisConFactory;
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
}
