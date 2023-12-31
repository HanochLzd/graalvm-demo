package com.hanoch.graalvmdemo.jni;

public class HelloWorld {
    // putting System.loadLibrary() here forces us
    // to mark this class to initialize at runtime
    // when building with native-image
    // https://github.com/oracle/graal/issues/1828
    //
    static {
        System.loadLibrary("HelloWorld");
    }

    public native void print();

    public native int add(int a, int b);

    public native void printAb(int a, int b);
}
