package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp9Decoder;
class LibvpxVp9DecoderJni implements LibvpxVp9Decoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp9Decoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (LibvpxVp9Decoder.Natives) obj;
        }
        return new LibvpxVp9DecoderJni();
    }

    public static void setInstanceForTesting(LibvpxVp9Decoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createDecoder() {
        return GEN_JNI.org_webrtc_LibvpxVp9Decoder_createDecoder();
    }

    @Override
    public boolean isSupported() {
        return GEN_JNI.org_webrtc_LibvpxVp9Decoder_isSupported();
    }
}
