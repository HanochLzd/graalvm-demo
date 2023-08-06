#include <jni.h>
#include <stdio.h>
#include "com_hanoch_graalvmdemo_jni_HelloWorld.h"

JNIEXPORT void JNICALL
Java_com_hanoch_graalvmdemo_jni_HelloWorld_print(JNIEnv *env, jobject obj) {
        printf("Hello world; this is C talking!\n");
        return;
}