package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f44307a;
    public final ByteBuffer f44308b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f44307a = i10;
        this.f44308b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f44307a) {
            case 0:
                JavaI420Buffer.a(this.f44308b);
                return;
            default:
                YuvConverter.a(this.f44308b);
                return;
        }
    }
}
