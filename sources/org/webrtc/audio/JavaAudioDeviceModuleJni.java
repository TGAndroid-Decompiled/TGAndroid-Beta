package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.audio.JavaAudioDeviceModule;
public class JavaAudioDeviceModuleJni implements JavaAudioDeviceModule.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JavaAudioDeviceModule.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (JavaAudioDeviceModule.Natives) obj;
        }
        return new JavaAudioDeviceModuleJni();
    }

    public static void setInstanceForTesting(JavaAudioDeviceModule.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, long j, int i, int i2, boolean z, boolean z2) {
        return GEN_JNI.org_webrtc_audio_JavaAudioDeviceModule_createAudioDeviceModule(context, audioManager, webRtcAudioRecord, webRtcAudioTrack, j, i, i2, z, z2);
    }
}
