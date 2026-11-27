package org.webrtc.audio;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.WebRtcAudioRecord;
class WebRtcAudioRecordJni implements WebRtcAudioRecord.Natives {
    static final boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static WebRtcAudioRecord.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (WebRtcAudioRecord.Natives) obj;
        }
        return new WebRtcAudioRecordJni();
    }

    public static void setInstanceForTesting(WebRtcAudioRecord.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void cacheDirectBufferAddress(long j, WebRtcAudioRecord webRtcAudioRecord, ByteBuffer byteBuffer) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioRecord_cacheDirectBufferAddress(j, webRtcAudioRecord, byteBuffer);
    }

    @Override
    public void dataIsRecorded(long j, WebRtcAudioRecord webRtcAudioRecord, int i, long j2) {
        GEN_JNI.org_webrtc_audio_WebRtcAudioRecord_dataIsRecorded(j, webRtcAudioRecord, i, j2);
    }
}
