package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp8Encoder;
class LibvpxVp8EncoderJni implements LibvpxVp8Encoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp8Encoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (LibvpxVp8Encoder.Natives) obj;
        }
        return new LibvpxVp8EncoderJni();
    }

    public static void setInstanceForTesting(LibvpxVp8Encoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j) {
        return GEN_JNI.org_webrtc_LibvpxVp8Encoder_create(j);
    }
}
