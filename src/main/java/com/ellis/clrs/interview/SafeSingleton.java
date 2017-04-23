package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-3-6.
 */
public class SafeSingleton {

    private static volatile SafeSingleton instance;

    private SafeSingleton() {
    }

    public static SafeSingleton getInstence() {
        if (instance == null) {
            synchronized (SafeSingleton.class) {
                if (instance == null) {
                    instance = new SafeSingleton();
                }
            }
        }
        return instance;
    }
}
