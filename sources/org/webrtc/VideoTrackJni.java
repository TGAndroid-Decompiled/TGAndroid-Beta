package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.VideoTrack;
public class VideoTrackJni implements VideoTrack.Natives {
    private static JniTestInstanceHolder sOverride;

    public static VideoTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (VideoTrack.Natives) obj;
        }
        return new VideoTrackJni();
    }

    public static void setInstanceForTesting(VideoTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void addSink(long j, long j2) {
        GEN_JNI.org_webrtc_VideoTrack_addSink(j, j2);
    }

    @Override
    public void freeSink(long j) {
        GEN_JNI.org_webrtc_VideoTrack_freeSink(j);
    }

    @Override
    public void removeSink(long j, long j2) {
        GEN_JNI.org_webrtc_VideoTrack_removeSink(j, j2);
    }

    @Override
    public long wrapSink(VideoSink videoSink) {
        return GEN_JNI.org_webrtc_VideoTrack_wrapSink(videoSink);
    }
}
