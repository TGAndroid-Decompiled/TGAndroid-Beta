package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43879a;
    public final ByteBuffer f43880b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43879a = i10;
        this.f43880b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43879a) {
            case 0:
                JavaI420Buffer.a(this.f43880b);
                return;
            default:
                YuvConverter.a(this.f43880b);
                return;
        }
    }
}
