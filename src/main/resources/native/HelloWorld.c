#include <jni.h>
#include <stdio.h>
#include "com_hanoch_graalvmdemo_jni_HelloWorld.h"

JNIEXPORT void JNICALL
Java_com_hanoch_graalvmdemo_jni_HelloWorld_print(JNIEnv *env, jobject obj) {
        printf("Hello world; this is C talking!\n");
        return;
}

JNIEXPORT jint JNICALL Java_com_hanoch_graalvmdemo_jni_HelloWorld_add
  (JNIEnv *env, jobject obj, jint a, jint b){
        int res = (int)(a+b);
        return (jint)res;
}

JNIEXPORT void JNICALL Java_com_hanoch_graalvmdemo_jni_HelloWorld_printAb
  (JNIEnv *env, jobject obj, jint a, jint b){
        printf("c a:%d b:%d\n",a , b);
        return;
  }