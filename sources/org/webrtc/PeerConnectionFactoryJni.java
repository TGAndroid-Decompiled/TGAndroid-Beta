package org.webrtc;

import android.content.Context;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
public class PeerConnectionFactoryJni implements PeerConnectionFactory.Natives {
    private static JniTestInstanceHolder sOverride;

    public static PeerConnectionFactory.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (PeerConnectionFactory.Natives) obj;
        }
        return new PeerConnectionFactoryJni();
    }

    public static void setInstanceForTesting(PeerConnectionFactory.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long createAudioSource(long j, MediaConstraints mediaConstraints) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_createAudioSource(j, mediaConstraints);
    }

    @Override
    public long createAudioTrack(long j, String str, long j2) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_createAudioTrack(j, str, j2);
    }

    @Override
    public long createLocalMediaStream(long j, String str) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_createLocalMediaStream(j, str);
    }

    @Override
    public long createPeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_createPeerConnection(j, rTCConfiguration, mediaConstraints, j2, sSLCertificateVerifier);
    }

    @Override
    public PeerConnectionFactory createPeerConnectionFactory(Context context, PeerConnectionFactory.Options options, long j, long j2, long j3, long j4, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j5, long j6, long j7, long j8, long j9, long j10) {
        return (PeerConnectionFactory) GEN_JNI.org_webrtc_PeerConnectionFactory_createPeerConnectionFactory(context, options, j, j2, j3, j4, videoEncoderFactory, videoDecoderFactory, j5, j6, j7, j8, j9, j10);
    }

    @Override
    public long createVideoSource(long j, boolean z, boolean z2) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_createVideoSource(j, z, z2);
    }

    @Override
    public long createVideoTrack(long j, String str, long j2) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_createVideoTrack(j, str, j2);
    }

    @Override
    public void deleteLoggable() {
        GEN_JNI.org_webrtc_PeerConnectionFactory_deleteLoggable();
    }

    @Override
    public void freeFactory(long j) {
        GEN_JNI.org_webrtc_PeerConnectionFactory_freeFactory(j);
    }

    @Override
    public long getNativePeerConnectionFactory(long j) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_getNativePeerConnectionFactory(j);
    }

    @Override
    public RtpCapabilities getRtpReceiverCapabilities(long j, MediaStreamTrack.MediaType mediaType) {
        return (RtpCapabilities) GEN_JNI.org_webrtc_PeerConnectionFactory_getRtpReceiverCapabilities(j, mediaType);
    }

    @Override
    public RtpCapabilities getRtpSenderCapabilities(long j, MediaStreamTrack.MediaType mediaType) {
        return (RtpCapabilities) GEN_JNI.org_webrtc_PeerConnectionFactory_getRtpSenderCapabilities(j, mediaType);
    }

    @Override
    public void initializeAndroidGlobals() {
        GEN_JNI.org_webrtc_PeerConnectionFactory_initializeAndroidGlobals();
    }

    @Override
    public void initializeFieldTrials(String str) {
        GEN_JNI.org_webrtc_PeerConnectionFactory_initializeFieldTrials(str);
    }

    @Override
    public void initializeInternalTracer() {
        GEN_JNI.org_webrtc_PeerConnectionFactory_initializeInternalTracer();
    }

    @Override
    public void injectLoggable(JNILogging jNILogging, int i) {
        GEN_JNI.org_webrtc_PeerConnectionFactory_injectLoggable(jNILogging, i);
    }

    @Override
    public void printStackTrace(int i) {
        GEN_JNI.org_webrtc_PeerConnectionFactory_printStackTrace(i);
    }

    @Override
    public void shutdownInternalTracer() {
        GEN_JNI.org_webrtc_PeerConnectionFactory_shutdownInternalTracer();
    }

    @Override
    public boolean startAecDump(long j, int i, int i2) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_startAecDump(j, i, i2);
    }

    @Override
    public boolean startInternalTracingCapture(String str) {
        return GEN_JNI.org_webrtc_PeerConnectionFactory_startInternalTracingCapture(str);
    }

    @Override
    public void stopAecDump(long j) {
        GEN_JNI.org_webrtc_PeerConnectionFactory_stopAecDump(j);
    }

    @Override
    public void stopInternalTracingCapture() {
        GEN_JNI.org_webrtc_PeerConnectionFactory_stopInternalTracingCapture();
    }
}
