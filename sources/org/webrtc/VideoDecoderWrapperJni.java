package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoDecoderWrapper;
public class VideoDecoderWrapperJni implements VideoDecoderWrapper.Natives {
    static final boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static VideoDecoderWrapper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (VideoDecoderWrapper.Natives) obj;
        }
        return new VideoDecoderWrapperJni();
    }

    public static void setInstanceForTesting(VideoDecoderWrapper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2) {
        GEN_JNI.org_webrtc_VideoDecoderWrapper_onDecodedFrame(j, videoFrame, num, num2);
    }
}
