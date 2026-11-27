package org.webrtc;

import org.webrtc.MediaStreamTrack;
public class RtpReceiver {
    private final MediaStreamTrack cachedTrack;
    final NativeLifecycleLock lifecycleLock;
    private long nativeObserver;

    public interface Natives {
        String getId(long j);

        RtpParameters getParameters(long j);

        long getTrack(long j);

        void setFrameDecryptor(long j, long j2);

        long setObserver(long j, Observer observer);

        void unsetObserver(long j, long j2);
    }

    public interface Observer {
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);

        void onFirstPacketReceivedAfterReceptiveChange(MediaStreamTrack.MediaType mediaType);
    }

    public RtpReceiver(long j) {
        this.lifecycleLock = new NativeLifecycleLock("RtpReceiver", j);
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(RtpReceiverJni.get().getTrack(j));
    }

    public static String b(long j) {
        return lambda$id$1(j);
    }

    public static RtpParameters d(long j) {
        return lambda$getParameters$0(j);
    }

    public void lambda$SetObserver$3(long j) {
        if (this.nativeObserver != 0) {
            RtpReceiverJni.get().unsetObserver(j, this.nativeObserver);
            this.nativeObserver = 0L;
        }
    }

    public void lambda$SetObserver$4(Observer observer, long j) {
        if (this.nativeObserver != 0) {
            RtpReceiverJni.get().unsetObserver(j, this.nativeObserver);
        }
        this.nativeObserver = RtpReceiverJni.get().setObserver(j, observer);
    }

    public void lambda$dispose$2(long j) {
        this.cachedTrack.dispose();
        if (this.nativeObserver != 0) {
            RtpReceiverJni.get().unsetObserver(j, this.nativeObserver);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(j);
    }

    public static RtpParameters lambda$getParameters$0(long j) {
        return RtpReceiverJni.get().getParameters(j);
    }

    public static String lambda$id$1(long j) {
        return RtpReceiverJni.get().getId(j);
    }

    public static void lambda$setFrameDecryptor$5(FrameDecryptor frameDecryptor, long j) {
        RtpReceiverJni.get().setFrameDecryptor(j, frameDecryptor.getNativeFrameDecryptor());
    }

    public void SetObserver(Observer observer) {
        NativeLifecycleLock nativeLifecycleLock = this.lifecycleLock;
        if (observer == null) {
            nativeLifecycleLock.runIfAlive(new tr9(this));
        } else {
            nativeLifecycleLock.run(new m88(this, observer, (byte) 28));
        }
    }

    public void dispose() {
        this.lifecycleLock.dispose(new tr9(this));
    }

    public long getNativeRtpReceiver() {
        return this.lifecycleLock.getNativePointer();
    }

    public RtpParameters getParameters() {
        return (RtpParameters) this.lifecycleLock.call(new iy8((byte) 20));
    }

    public String id() {
        return (String) this.lifecycleLock.call(new iy8((byte) 21));
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        this.lifecycleLock.run(new ye9(frameDecryptor, (byte) 15));
    }

    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
