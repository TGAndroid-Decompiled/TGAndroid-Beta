package org.webrtc;

public class Dav1dDecoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    @Override
    public long createNative(long j) {
        return nativeCreateDecoder();
    }
}
