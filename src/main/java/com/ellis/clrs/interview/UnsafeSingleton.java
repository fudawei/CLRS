
package com.ellis.clrs.interview;

import java.util.Date;

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
      System.out.println(new Date(1493049600000l));
    }
}
