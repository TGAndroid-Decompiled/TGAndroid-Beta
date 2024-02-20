package org.webrtc;
public class OpenH264Decoder extends WrappedNativeVideoDecoder {
    static native long nativeCreateDecoder();

    static native boolean nativeIsSupported();

    @Override
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
