package org.webrtc;

import java.util.List;
public class RtpSender {
    private MediaStreamTrack cachedTrack;
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    public RtpSender(long j3) {
        this.nativeRtpSender = j3;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j3));
        if (nativeGetMediaType(j3).equalsIgnoreCase("audio")) {
            long nativeGetDtmfSender = nativeGetDtmfSender(j3);
            this.dtmfSender = nativeGetDtmfSender != 0 ? new DtmfSender(nativeGetDtmfSender) : null;
            return;
        }
        this.dtmfSender = null;
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender != 0) {
            return;
        }
        throw new IllegalStateException("RtpSender has been disposed.");
    }

    private static native long nativeGetDtmfSender(long j3);

    private static native String nativeGetId(long j3);

    private static native String nativeGetMediaType(long j3);

    private static native RtpParameters nativeGetParameters(long j3);

    private static native List<String> nativeGetStreams(long j3);

    private static native long nativeGetTrack(long j3);

    private static native void nativeSetFrameEncryptor(long j3, long j10);

    private static native boolean nativeSetParameters(long j3, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j3, List<String> list);

    private static native boolean nativeSetTrack(long j3, long j10);

    public void dispose() {
        checkRtpSenderExists();
        DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0L;
    }

    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public List<String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(List<String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(MediaStreamTrack mediaStreamTrack, boolean z10) {
        long nativeMediaStreamTrack;
        checkRtpSenderExists();
        long j3 = this.nativeRtpSender;
        if (mediaStreamTrack == null) {
            nativeMediaStreamTrack = 0;
        } else {
            nativeMediaStreamTrack = mediaStreamTrack.getNativeMediaStreamTrack();
        }
        if (!nativeSetTrack(j3, nativeMediaStreamTrack)) {
            return false;
        }
        MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z10;
        return true;
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
