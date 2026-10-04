package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43954a;
    public final ByteBuffer f43955b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43954a = i10;
        this.f43955b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43954a) {
            case 0:
                JavaI420Buffer.a(this.f43955b);
                return;
            default:
                YuvConverter.a(this.f43955b);
                return;
        }
    }
}
