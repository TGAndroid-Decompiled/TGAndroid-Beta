package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43632a;
    public final ByteBuffer f43633b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43632a = i10;
        this.f43633b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43632a) {
            case 0:
                JavaI420Buffer.a(this.f43633b);
                return;
            default:
                YuvConverter.a(this.f43633b);
                return;
        }
    }
}
