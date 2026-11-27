package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.RtpSender;
public class RtpSenderJni implements RtpSender.Natives {
    private static JniTestInstanceHolder sOverride;

    public static RtpSender.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (RtpSender.Natives) obj;
        }
        return new RtpSenderJni();
    }

    public static void setInstanceForTesting(RtpSender.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long getDtmfSender(long j) {
        return GEN_JNI.org_webrtc_RtpSender_getDtmfSender(j);
    }

    @Override
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_RtpSender_getId(j);
    }

    @Override
    public String getMediaType(long j) {
        return (String) GEN_JNI.org_webrtc_RtpSender_getMediaType(j);
    }

    @Override
    public RtpParameters getParameters(long j) {
        return (RtpParameters) GEN_JNI.org_webrtc_RtpSender_getParameters(j);
    }

    @Override
    public List getStreams(long j) {
        return (List) GEN_JNI.org_webrtc_RtpSender_getStreams(j);
    }

    @Override
    public long getTrack(long j) {
        return GEN_JNI.org_webrtc_RtpSender_getTrack(j);
    }

    @Override
    public void setFrameEncryptor(long j, long j2) {
        GEN_JNI.org_webrtc_RtpSender_setFrameEncryptor(j, j2);
    }

    @Override
    public boolean setParameters(long j, RtpParameters rtpParameters) {
        return GEN_JNI.org_webrtc_RtpSender_setParameters(j, rtpParameters);
    }

    @Override
    public void setStreams(long j, List list) {
        GEN_JNI.org_webrtc_RtpSender_setStreams(j, list);
    }

    @Override
    public boolean setTrack(long j, long j2) {
        return GEN_JNI.org_webrtc_RtpSender_setTrack(j, j2);
    }
}
