package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpTransceiver;
public class RtpTransceiverJni implements RtpTransceiver.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtpTransceiver.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (RtpTransceiver.Natives) obj;
        }
        return new RtpTransceiverJni();
    }

    public static void setInstanceForTesting(RtpTransceiver.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public RtpTransceiver.RtpTransceiverDirection currentDirection(long j) {
        return (RtpTransceiver.RtpTransceiverDirection) GEN_JNI.org_webrtc_RtpTransceiver_currentDirection(j);
    }

    @Override
    public RtpTransceiver.RtpTransceiverDirection direction(long j) {
        return (RtpTransceiver.RtpTransceiverDirection) GEN_JNI.org_webrtc_RtpTransceiver_direction(j);
    }

    @Override
    public MediaStreamTrack.MediaType getMediaType(long j) {
        return (MediaStreamTrack.MediaType) GEN_JNI.org_webrtc_RtpTransceiver_getMediaType(j);
    }

    @Override
    public String getMid(long j) {
        return (String) GEN_JNI.org_webrtc_RtpTransceiver_getMid(j);
    }

    @Override
    public RtpReceiver getReceiver(long j) {
        return (RtpReceiver) GEN_JNI.org_webrtc_RtpTransceiver_getReceiver(j);
    }

    @Override
    public RtpSender getSender(long j) {
        return (RtpSender) GEN_JNI.org_webrtc_RtpTransceiver_getSender(j);
    }

    @Override
    public RtcError setCodecPreferences(long j, List list) {
        return (RtcError) GEN_JNI.org_webrtc_RtpTransceiver_setCodecPreferences(j, list);
    }

    @Override
    public boolean setDirection(long j, RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        return GEN_JNI.org_webrtc_RtpTransceiver_setDirection(j, rtpTransceiverDirection);
    }

    @Override
    public void stopInternal(long j) {
        GEN_JNI.org_webrtc_RtpTransceiver_stopInternal(j);
    }

    @Override
    public void stopStandard(long j) {
        GEN_JNI.org_webrtc_RtpTransceiver_stopStandard(j);
    }

    @Override
    public boolean stopped(long j) {
        return GEN_JNI.org_webrtc_RtpTransceiver_stopped(j);
    }
}
