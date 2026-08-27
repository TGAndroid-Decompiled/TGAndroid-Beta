package org.webrtc;

public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder(long j10);

    @Override
    public long createNative(long j10) {
        return nativeCreateDecoder(j10);
    }
}
