
package com.ellis.clrs.interview;

/**
 * Created by fudw on 17-3-6.
 */
public class UnsafeSingleton {
    
    private static UnsafeSingleton instance;

    private UnsafeSingleton(){}

    public static UnsafeSingleton getInstence() {
        if (instance == null) {
            instance = new UnsafeSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(1 & 1);
        System.out.println(0 & 1);
        System.out.println(0 & 0);
        System.out.println(1 | 1);
    }
}
