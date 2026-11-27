package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Environment;
public class EnvironmentJni implements Environment.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Environment.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (Environment.Natives) obj;
        }
        return new EnvironmentJni();
    }

    public static void setInstanceForTesting(Environment.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(String str) {
        return GEN_JNI.org_webrtc_Environment_create(str);
    }

    @Override
    public long currentTimeNanos(long j) {
        return GEN_JNI.org_webrtc_Environment_currentTimeNanos(j);
    }

    @Override
    public void free(long j) {
        GEN_JNI.org_webrtc_Environment_free(j);
    }
}
