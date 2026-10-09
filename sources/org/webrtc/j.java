package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45125a;
    public final ByteBuffer f45126b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45125a = i10;
        this.f45126b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45125a) {
            case 0:
                JavaI420Buffer.a(this.f45126b);
                return;
            default:
                YuvConverter.a(this.f45126b);
                return;
        }
    }
}
