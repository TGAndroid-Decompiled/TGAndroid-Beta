package org.webrtc;
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder(long j3);

    @Override
    public long createNative(long j3) {
        return nativeCreateDecoder(j3);
    }
}
