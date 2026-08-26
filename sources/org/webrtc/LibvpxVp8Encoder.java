package org.webrtc;

public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    @Override
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }
}
