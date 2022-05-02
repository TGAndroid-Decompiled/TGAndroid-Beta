package org.webrtc;

public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    static native long nativeCreateEncoder();

    public static native boolean nativeIsSupported();

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }

    @Override
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }
}
