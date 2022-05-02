package org.webrtc;

public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder();

    @Override
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
