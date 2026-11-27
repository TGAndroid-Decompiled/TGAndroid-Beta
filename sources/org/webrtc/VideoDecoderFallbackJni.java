package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderFallback;
class VideoDecoderFallbackJni implements VideoDecoderFallback.Natives {
    private static JniTestInstanceHolder sOverride;

    public static VideoDecoderFallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (VideoDecoderFallback.Natives) obj;
        }
        return new VideoDecoderFallbackJni();
    }

    public static void setInstanceForTesting(VideoDecoderFallback.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        return GEN_JNI.org_webrtc_VideoDecoderFallback_create(j, videoDecoder, videoDecoder2);
    }
}
