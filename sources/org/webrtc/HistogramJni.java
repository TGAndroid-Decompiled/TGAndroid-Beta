package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Histogram;
public class HistogramJni implements Histogram.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Histogram.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (Histogram.Natives) obj;
        }
        return new HistogramJni();
    }

    public static void setInstanceForTesting(Histogram.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void addSample(long j, int i) {
        GEN_JNI.org_webrtc_Histogram_addSample(j, i);
    }

    @Override
    public long createCounts(String str, int i, int i2, int i3) {
        return GEN_JNI.org_webrtc_Histogram_createCounts(str, i, i2, i3);
    }

    @Override
    public long createEnumeration(String str, int i) {
        return GEN_JNI.org_webrtc_Histogram_createEnumeration(str, i);
    }
}
