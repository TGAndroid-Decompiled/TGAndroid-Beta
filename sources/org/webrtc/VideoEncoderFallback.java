package org.webrtc;
public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    private final VideoEncoder fallback;
    private final VideoEncoder primary;

    public interface Natives {
        long create(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2);
    }

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    @Override
    public long createNative(long j) {
        return VideoEncoderFallbackJni.get().create(j, this.fallback, this.primary);
    }

    @Override
    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }
}
