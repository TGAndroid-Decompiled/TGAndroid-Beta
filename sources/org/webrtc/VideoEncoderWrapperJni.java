package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoEncoderWrapper;
public class VideoEncoderWrapperJni implements VideoEncoderWrapper.Natives {
    static final boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static VideoEncoderWrapper.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (VideoEncoderWrapper.Natives) obj;
        }
        return new VideoEncoderWrapperJni();
    }

    public static void setInstanceForTesting(VideoEncoderWrapper.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void onEncodedFrame(long j, EncodedImage encodedImage) {
        GEN_JNI.org_webrtc_VideoEncoderWrapper_onEncodedFrame(j, encodedImage);
    }
}
