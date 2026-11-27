package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.EglBase10Impl;
class EglBase10ImplJni implements EglBase10Impl.Natives {
    private static JniTestInstanceHolder sOverride;

    public static EglBase10Impl.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (EglBase10Impl.Natives) obj;
        }
        return new EglBase10ImplJni();
    }

    public static void setInstanceForTesting(EglBase10Impl.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long getCurrentNativeEGLContext() {
        return GEN_JNI.org_webrtc_EglBase10Impl_getCurrentNativeEGLContext();
    }
}
