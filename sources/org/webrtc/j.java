package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43946a;
    public final ByteBuffer f43947b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43946a = i10;
        this.f43947b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43946a) {
            case 0:
                JavaI420Buffer.a(this.f43947b);
                return;
            default:
                YuvConverter.a(this.f43947b);
                return;
        }
    }
}
