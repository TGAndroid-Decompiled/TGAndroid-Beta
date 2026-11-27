package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoEncoderFallback;
class VideoEncoderFallbackJni implements VideoEncoderFallback.Natives {
    private static JniTestInstanceHolder sOverride;

    public static VideoEncoderFallback.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (VideoEncoderFallback.Natives) obj;
        }
        return new VideoEncoderFallbackJni();
    }

    public static void setInstanceForTesting(VideoEncoderFallback.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long create(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        return GEN_JNI.org_webrtc_VideoEncoderFallback_create(j, videoEncoder, videoEncoder2);
    }
}
