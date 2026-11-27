package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.LibvpxVp8Decoder;
class LibvpxVp8DecoderJni implements LibvpxVp8Decoder.Natives {
    private static JniTestInstanceHolder sOverride;

    public static LibvpxVp8Decoder.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (LibvpxVp8Decoder.Natives) obj;
        }
        return new LibvpxVp8DecoderJni();
    }

    public static void setInstanceForTesting(LibvpxVp8Decoder.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createDecoder(long j) {
        return GEN_JNI.org_webrtc_LibvpxVp8Decoder_createDecoder(j);
    }
}
