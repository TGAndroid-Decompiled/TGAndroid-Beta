package org.webrtc;
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {

    public interface Natives {
        long createDecoder(long j);
    }

    @Override
    public long createNative(long j) {
        return LibvpxVp8DecoderJni.get().createDecoder(j);
    }
}
