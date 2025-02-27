package org.webrtc;

public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    @Override
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
