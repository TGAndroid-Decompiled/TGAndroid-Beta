package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f55086a;
    public final ByteBuffer f55087b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f55086a = i7;
        this.f55087b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f55086a) {
            case 0:
                JavaI420Buffer.a(this.f55087b);
                return;
            default:
                YuvConverter.a(this.f55087b);
                return;
        }
    }
}
