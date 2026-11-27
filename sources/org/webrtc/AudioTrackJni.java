package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.AudioTrack;
public class AudioTrackJni implements AudioTrack.Natives {
    private static JniTestInstanceHolder sOverride;

    public static AudioTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (AudioTrack.Natives) obj;
        }
        return new AudioTrackJni();
    }

    public static void setInstanceForTesting(AudioTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void setVolume(long j, double d) {
        GEN_JNI.org_webrtc_AudioTrack_setVolume(j, d);
    }
}
