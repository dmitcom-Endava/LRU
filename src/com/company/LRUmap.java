package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUmap<V, T> extends LinkedHashMap<V, T> {
    private final Integer maxCapacity;

    public LRUmap(final Integer maxCapacity) {
        super(maxCapacity, 1, true);
        this.maxCapacity = maxCapacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<V, T> eldest) {
        return super.size() > maxCapacity;
    }
    @Override
    public String toString() {
        return "LruCache{" +
                "maxCapacity=" + maxCapacity +
                '}';
    }
}
