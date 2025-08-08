package org.webrtc;

public class LibaomAv1Encoder extends WrappedNativeVideoEncoder {
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
