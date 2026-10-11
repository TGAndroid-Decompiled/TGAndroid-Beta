package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45195a;
    public final ByteBuffer f45196b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45195a = i10;
        this.f45196b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45195a) {
            case 0:
                JavaI420Buffer.a(this.f45196b);
                return;
            default:
                YuvConverter.a(this.f45196b);
                return;
        }
    }
}
