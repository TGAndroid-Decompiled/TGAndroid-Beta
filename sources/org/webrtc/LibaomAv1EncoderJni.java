package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibaomAv1Encoder;
class LibaomAv1EncoderJni implements LibaomAv1Encoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibaomAv1Encoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (LibaomAv1Encoder.Natives) obj;
        }
        return new LibaomAv1EncoderJni();
    }

    public static void setInstanceForTesting(LibaomAv1Encoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j) {
        return GEN_JNI.org_webrtc_LibaomAv1Encoder_create(j);
    }
}
