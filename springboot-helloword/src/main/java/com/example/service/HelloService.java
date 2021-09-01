package com.example.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    /**
     * 使用 @Cacheable 表示该方法会使用 spring缓存
     * value 指定缓存的标识，可以自定义
     * key 指定缓存标识下，某个值的缓存，用 #表达式，可以得到具体参数的值，如 #key 标识获取参数名的key值作为key
     * 且，可以使用级联写法。
     * 如：方法传递的是  abc,则此方法存储在缓存中的key 为 resource.abc ，存储的值为 返回的值。
     */
    @Cacheable(value = "resource", key = "#key")
    public String getString(String key) {
        return key;
    }

    /**
     * 使用@CacheEvict注解清除指定的缓存
     * value 指定缓存标识
     * key 指定要清除的是那个key
     */
    @CacheEvict(value = "resource", key = "#key")
    public void clearCache(String key) {
        System.out.println("缓存已经清理了");
    }
}
