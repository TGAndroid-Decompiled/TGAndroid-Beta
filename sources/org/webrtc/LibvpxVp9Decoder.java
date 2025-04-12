package org.webrtc;

public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder();

    static native boolean nativeIsSupported();

    @Override
    public long createNative(long j) {
        return nativeCreateDecoder();
    }
}
