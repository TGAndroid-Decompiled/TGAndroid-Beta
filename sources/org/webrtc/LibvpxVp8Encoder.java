package org.webrtc;
public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {

    public interface Natives {
        long create(long j);
    }

    @Override
    public long createNative(long j) {
        return LibvpxVp8EncoderJni.get().create(j);
    }

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }
}
