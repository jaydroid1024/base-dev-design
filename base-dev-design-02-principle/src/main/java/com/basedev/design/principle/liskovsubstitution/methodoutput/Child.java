package com.basedev.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * Created by geely
 */
public class Child extends Base {
    @Override
    public HashMap<String,String> method() {
        HashMap<String,String> hashMap = new HashMap<>();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
