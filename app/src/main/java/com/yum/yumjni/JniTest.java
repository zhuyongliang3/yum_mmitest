package com.yum.yumjni;

/**
 * Created by zhuyl on 2018/4/3.
 */

public class JniTest {
    //加载库生成或导入的JniTest.so库，并在此声明要使用的方法 calculate
    public static native int calculate(int num);
    static {
        System.loadLibrary("JniTest");
    }
}
