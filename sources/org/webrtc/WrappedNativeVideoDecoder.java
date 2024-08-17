package org.webrtc;

import org.webrtc.VideoDecoder;

public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override
    public abstract long createNativeVideoDecoder();

    @Override
    public final VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final boolean getPrefersLateDecoding() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
