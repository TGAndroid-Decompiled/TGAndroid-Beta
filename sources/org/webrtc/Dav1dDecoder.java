package org.webrtc;
public class Dav1dDecoder extends WrappedNativeVideoDecoder {

    public interface Natives {
        long createDecoder();
    }

    @Override
    public long createNative(long j) {
        return Dav1dDecoderJni.get().createDecoder();
    }
}
