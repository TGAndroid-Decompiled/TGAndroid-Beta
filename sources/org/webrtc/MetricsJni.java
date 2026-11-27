package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Metrics;
class MetricsJni implements Metrics.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Metrics.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (Metrics.Natives) obj;
        }
        return new MetricsJni();
    }

    public static void setInstanceForTesting(Metrics.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void enable() {
        GEN_JNI.org_webrtc_Metrics_enable();
    }

    @Override
    public Metrics getAndReset() {
        return (Metrics) GEN_JNI.org_webrtc_Metrics_getAndReset();
    }
}
