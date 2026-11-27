package org.webrtc;
public class LibaomAv1Encoder extends WrappedNativeVideoEncoder {

    public interface Natives {
        long create(long j);
    }

    @Override
    public long createNative(long j) {
        return LibaomAv1EncoderJni.get().create(j);
    }

    @Override
    public boolean isHardwareEncoder() {
        return false;
    }
}
