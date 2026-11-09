package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f53067a;
    public final ByteBuffer f53068b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f53067a = i7;
        this.f53068b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f53067a) {
            case 0:
                JavaI420Buffer.a(this.f53068b);
                return;
            default:
                YuvConverter.a(this.f53068b);
                return;
        }
    }
}
