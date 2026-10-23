package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43893a;
    public final ByteBuffer f43894b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43893a = i10;
        this.f43894b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43893a) {
            case 0:
                JavaI420Buffer.a(this.f43894b);
                return;
            default:
                YuvConverter.a(this.f43894b);
                return;
        }
    }
}
