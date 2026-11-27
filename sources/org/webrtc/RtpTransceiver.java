package org.webrtc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpParameters;
public class RtpTransceiver {
    private final RtpReceiver cachedReceiver;
    private final RtpSender cachedSender;
    private final NativeLifecycleLock lifecycleLock;

    public interface Natives {
        RtpTransceiverDirection currentDirection(long j);

        RtpTransceiverDirection direction(long j);

        MediaStreamTrack.MediaType getMediaType(long j);

        String getMid(long j);

        RtpReceiver getReceiver(long j);

        RtpSender getSender(long j);

        RtcError setCodecPreferences(long j, List<RtpCapabilities.CodecCapability> list);

        boolean setDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

        void stopInternal(long j);

        void stopStandard(long j);

        boolean stopped(long j);
    }

    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3),
        STOPPED(4);
        
        private final int nativeIndex;

        RtpTransceiverDirection(int i) {
            this.nativeIndex = i;
        }

        public static RtpTransceiverDirection fromNativeIndex(int i) {
            RtpTransceiverDirection[] values;
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            lq5.j(uh9.k(i, "Uknown native RtpTransceiverDirection type"));
            return null;
        }

        public int getNativeIndex() {
            return this.nativeIndex;
        }
    }

    public RtpTransceiver(long j) {
        this.lifecycleLock = new NativeLifecycleLock("RtpTransceiver", j);
        this.cachedSender = RtpTransceiverJni.get().getSender(j);
        this.cachedReceiver = RtpTransceiverJni.get().getReceiver(j);
    }

    public void lambda$dispose$10(long j) {
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(j);
    }

    public static RtpTransceiverDirection lambda$getCurrentDirection$4(long j) {
        return RtpTransceiverJni.get().currentDirection(j);
    }

    public static RtpTransceiverDirection lambda$getDirection$3(long j) {
        return RtpTransceiverJni.get().direction(j);
    }

    public static MediaStreamTrack.MediaType lambda$getMediaType$0(long j) {
        return RtpTransceiverJni.get().getMediaType(j);
    }

    public static String lambda$getMid$1(long j) {
        return RtpTransceiverJni.get().getMid(j);
    }

    public static Boolean lambda$isStopped$2(long j) {
        return Boolean.valueOf(RtpTransceiverJni.get().stopped(j));
    }

    public static RtcError lambda$setCodecPreferences$7(List list, long j) {
        return RtpTransceiverJni.get().setCodecPreferences(j, list);
    }

    public static Boolean lambda$setDirection$5(RtpTransceiverDirection rtpTransceiverDirection, long j) {
        return Boolean.valueOf(RtpTransceiverJni.get().setDirection(j, rtpTransceiverDirection));
    }

    public static void lambda$stop$6(long j) {
        RtpTransceiverJni.get().stopInternal(j);
    }

    public static void lambda$stopInternal$8(long j) {
        RtpTransceiverJni.get().stopInternal(j);
    }

    public static void lambda$stopStandard$9(long j) {
        RtpTransceiverJni.get().stopStandard(j);
    }

    public void dispose() {
        this.lifecycleLock.dispose(new ye9(this, (byte) 20));
    }

    public RtpTransceiverDirection getCurrentDirection() {
        return (RtpTransceiverDirection) this.lifecycleLock.call(new iy8((byte) 25));
    }

    public RtpTransceiverDirection getDirection() {
        return (RtpTransceiverDirection) this.lifecycleLock.call(new vr9((byte) 0));
    }

    public MediaStreamTrack.MediaType getMediaType() {
        return (MediaStreamTrack.MediaType) this.lifecycleLock.call(new vr9((byte) 2));
    }

    public String getMid() {
        return (String) this.lifecycleLock.call(new iy8((byte) 27));
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        return ((Boolean) this.lifecycleLock.call(new iy8((byte) 28))).booleanValue();
    }

    public RtcError setCodecPreferences(List<RtpCapabilities.CodecCapability> list) {
        return (RtcError) this.lifecycleLock.call(new ur9(list));
    }

    public boolean setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        return ((Boolean) this.lifecycleLock.call(new ye9(rtpTransceiverDirection, (byte) 19))).booleanValue();
    }

    public void stop() {
        this.lifecycleLock.run(new iy8((byte) 26));
    }

    public void stopInternal() {
        this.lifecycleLock.run(new iy8((byte) 29));
    }

    public void stopStandard() {
        this.lifecycleLock.run(new vr9((byte) 1));
    }

    public static final class RtpTransceiverInit {
        private final RtpTransceiverDirection direction;
        private final List<RtpParameters.Encoding> sendEncodings;
        private final List<String> streamIds;

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list, List<RtpParameters.Encoding> list2) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new ArrayList(list);
            this.sendEncodings = new ArrayList(list2);
        }

        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        public List<RtpParameters.Encoding> getSendEncodings() {
            return new ArrayList(this.sendEncodings);
        }

        public List<String> getStreamIds() {
            return new ArrayList(this.streamIds);
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection r2) {
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RtpTransceiver.RtpTransceiverInit.<init>(org.webrtc.RtpTransceiver$RtpTransceiverDirection):void");
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list) {
            this(rtpTransceiverDirection, list, Collections.EMPTY_LIST);
        }

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }
    }
}
