//
// Created by zhuyl on 2018/4/3.
//
#include <com_yum_yumjni_JniTest.h>

JNIEXPORT jint JNICALL Java_com_yum_yumjni_JniTest_calculate
  (JNIEnv *env, jclass cls, jint num){
  return num*num;
  }
