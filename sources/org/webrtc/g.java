package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoderWrapper;
import org.webrtc.VideoEncoderWrapper;
public final class g implements NativeLifecycleLock.NativeDisposer {
    public final byte a;

    public g(byte b) {
        this.a = b;
    }

    @Override
    public final void dispose(long j) {
        switch (this.a) {
            case 0:
                VideoDecoderWrapper.NativeDecoderCallback.b(j);
                return;
            default:
                VideoEncoderWrapper.NativeEncoderCallback.b(j);
                return;
        }
    }
}
