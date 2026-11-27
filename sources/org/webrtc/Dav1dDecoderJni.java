package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Dav1dDecoder;
class Dav1dDecoderJni implements Dav1dDecoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Dav1dDecoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (Dav1dDecoder.Natives) obj;
        }
        return new Dav1dDecoderJni();
    }

    public static void setInstanceForTesting(Dav1dDecoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createDecoder() {
        return GEN_JNI.org_webrtc_Dav1dDecoder_createDecoder();
    }
}
