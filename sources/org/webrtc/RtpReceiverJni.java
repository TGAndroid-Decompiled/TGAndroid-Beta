package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.RtpReceiver;
public class RtpReceiverJni implements RtpReceiver.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtpReceiver.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (RtpReceiver.Natives) obj;
        }
        return new RtpReceiverJni();
    }

    public static void setInstanceForTesting(RtpReceiver.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_RtpReceiver_getId(j);
    }

    @Override
    public RtpParameters getParameters(long j) {
        return (RtpParameters) GEN_JNI.org_webrtc_RtpReceiver_getParameters(j);
    }

    @Override
    public long getTrack(long j) {
        return GEN_JNI.org_webrtc_RtpReceiver_getTrack(j);
    }

    @Override
    public void setFrameDecryptor(long j, long j2) {
        GEN_JNI.org_webrtc_RtpReceiver_setFrameDecryptor(j, j2);
    }

    @Override
    public long setObserver(long j, RtpReceiver.Observer observer) {
        return GEN_JNI.org_webrtc_RtpReceiver_setObserver(j, observer);
    }

    @Override
    public void unsetObserver(long j, long j2) {
        GEN_JNI.org_webrtc_RtpReceiver_unsetObserver(j, j2);
    }
}
