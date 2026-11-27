package org.webrtc;
public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    private final VideoDecoder fallback;
    private final VideoDecoder primary;

    public interface Natives {
        long create(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2);
    }

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    @Override
    public long createNative(long j) {
        return VideoDecoderFallbackJni.get().create(j, this.fallback, this.primary);
    }
}
