package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStreamTrack;
public class MediaStreamTrackJni implements MediaStreamTrack.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaStreamTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (MediaStreamTrack.Natives) obj;
        }
        return new MediaStreamTrackJni();
    }

    public static void setInstanceForTesting(MediaStreamTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public boolean getEnabled(long j) {
        return GEN_JNI.org_webrtc_MediaStreamTrack_getEnabled(j);
    }

    @Override
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_MediaStreamTrack_getId(j);
    }

    @Override
    public String getKind(long j) {
        return (String) GEN_JNI.org_webrtc_MediaStreamTrack_getKind(j);
    }

    @Override
    public MediaStreamTrack.State getState(long j) {
        return (MediaStreamTrack.State) GEN_JNI.org_webrtc_MediaStreamTrack_getState(j);
    }

    @Override
    public boolean setEnabled(long j, boolean z) {
        return GEN_JNI.org_webrtc_MediaStreamTrack_setEnabled(j, z);
    }
}
