package org.webrtc.audio;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.WebRtcAudioTrack;
class WebRtcAudioTrackJni implements WebRtcAudioTrack.Natives {
    static final boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static WebRtcAudioTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (WebRtcAudioTrack.Natives) obj;
        }
        return new WebRtcAudioTrackJni();
    }

    public static void setInstanceForTesting(WebRtcAudioTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void cacheDirectBufferAddress(long j, ByteBuffer byteBuffer) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioTrack_cacheDirectBufferAddress(j, byteBuffer);
    }

    @Override
    public void getPlayoutData(long j, int i) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioTrack_getPlayoutData(j, i);
    }
}
