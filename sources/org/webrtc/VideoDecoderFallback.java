package org.webrtc;

public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    private final VideoDecoder fallback;
    private final VideoDecoder primary;

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    private static native long nativeCreate(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    @Override
    public long createNative(long j) {
        return nativeCreate(j, this.fallback, this.primary);
    }
}
