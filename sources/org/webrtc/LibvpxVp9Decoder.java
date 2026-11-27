package org.webrtc;
public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {

    public interface Natives {
        long createDecoder();

        boolean isSupported();
    }

    @Override
    public long createNative(long j) {
        return LibvpxVp9DecoderJni.get().createDecoder();
    }
}
