package org.webrtc;

public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    public static native boolean nativeIsSupported();

    @Override
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }
}
