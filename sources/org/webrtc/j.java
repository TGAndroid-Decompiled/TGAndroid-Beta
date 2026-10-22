package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43892a;
    public final ByteBuffer f43893b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43892a = i10;
        this.f43893b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43892a) {
            case 0:
                JavaI420Buffer.a(this.f43893b);
                return;
            default:
                YuvConverter.a(this.f43893b);
                return;
        }
    }
}
