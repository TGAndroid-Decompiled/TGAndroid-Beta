package org.webrtc;

public class OpenH264Encoder extends WrappedNativeVideoEncoder {
    static native long nativeCreateEncoder();

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }

    @Override
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }
}
