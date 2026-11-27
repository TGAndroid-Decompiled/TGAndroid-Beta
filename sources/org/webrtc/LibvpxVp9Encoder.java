package org.webrtc;
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {

    public interface Natives {
        long create(long j);

        boolean isSupported();
    }

    @Override
    public long createNative(long j) {
        return LibvpxVp9EncoderJni.get().create(j);
    }

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }
}
