package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStream;
public class MediaStreamJni implements MediaStream.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaStream.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (MediaStream.Natives) obj;
        }
        return new MediaStreamJni();
    }

    public static void setInstanceForTesting(MediaStream.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public boolean addAudioTrackToNativeStream(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_addAudioTrackToNativeStream(j, j2);
    }

    @Override
    public boolean addVideoTrackToNativeStream(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_addVideoTrackToNativeStream(j, j2);
    }

    @Override
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_MediaStream_getId(j);
    }

    @Override
    public boolean removeAudioTrack(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_removeAudioTrack(j, j2);
    }

    @Override
    public boolean removeVideoTrack(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_removeVideoTrack(j, j2);
    }
}
