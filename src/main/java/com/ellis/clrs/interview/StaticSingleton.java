package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-3-6.
 */
public class StaticSingleton {
    
    private static StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstence() {
        return instance;
    }
}
