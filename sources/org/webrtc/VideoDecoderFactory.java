package org.webrtc;

public interface VideoDecoderFactory {

    public abstract class CC {
        public static VideoDecoder $default$createDecoder(VideoDecoderFactory videoDecoderFactory, String str) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }

        public static VideoCodecInfo[] $default$getSupportedCodecs(VideoDecoderFactory videoDecoderFactory) {
            return new VideoCodecInfo[0];
        }
    }

    @Deprecated
    VideoDecoder createDecoder(String str);

    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
