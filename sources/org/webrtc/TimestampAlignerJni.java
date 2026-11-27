package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.TimestampAligner;
public class TimestampAlignerJni implements TimestampAligner.Natives {
    private static JniTestInstanceHolder sOverride;

    public static TimestampAligner.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (TimestampAligner.Natives) obj;
        }
        return new TimestampAlignerJni();
    }

    public static void setInstanceForTesting(TimestampAligner.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createTimestampAligner(long j) {
        return GEN_JNI.org_webrtc_TimestampAligner_createTimestampAligner(j);
    }

    @Override
    public void releaseTimestampAligner(long j) {
        GEN_JNI.org_webrtc_TimestampAligner_releaseTimestampAligner(j);
    }

    @Override
    public long translateTimestamp(long j, long j2) {
        return GEN_JNI.org_webrtc_TimestampAligner_translateTimestamp(j, j2);
    }
}
