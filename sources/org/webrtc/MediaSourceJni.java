package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaSource;
public class MediaSourceJni implements MediaSource.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaSource.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (MediaSource.Natives) obj;
        }
        return new MediaSourceJni();
    }

    public static void setInstanceForTesting(MediaSource.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public MediaSource.State getState(long j) {
        return (MediaSource.State) GEN_JNI.org_webrtc_MediaSource_getState(j);
    }
}
