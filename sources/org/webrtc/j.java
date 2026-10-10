package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45171a;
    public final ByteBuffer f45172b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45171a = i10;
        this.f45172b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45171a) {
            case 0:
                JavaI420Buffer.a(this.f45172b);
                return;
            default:
                YuvConverter.a(this.f45172b);
                return;
        }
    }
}
