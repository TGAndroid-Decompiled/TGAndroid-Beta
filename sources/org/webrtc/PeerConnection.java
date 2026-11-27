package org.webrtc;

import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.DataChannel;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpTransceiver;
public class PeerConnection {
    public static final int PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS = 32768;
    private final NativeLifecycleLock lifecycleLock;
    private final List<MediaStream> localStreams;
    private List<RtpReceiver> receivers;
    private List<RtpSender> senders;
    private List<RtpTransceiver> transceivers;

    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(256),
        CELLULAR_5G(512);
        
        private static final Map<Integer, AdapterType> BY_BITMASK = new HashMap();
        public final Integer bitMask;

        static {
            AdapterType[] values;
            for (AdapterType adapterType : values()) {
                BY_BITMASK.put(adapterType.bitMask, adapterType);
            }
        }

        AdapterType(Integer num) {
            this.bitMask = num;
        }

        public static AdapterType fromNativeIndex(int i) {
            return BY_BITMASK.get(Integer.valueOf(i));
        }
    }

    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        public static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        public static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    public enum KeyType {
        RSA,
        ECDSA
    }

    public interface Natives {
        boolean addIceCandidate(PeerConnection peerConnection, String str, int i, String str2);

        void addIceCandidateWithObserver(PeerConnection peerConnection, String str, int i, String str2, AddIceObserver addIceObserver);

        boolean addLocalStream(PeerConnection peerConnection, long j);

        RtpSender addTrack(PeerConnection peerConnection, long j, List<String> list);

        RtpTransceiver addTransceiverOfType(PeerConnection peerConnection, MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

        RtpTransceiver addTransceiverWithTrack(PeerConnection peerConnection, long j, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

        void close(PeerConnection peerConnection);

        PeerConnectionState connectionState(PeerConnection peerConnection);

        void createAnswer(PeerConnection peerConnection, SdpObserver sdpObserver, MediaConstraints mediaConstraints);

        DataChannel createDataChannel(PeerConnection peerConnection, String str, DataChannel.Init init);

        void createOffer(PeerConnection peerConnection, SdpObserver sdpObserver, MediaConstraints mediaConstraints);

        long createPeerConnectionObserver(Observer observer);

        RtpSender createSender(PeerConnection peerConnection, String str, String str2);

        void freeOwnedPeerConnection(long j);

        RtcCertificatePem getCertificate(PeerConnection peerConnection);

        SessionDescription getLocalDescription(PeerConnection peerConnection);

        long getNativePeerConnection(PeerConnection peerConnection);

        List<RtpReceiver> getReceivers(PeerConnection peerConnection);

        SessionDescription getRemoteDescription(PeerConnection peerConnection);

        List<RtpSender> getSenders(PeerConnection peerConnection);

        List<RtpTransceiver> getTransceivers(PeerConnection peerConnection);

        IceConnectionState iceConnectionState(PeerConnection peerConnection);

        IceGatheringState iceGatheringState(PeerConnection peerConnection);

        void newGetStats(PeerConnection peerConnection, RTCStatsCollectorCallback rTCStatsCollectorCallback);

        void newGetStatsReceiver(PeerConnection peerConnection, long j, RTCStatsCollectorCallback rTCStatsCollectorCallback);

        void newGetStatsSender(PeerConnection peerConnection, long j, RTCStatsCollectorCallback rTCStatsCollectorCallback);

        boolean oldGetStats(PeerConnection peerConnection, StatsObserver statsObserver, long j);

        boolean removeIceCandidates(PeerConnection peerConnection, IceCandidate[] iceCandidateArr);

        void removeLocalStream(PeerConnection peerConnection, long j);

        boolean removeTrack(PeerConnection peerConnection, long j);

        void restartIce(PeerConnection peerConnection);

        void setAudioPlayout(PeerConnection peerConnection, boolean z);

        void setAudioRecording(PeerConnection peerConnection, boolean z);

        boolean setBitrate(PeerConnection peerConnection, Integer num, Integer num2, Integer num3);

        boolean setConfiguration(PeerConnection peerConnection, RTCConfiguration rTCConfiguration);

        void setLocalDescription(PeerConnection peerConnection, SdpObserver sdpObserver, SessionDescription sessionDescription);

        void setLocalDescriptionAutomatically(PeerConnection peerConnection, SdpObserver sdpObserver);

        void setRemoteDescription(PeerConnection peerConnection, SdpObserver sdpObserver, SessionDescription sessionDescription);

        SignalingState signalingState(PeerConnection peerConnection);

        boolean startRtcEventLog(PeerConnection peerConnection, int i, int i2);

        void stopRtcEventLog(PeerConnection peerConnection);
    }

    public interface Observer {
        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onConnectionChange(PeerConnectionState peerConnectionState);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRemoveTrack(RtpReceiver rtpReceiver);

        void onRenegotiationNeeded();

        void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);

        void onSignalingChange(SignalingState signalingState);

        void onStandardizedIceConnectionChange(IceConnectionState iceConnectionState);

        void onTrack(RtpTransceiver rtpTransceiver);
    }

    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        public static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PortAllocatorFlags {
    }

    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    public static class RTCConfiguration {
        public RtcCertificatePem certificate;
        public List<IceServer> iceServers;
        public TurnCustomizer turnCustomizer;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public int audioJitterBufferMaxPackets = 200;
        public boolean audioJitterBufferFastAccelerate = false;
        public int iceConnectionReceivingTimeout = -1;
        public int iceBackupCandidatePairPingInterval = -1;
        public KeyType keyType = KeyType.ECDSA;
        public ContinualGatheringPolicy continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
        public int iceCandidatePoolSize = 0;
        @Deprecated
        public boolean pruneTurnPorts = false;
        public PortPrunePolicy turnPortPrunePolicy = PortPrunePolicy.NO_PRUNE;
        public boolean presumeWritableWhenFullyRelayed = false;
        public boolean surfaceIceCandidatesOnIceTransportTypeChanged = false;
        public Integer iceCheckIntervalStrongConnectivityMs = null;
        public Integer iceCheckIntervalWeakConnectivityMs = null;
        public Integer iceCheckMinInterval = null;
        public Integer iceUnwritableTimeMs = null;
        public Integer iceUnwritableMinChecks = null;
        public Integer stunCandidateKeepaliveIntervalMs = null;
        public Integer stableWritableConnectionPingIntervalMs = null;
        public boolean disableIPv6OnWifi = false;
        public int maxIPv6Networks = 5;
        public boolean enableDscp = false;
        public boolean enableCpuOveruseDetection = true;
        public boolean suspendBelowMinBitrate = false;
        public Integer screencastMinBitrate = null;
        public AdapterType networkPreference = AdapterType.UNKNOWN;
        public SdpSemantics sdpSemantics = SdpSemantics.UNIFIED_PLAN;
        public CryptoOptions cryptoOptions = null;
        public String turnLoggingId = null;
        public boolean enableImplicitRollback = false;
        public boolean offerExtmapAllowMixed = true;
        public int portAllocatorMinPort = 0;
        public int portAllocatorMaxPort = 0;
        public int portAllocatorFlags = 0;

        public RTCConfiguration(List<IceServer> list) {
            this.iceServers = list;
        }

        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        public BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        public RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        public CryptoOptions getCryptoOptions() {
            return this.cryptoOptions;
        }

        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        public boolean getEnableImplicitRollback() {
            return this.enableImplicitRollback;
        }

        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        public Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        public Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        public Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        public List<IceServer> getIceServers() {
            return this.iceServers;
        }

        public IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        public Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        public Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        public KeyType getKeyType() {
            return this.keyType;
        }

        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        public AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        public boolean getOfferExtmapAllowMixed() {
            return this.offerExtmapAllowMixed;
        }

        public int getPortAllocatorFlags() {
            return this.portAllocatorFlags;
        }

        public int getPortAllocatorMaxPort() {
            return this.portAllocatorMaxPort;
        }

        public int getPortAllocatorMinPort() {
            return this.portAllocatorMinPort;
        }

        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        public Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        public SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        public Integer getStableWritableConnectionPingIntervalMs() {
            return this.stableWritableConnectionPingIntervalMs;
        }

        public Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        public boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return this.surfaceIceCandidatesOnIceTransportTypeChanged;
        }

        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        public TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }

        public String getTurnLoggingId() {
            return this.turnLoggingId;
        }

        public PortPrunePolicy getTurnPortPrunePolicy() {
            return this.turnPortPrunePolicy;
        }
    }

    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        public static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(long j) {
        this.localStreams = new ArrayList();
        this.senders = new ArrayList();
        this.receivers = new ArrayList();
        this.transceivers = new ArrayList();
        this.lifecycleLock = new NativeLifecycleLock("PeerConnection", j);
    }

    private <T> T callWithNative(NativeLifecycleLock.NativeCallable<T> nativeCallable, T t) {
        return (T) this.lifecycleLock.callOrDefault((NativeLifecycleLock.NativeCallable<NativeLifecycleLock.NativeCallable<T>>) nativeCallable, (NativeLifecycleLock.NativeCallable<T>) t);
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return PeerConnectionJni.get().createPeerConnectionObserver(observer);
    }

    public Boolean lambda$addIceCandidate$13(IceCandidate iceCandidate) {
        return Boolean.valueOf(PeerConnectionJni.get().addIceCandidate(this, iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp));
    }

    public void lambda$addIceCandidate$14(IceCandidate iceCandidate, AddIceObserver addIceObserver) {
        PeerConnectionJni.get().addIceCandidateWithObserver(this, iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp, addIceObserver);
    }

    public Boolean lambda$addStream$16(MediaStream mediaStream, long j) {
        if (!PeerConnectionJni.get().addLocalStream(this, j)) {
            return Boolean.FALSE;
        }
        this.localStreams.add(mediaStream);
        return Boolean.TRUE;
    }

    public Boolean lambda$addStream$17(MediaStream mediaStream) {
        return (Boolean) mediaStream.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<j48>) new j48(this, mediaStream, (byte) 1), (j48) Boolean.FALSE);
    }

    public RtpSender lambda$addTrack$24(List list, long j) {
        RtpSender addTrack = PeerConnectionJni.get().addTrack(this, j, list);
        if (addTrack != null) {
            this.senders.add(addTrack);
            return addTrack;
        }
        grb.i("C++ addTrack failed.");
        return null;
    }

    public RtpSender lambda$addTrack$25(MediaStreamTrack mediaStreamTrack, List list) {
        return (RtpSender) mediaStreamTrack.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable<Object>) new rm6(this, list, (byte) 20));
    }

    public RtpTransceiver lambda$addTransceiver$28(RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, long j) {
        RtpTransceiver addTransceiverWithTrack = PeerConnectionJni.get().addTransceiverWithTrack(this, j, rtpTransceiverInit);
        if (addTransceiverWithTrack != null) {
            this.transceivers.add(addTransceiverWithTrack);
            return addTransceiverWithTrack;
        }
        grb.i("C++ addTransceiver failed.");
        return null;
    }

    public RtpTransceiver lambda$addTransceiver$29(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        return (RtpTransceiver) mediaStreamTrack.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable<Object>) new rm6(this, rtpTransceiverInit, (byte) 23));
    }

    public RtpTransceiver lambda$addTransceiver$30(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        RtpTransceiver addTransceiverOfType = PeerConnectionJni.get().addTransceiverOfType(this, mediaType, rtpTransceiverInit);
        if (addTransceiverOfType != null) {
            this.transceivers.add(addTransceiverOfType);
            return addTransceiverOfType;
        }
        grb.i("C++ addTransceiver failed.");
        return null;
    }

    public void lambda$close$45() {
        PeerConnectionJni.get().close(this);
    }

    public PeerConnectionState lambda$connectionState$43() {
        return PeerConnectionJni.get().connectionState(this);
    }

    public void lambda$createAnswer$5(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        PeerConnectionJni.get().createAnswer(this, sdpObserver, mediaConstraints);
    }

    public DataChannel lambda$createDataChannel$3(String str, DataChannel.Init init) {
        return PeerConnectionJni.get().createDataChannel(this, str, init);
    }

    public void lambda$createOffer$4(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        PeerConnectionJni.get().createOffer(this, sdpObserver, mediaConstraints);
    }

    public RtpSender lambda$createSender$20(String str, String str2) {
        RtpSender createSender = PeerConnectionJni.get().createSender(this, str, str2);
        if (createSender != null) {
            this.senders.add(createSender);
        }
        return createSender;
    }

    public void lambda$dispose$46(long j) {
        PeerConnectionJni.get().removeLocalStream(this, j);
    }

    public void lambda$dispose$47(MediaStream mediaStream) {
        mediaStream.lifecycleLock.runIfAlive((NativeLifecycleLock.NativePointerRunnable) new i48(this, (byte) 14));
    }

    public static void lambda$dispose$48(long j) {
        PeerConnectionJni.get().freeOwnedPeerConnection(j);
    }

    public RtcCertificatePem lambda$getCertificate$2() {
        return PeerConnectionJni.get().getCertificate(this);
    }

    public SessionDescription lambda$getLocalDescription$0() {
        return PeerConnectionJni.get().getLocalDescription(this);
    }

    public Long lambda$getNativePeerConnection$49() {
        return Long.valueOf(PeerConnectionJni.get().getNativePeerConnection(this));
    }

    public List lambda$getReceivers$22() {
        for (RtpReceiver rtpReceiver : this.receivers) {
            rtpReceiver.dispose();
        }
        List<RtpReceiver> receivers = PeerConnectionJni.get().getReceivers(this);
        this.receivers = receivers;
        return DesugarCollections.unmodifiableList(receivers);
    }

    public SessionDescription lambda$getRemoteDescription$1() {
        return PeerConnectionJni.get().getRemoteDescription(this);
    }

    public List lambda$getSenders$21() {
        for (RtpSender rtpSender : this.senders) {
            rtpSender.dispose();
        }
        List<RtpSender> senders = PeerConnectionJni.get().getSenders(this);
        this.senders = senders;
        return DesugarCollections.unmodifiableList(senders);
    }

    public Boolean lambda$getStats$31(StatsObserver statsObserver, long j) {
        return Boolean.valueOf(PeerConnectionJni.get().oldGetStats(this, statsObserver, j));
    }

    public Boolean lambda$getStats$32(MediaStreamTrack mediaStreamTrack, StatsObserver statsObserver) {
        if (mediaStreamTrack == null) {
            return Boolean.valueOf(PeerConnectionJni.get().oldGetStats(this, statsObserver, 0L));
        }
        return (Boolean) mediaStreamTrack.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<rm6>) new rm6(this, statsObserver, (byte) 18), (rm6) Boolean.FALSE);
    }

    public void lambda$getStats$33(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        PeerConnectionJni.get().newGetStats(this, rTCStatsCollectorCallback);
    }

    public void lambda$getStats$34(RTCStatsCollectorCallback rTCStatsCollectorCallback, long j) {
        PeerConnectionJni.get().newGetStatsSender(this, j, rTCStatsCollectorCallback);
    }

    public void lambda$getStats$35(RtpSender rtpSender, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        rtpSender.lifecycleLock.runIfAlive((NativeLifecycleLock.NativePointerRunnable) new l48(this, rTCStatsCollectorCallback, (byte) 1));
    }

    public void lambda$getStats$36(RTCStatsCollectorCallback rTCStatsCollectorCallback, long j) {
        PeerConnectionJni.get().newGetStatsReceiver(this, j, rTCStatsCollectorCallback);
    }

    public void lambda$getStats$37(RtpReceiver rtpReceiver, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        rtpReceiver.lifecycleLock.runIfAlive((NativeLifecycleLock.NativePointerRunnable) new l48(this, rTCStatsCollectorCallback, (byte) 0));
    }

    public List lambda$getTransceivers$23() {
        for (RtpTransceiver rtpTransceiver : this.transceivers) {
            rtpTransceiver.dispose();
        }
        List<RtpTransceiver> transceivers = PeerConnectionJni.get().getTransceivers(this);
        this.transceivers = transceivers;
        return DesugarCollections.unmodifiableList(transceivers);
    }

    public IceConnectionState lambda$iceConnectionState$42() {
        return PeerConnectionJni.get().iceConnectionState(this);
    }

    public IceGatheringState lambda$iceGatheringState$44() {
        return PeerConnectionJni.get().iceGatheringState(this);
    }

    public Boolean lambda$removeIceCandidates$15(IceCandidate[] iceCandidateArr) {
        return Boolean.valueOf(PeerConnectionJni.get().removeIceCandidates(this, iceCandidateArr));
    }

    public void lambda$removeStream$18(long j) {
        PeerConnectionJni.get().removeLocalStream(this, j);
    }

    public void lambda$removeStream$19(MediaStream mediaStream) {
        mediaStream.lifecycleLock.runIfAlive((NativeLifecycleLock.NativePointerRunnable) new i48(this, (byte) 16));
        this.localStreams.remove(mediaStream);
    }

    public Boolean lambda$removeTrack$26(long j) {
        return Boolean.valueOf(PeerConnectionJni.get().removeTrack(this, j));
    }

    public Boolean lambda$removeTrack$27(RtpSender rtpSender) {
        return (Boolean) rtpSender.lifecycleLock.callOrDefault((NativeLifecycleLock.NativePointerCallable<i48>) new i48(this, (byte) 2), (i48) Boolean.FALSE);
    }

    public void lambda$restartIce$9() {
        PeerConnectionJni.get().restartIce(this);
    }

    public void lambda$setAudioPlayout$10(boolean z) {
        PeerConnectionJni.get().setAudioPlayout(this, z);
    }

    public void lambda$setAudioRecording$11(boolean z) {
        PeerConnectionJni.get().setAudioRecording(this, z);
    }

    public Boolean lambda$setBitrate$38(Integer num, Integer num2, Integer num3) {
        return Boolean.valueOf(PeerConnectionJni.get().setBitrate(this, num, num2, num3));
    }

    public Boolean lambda$setConfiguration$12(RTCConfiguration rTCConfiguration) {
        return Boolean.valueOf(PeerConnectionJni.get().setConfiguration(this, rTCConfiguration));
    }

    public void lambda$setLocalDescription$6(SdpObserver sdpObserver) {
        PeerConnectionJni.get().setLocalDescriptionAutomatically(this, sdpObserver);
    }

    public void lambda$setLocalDescription$7(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        PeerConnectionJni.get().setLocalDescription(this, sdpObserver, sessionDescription);
    }

    public void lambda$setRemoteDescription$8(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        PeerConnectionJni.get().setRemoteDescription(this, sdpObserver, sessionDescription);
    }

    public SignalingState lambda$signalingState$41() {
        return PeerConnectionJni.get().signalingState(this);
    }

    public Boolean lambda$startRtcEventLog$39(int i, int i2) {
        return Boolean.valueOf(PeerConnectionJni.get().startRtcEventLog(this, i, i2));
    }

    public void lambda$stopRtcEventLog$40() {
        PeerConnectionJni.get().stopRtcEventLog(this);
    }

    private void runWithNative(NativeLifecycleLock.NativeRunnable nativeRunnable) {
        this.lifecycleLock.runIfAlive(nativeRunnable);
    }

    public boolean addIceCandidate(IceCandidate iceCandidate) {
        return ((Boolean) callWithNative(new rm6(this, iceCandidate, (byte) 22), Boolean.FALSE)).booleanValue();
    }

    public boolean addStream(MediaStream mediaStream) {
        return ((Boolean) callWithNative(new j48(this, mediaStream, (byte) 2), Boolean.FALSE)).booleanValue();
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, List<String> list) {
        if (mediaStreamTrack != null && list != null) {
            return (RtpSender) this.lifecycleLock.call(new fu2(this, mediaStreamTrack, list, (byte) 28));
        }
        p3d.h("No MediaStreamTrack specified in addTrack.");
        return null;
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaStreamTrack != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
            }
            return (RtpTransceiver) this.lifecycleLock.call(new fu2(this, mediaStreamTrack, rtpTransceiverInit, (byte) 25));
        }
        p3d.h("No MediaStreamTrack specified for addTransceiver.");
        return null;
    }

    public void close() {
        runWithNative(new i48(this, (byte) 6));
    }

    public PeerConnectionState connectionState() {
        return (PeerConnectionState) callWithNative(new i48(this, (byte) 0), PeerConnectionState.CLOSED);
    }

    public void createAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        runWithNative(new m48(this, sdpObserver, mediaConstraints, (byte) 1));
    }

    public DataChannel createDataChannel(String str, DataChannel.Init init) {
        return (DataChannel) callWithNative(new fu2(this, str, init, (byte) 22), null);
    }

    public void createOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        runWithNative(new m48(this, sdpObserver, mediaConstraints, (byte) 0));
    }

    public RtpSender createSender(String str, String str2) {
        return (RtpSender) callWithNative(new o48(this, str, str2, (byte) 0), null);
    }

    public void dispose() {
        if (this.lifecycleLock.isDisposed()) {
            return;
        }
        close();
        for (MediaStream mediaStream : this.localStreams) {
            runWithNative(new j48(this, mediaStream, (byte) 3));
            mediaStream.dispose();
        }
        this.localStreams.clear();
        for (RtpSender rtpSender : this.senders) {
            rtpSender.dispose();
        }
        this.senders.clear();
        for (RtpReceiver rtpReceiver : this.receivers) {
            rtpReceiver.dispose();
        }
        for (RtpTransceiver rtpTransceiver : this.transceivers) {
            rtpTransceiver.dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        this.lifecycleLock.dispose(new ku7((byte) 13));
    }

    public RtcCertificatePem getCertificate() {
        return (RtcCertificatePem) callWithNative(new i48(this, (byte) 15), null);
    }

    public SessionDescription getLocalDescription() {
        return (SessionDescription) callWithNative(new i48(this, (byte) 13), null);
    }

    public long getNativeOwnedPeerConnection() {
        return this.lifecycleLock.getNativePointer();
    }

    public long getNativePeerConnection() {
        return ((Long) callWithNative(new i48(this, (byte) 5), 0L)).longValue();
    }

    public List<RtpReceiver> getReceivers() {
        return (List) callWithNative(new i48(this, (byte) 12), Collections.EMPTY_LIST);
    }

    public SessionDescription getRemoteDescription() {
        return (SessionDescription) callWithNative(new i48(this, (byte) 4), null);
    }

    public List<RtpSender> getSenders() {
        return (List) callWithNative(new i48(this, (byte) 8), Collections.EMPTY_LIST);
    }

    @Deprecated
    public boolean getStats(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        return ((Boolean) callWithNative(new fu2(this, mediaStreamTrack, statsObserver, (byte) 26), Boolean.FALSE)).booleanValue();
    }

    public List<RtpTransceiver> getTransceivers() {
        return (List) callWithNative(new i48(this, (byte) 10), Collections.EMPTY_LIST);
    }

    public IceConnectionState iceConnectionState() {
        return (IceConnectionState) callWithNative(new i48(this, (byte) 3), IceConnectionState.CLOSED);
    }

    public IceGatheringState iceGatheringState() {
        return (IceGatheringState) callWithNative(new i48(this, (byte) 11), IceGatheringState.COMPLETE);
    }

    public boolean removeIceCandidates(IceCandidate[] iceCandidateArr) {
        return ((Boolean) callWithNative(new rm6(this, iceCandidateArr, (byte) 21), Boolean.FALSE)).booleanValue();
    }

    public void removeStream(MediaStream mediaStream) {
        runWithNative(new j48(this, mediaStream, (byte) 0));
    }

    public boolean removeTrack(RtpSender rtpSender) {
        if (rtpSender != null) {
            return ((Boolean) callWithNative(new rm6(this, rtpSender, (byte) 17), Boolean.FALSE)).booleanValue();
        }
        p3d.h("No RtpSender specified for removeTrack.");
        return false;
    }

    public void restartIce() {
        runWithNative(new i48(this, (byte) 7));
    }

    public void setAudioPlayout(boolean z) {
        runWithNative(new k48(this, z, (byte) 1));
    }

    public void setAudioRecording(boolean z) {
        runWithNative(new k48(this, z, (byte) 0));
    }

    public boolean setBitrate(Integer num, Integer num2, Integer num3) {
        return ((Boolean) callWithNative(new pt(this, num, num2, num3, (byte) 17), Boolean.FALSE)).booleanValue();
    }

    public boolean setConfiguration(RTCConfiguration rTCConfiguration) {
        return ((Boolean) callWithNative(new rm6(this, rTCConfiguration, (byte) 19), Boolean.FALSE)).booleanValue();
    }

    public void setLocalDescription(SdpObserver sdpObserver) {
        runWithNative(new rm6(this, sdpObserver, (byte) 24));
    }

    public void setRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        runWithNative(new n48(this, sdpObserver, sessionDescription, (byte) 1));
    }

    public SignalingState signalingState() {
        return (SignalingState) callWithNative(new i48(this, (byte) 9), SignalingState.CLOSED);
    }

    public boolean startRtcEventLog(int i, int i2) {
        return ((Boolean) callWithNative(new wr3(i, i2, this), Boolean.FALSE)).booleanValue();
    }

    public void stopRtcEventLog() {
        runWithNative(new i48(this, (byte) 1));
    }

    public static class IceServer {
        public final String hostname;
        public final String password;
        public final List<String> tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List<String> tlsEllipticCurves;
        @Deprecated
        public final String uri;
        public final List<String> urls;
        public final String username;

        private IceServer(String str, List<String> list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4, List<String> list2, List<String> list3) {
            if (str != null && list != null && !list.isEmpty()) {
                for (String str5 : list) {
                    if (str5 == null) {
                        lq5.q(list, "urls element is null: ");
                        throw null;
                    }
                }
                if (str2 != null) {
                    if (str3 != null) {
                        if (str4 != null) {
                            this.uri = str;
                            this.urls = list;
                            this.username = str2;
                            this.password = str3;
                            this.tlsCertPolicy = tlsCertPolicy;
                            this.hostname = str4;
                            this.tlsAlpnProtocols = list2;
                            this.tlsEllipticCurves = list3;
                            return;
                        }
                        lq5.j("hostname == null");
                        throw null;
                    }
                    lq5.j("password == null");
                    throw null;
                }
                lq5.j("username == null");
                throw null;
            }
            lq5.j("uri == null || urls == null || urls.isEmpty()");
            throw null;
        }

        public static Builder builder(String str) {
            return new Builder(0, Collections.singletonList(str));
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IceServer)) {
                return false;
            }
            IceServer iceServer = (IceServer) obj;
            if (!this.uri.equals(iceServer.uri) || !this.urls.equals(iceServer.urls) || !this.username.equals(iceServer.username) || !this.password.equals(iceServer.password) || !this.tlsCertPolicy.equals(iceServer.tlsCertPolicy) || !this.hostname.equals(iceServer.hostname) || !this.tlsAlpnProtocols.equals(iceServer.tlsAlpnProtocols) || !this.tlsEllipticCurves.equals(iceServer.tlsEllipticCurves)) {
                return false;
            }
            return true;
        }

        public String getHostname() {
            return this.hostname;
        }

        public String getPassword() {
            return this.password;
        }

        public List<String> getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        public TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        public List<String> getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        public List<String> getUrls() {
            return this.urls;
        }

        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.uri, this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves});
        }

        public String toString() {
            return this.urls + " [" + this.username + ":" + this.password + "] [" + this.tlsCertPolicy + "] [" + this.hostname + "] [" + this.tlsAlpnProtocols + "] [" + this.tlsEllipticCurves + "]";
        }

        public static Builder builder(List<String> list) {
            return new Builder(0, list);
        }

        public static class Builder {
            private String hostname;
            private String password;
            private List<String> tlsAlpnProtocols;
            private TlsCertPolicy tlsCertPolicy;
            private List<String> tlsEllipticCurves;
            private final List<String> urls;
            private String username;

            private Builder(List<String> list) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (list != null && !list.isEmpty()) {
                    this.urls = list;
                } else {
                    lq5.q(list, "urls == null || urls.isEmpty(): ");
                    throw null;
                }
            }

            public IceServer createIceServer() {
                return new IceServer(this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves, 0);
            }

            public Builder setHostname(String str) {
                this.hostname = str;
                return this;
            }

            public Builder setPassword(String str) {
                this.password = str;
                return this;
            }

            public Builder setTlsAlpnProtocols(List<String> list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy) {
                this.tlsCertPolicy = tlsCertPolicy;
                return this;
            }

            public Builder setTlsEllipticCurves(List<String> list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }

            public Builder(int i, List list) {
                this(list);
            }
        }

        @Deprecated
        public IceServer(String str) {
            this(str, "", "");
        }

        @Deprecated
        public IceServer(String str, String str2, String str3) {
            this(str, str2, str3, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy) {
            this(str, str2, str3, tlsCertPolicy, "");
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4) {
            this(str, Collections.singletonList(str), str2, str3, tlsCertPolicy, str4, null, null);
        }

        public IceServer(String str, List list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4, List list2, List list3, int i) {
            this(str, list, str2, str3, tlsCertPolicy, str4, list2, list3);
        }
    }

    public void setLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        runWithNative(new n48(this, sdpObserver, sessionDescription, (byte) 0));
    }

    public void addIceCandidate(IceCandidate iceCandidate, AddIceObserver addIceObserver) {
        runWithNative(new fu2(this, iceCandidate, addIceObserver, (byte) 27));
    }

    public void getStats(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        runWithNative(new l48(this, rTCStatsCollectorCallback, (byte) 2));
    }

    public void getStats(RtpSender rtpSender, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        runWithNative(new fu2(this, rtpSender, rTCStatsCollectorCallback, (byte) 24));
    }

    public void getStats(RtpReceiver rtpReceiver, RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        runWithNative(new fu2(this, rtpReceiver, rTCStatsCollectorCallback, (byte) 23));
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, Collections.EMPTY_LIST);
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
            }
            return (RtpTransceiver) this.lifecycleLock.call(new fu2(this, mediaType, rtpTransceiverInit, (byte) 29));
        }
        p3d.h("No MediaType specified for addTransceiver.");
        return null;
    }

    public PeerConnection(NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }
}
