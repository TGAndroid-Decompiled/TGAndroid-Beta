package org.webrtc;

import java.nio.ByteBuffer;
public final class k implements Runnable {
    public final int f42800a;
    public final ByteBuffer f42801b;

    public k(int i10, ByteBuffer byteBuffer) {
        this.f42800a = i10;
        this.f42801b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f42800a) {
            case 0:
                JavaI420Buffer.a(this.f42801b);
                return;
            default:
                YuvConverter.a(this.f42801b);
                return;
        }
    }
}
