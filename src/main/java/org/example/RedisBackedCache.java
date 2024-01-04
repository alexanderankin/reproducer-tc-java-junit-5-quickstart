package org.example;

import redis.clients.jedis.JedisPool;

public class RedisBackedCache {
    private final JedisPool pool;

    public RedisBackedCache(String localhost, int port) {
        pool = new JedisPool(localhost, port);
    }

    public void put(String key, String value) {
        pool.getResource().set(key, value);
    }

    public String get(String key) {
        return pool.getResource().get(key);
    }
}
