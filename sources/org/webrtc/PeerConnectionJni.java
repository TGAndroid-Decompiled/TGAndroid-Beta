package org.webrtc;

import java.util.List;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.DataChannel;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpTransceiver;
public class PeerConnectionJni implements PeerConnection.Natives {
    private static JniTestInstanceHolder sOverride;

    public static PeerConnection.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (PeerConnection.Natives) obj;
        }
        return new PeerConnectionJni();
    }

    public static void setInstanceForTesting(PeerConnection.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public boolean addIceCandidate(PeerConnection peerConnection, String str, int i, String str2) {
        return GEN_JNI.org_webrtc_PeerConnection_addIceCandidate(peerConnection, str, i, str2);
    }

    @Override
    public void addIceCandidateWithObserver(PeerConnection peerConnection, String str, int i, String str2, AddIceObserver addIceObserver) {
        GEN_JNI.org_webrtc_PeerConnection_addIceCandidateWithObserver(peerConnection, str, i, str2, addIceObserver);
    }

    @Override
    public boolean addLocalStream(PeerConnection peerConnection, long j) {
        return GEN_JNI.org_webrtc_PeerConnection_addLocalStream(peerConnection, j);
    }

    @Override
    public RtpSender addTrack(PeerConnection peerConnection, long j, List list) {
        return (RtpSender) GEN_JNI.org_webrtc_PeerConnection_addTrack(peerConnection, j, list);
    }

    @Override
    public RtpTransceiver addTransceiverOfType(PeerConnection peerConnection, MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        return (RtpTransceiver) GEN_JNI.org_webrtc_PeerConnection_addTransceiverOfType(peerConnection, mediaType, rtpTransceiverInit);
    }

    @Override
    public RtpTransceiver addTransceiverWithTrack(PeerConnection peerConnection, long j, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        return (RtpTransceiver) GEN_JNI.org_webrtc_PeerConnection_addTransceiverWithTrack(peerConnection, j, rtpTransceiverInit);
    }

    @Override
    public void close(PeerConnection peerConnection) {
        GEN_JNI.org_webrtc_PeerConnection_close(peerConnection);
    }

    @Override
    public PeerConnection.PeerConnectionState connectionState(PeerConnection peerConnection) {
        return (PeerConnection.PeerConnectionState) GEN_JNI.org_webrtc_PeerConnection_connectionState(peerConnection);
    }

    @Override
    public void createAnswer(PeerConnection peerConnection, SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        GEN_JNI.org_webrtc_PeerConnection_createAnswer(peerConnection, sdpObserver, mediaConstraints);
    }

    @Override
    public DataChannel createDataChannel(PeerConnection peerConnection, String str, DataChannel.Init init) {
        return (DataChannel) GEN_JNI.org_webrtc_PeerConnection_createDataChannel(peerConnection, str, init);
    }

    @Override
    public void createOffer(PeerConnection peerConnection, SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        GEN_JNI.org_webrtc_PeerConnection_createOffer(peerConnection, sdpObserver, mediaConstraints);
    }

    @Override
    public long createPeerConnectionObserver(PeerConnection.Observer observer) {
        return GEN_JNI.org_webrtc_PeerConnection_createPeerConnectionObserver(observer);
    }

    @Override
    public RtpSender createSender(PeerConnection peerConnection, String str, String str2) {
        return (RtpSender) GEN_JNI.org_webrtc_PeerConnection_createSender(peerConnection, str, str2);
    }

    @Override
    public void freeOwnedPeerConnection(long j) {
        GEN_JNI.org_webrtc_PeerConnection_freeOwnedPeerConnection(j);
    }

    @Override
    public RtcCertificatePem getCertificate(PeerConnection peerConnection) {
        return (RtcCertificatePem) GEN_JNI.org_webrtc_PeerConnection_getCertificate(peerConnection);
    }

    @Override
    public SessionDescription getLocalDescription(PeerConnection peerConnection) {
        return (SessionDescription) GEN_JNI.org_webrtc_PeerConnection_getLocalDescription(peerConnection);
    }

    @Override
    public long getNativePeerConnection(PeerConnection peerConnection) {
        return GEN_JNI.org_webrtc_PeerConnection_getNativePeerConnection(peerConnection);
    }

    @Override
    public List getReceivers(PeerConnection peerConnection) {
        return (List) GEN_JNI.org_webrtc_PeerConnection_getReceivers(peerConnection);
    }

    @Override
    public SessionDescription getRemoteDescription(PeerConnection peerConnection) {
        return (SessionDescription) GEN_JNI.org_webrtc_PeerConnection_getRemoteDescription(peerConnection);
    }

    @Override
    public List getSenders(PeerConnection peerConnection) {
        return (List) GEN_JNI.org_webrtc_PeerConnection_getSenders(peerConnection);
    }

    @Override
    public List getTransceivers(PeerConnection peerConnection) {
        return (List) GEN_JNI.org_webrtc_PeerConnection_getTransceivers(peerConnection);
    }

    @Override
    public PeerConnection.IceConnectionState iceConnectionState(PeerConnection peerConnection) {
        return (PeerConnection.IceConnectionState) GEN_JNI.org_webrtc_PeerConnection_iceConnectionState(peerConnection);
    }

    @Override
    public PeerConnection.IceGatheringState iceGatheringState(PeerConnection peerConnection) {
        return (PeerConnection.IceGatheringState) GEN_JNI.org_webrtc_PeerConnection_iceGatheringState(peerConnection);
    }

    @Override
    public void newGetStats(PeerConnection peerConnection, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        GEN_JNI.org_webrtc_PeerConnection_newGetStats(peerConnection, rTCStatsCollectorCallback);
    }

    @Override
    public void newGetStatsReceiver(PeerConnection peerConnection, long j, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        GEN_JNI.org_webrtc_PeerConnection_newGetStatsReceiver(peerConnection, j, rTCStatsCollectorCallback);
    }

    @Override
    public void newGetStatsSender(PeerConnection peerConnection, long j, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        GEN_JNI.org_webrtc_PeerConnection_newGetStatsSender(peerConnection, j, rTCStatsCollectorCallback);
    }

    @Override
    public boolean oldGetStats(PeerConnection peerConnection, StatsObserver statsObserver, long j) {
        return GEN_JNI.org_webrtc_PeerConnection_oldGetStats(peerConnection, statsObserver, j);
    }

    @Override
    public boolean removeIceCandidates(PeerConnection peerConnection, IceCandidate[] iceCandidateArr) {
        return GEN_JNI.org_webrtc_PeerConnection_removeIceCandidates(peerConnection, iceCandidateArr);
    }

    @Override
    public void removeLocalStream(PeerConnection peerConnection, long j) {
        GEN_JNI.org_webrtc_PeerConnection_removeLocalStream(peerConnection, j);
    }

    @Override
    public boolean removeTrack(PeerConnection peerConnection, long j) {
        return GEN_JNI.org_webrtc_PeerConnection_removeTrack(peerConnection, j);
    }

    @Override
    public void restartIce(PeerConnection peerConnection) {
        GEN_JNI.org_webrtc_PeerConnection_restartIce(peerConnection);
    }

    @Override
    public void setAudioPlayout(PeerConnection peerConnection, boolean z) {
        GEN_JNI.org_webrtc_PeerConnection_setAudioPlayout(peerConnection, z);
    }

    @Override
    public void setAudioRecording(PeerConnection peerConnection, boolean z) {
        GEN_JNI.org_webrtc_PeerConnection_setAudioRecording(peerConnection, z);
    }

    @Override
    public boolean setBitrate(PeerConnection peerConnection, Integer num, Integer num2, Integer num3) {
        return GEN_JNI.org_webrtc_PeerConnection_setBitrate(peerConnection, num, num2, num3);
    }

    @Override
    public boolean setConfiguration(PeerConnection peerConnection, PeerConnection.RTCConfiguration rTCConfiguration) {
        return GEN_JNI.org_webrtc_PeerConnection_setConfiguration(peerConnection, rTCConfiguration);
    }

    @Override
    public void setLocalDescription(PeerConnection peerConnection, SdpObserver sdpObserver, SessionDescription sessionDescription) {
        GEN_JNI.org_webrtc_PeerConnection_setLocalDescription(peerConnection, sdpObserver, sessionDescription);
    }

    @Override
    public void setLocalDescriptionAutomatically(PeerConnection peerConnection, SdpObserver sdpObserver) {
        GEN_JNI.org_webrtc_PeerConnection_setLocalDescriptionAutomatically(peerConnection, sdpObserver);
    }

    @Override
    public void setRemoteDescription(PeerConnection peerConnection, SdpObserver sdpObserver, SessionDescription sessionDescription) {
        GEN_JNI.org_webrtc_PeerConnection_setRemoteDescription(peerConnection, sdpObserver, sessionDescription);
    }

    @Override
    public PeerConnection.SignalingState signalingState(PeerConnection peerConnection) {
        return (PeerConnection.SignalingState) GEN_JNI.org_webrtc_PeerConnection_signalingState(peerConnection);
    }

    @Override
    public boolean startRtcEventLog(PeerConnection peerConnection, int i, int i2) {
        return GEN_JNI.org_webrtc_PeerConnection_startRtcEventLog(peerConnection, i, i2);
    }

    @Override
    public void stopRtcEventLog(PeerConnection peerConnection) {
        GEN_JNI.org_webrtc_PeerConnection_stopRtcEventLog(peerConnection);
    }
}
