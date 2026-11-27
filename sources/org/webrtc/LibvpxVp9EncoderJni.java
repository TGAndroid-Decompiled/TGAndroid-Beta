package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp9Encoder;
class LibvpxVp9EncoderJni implements LibvpxVp9Encoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp9Encoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (LibvpxVp9Encoder.Natives) obj;
        }
        return new LibvpxVp9EncoderJni();
    }

    public static void setInstanceForTesting(LibvpxVp9Encoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j) {
        return GEN_JNI.org_webrtc_LibvpxVp9Encoder_create(j);
    }

    @Override
    public boolean isSupported() {
        return GEN_JNI.org_webrtc_LibvpxVp9Encoder_isSupported();
    }
}
