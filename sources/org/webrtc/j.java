package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f46488a;
    public final ByteBuffer f46489b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f46488a = i10;
        this.f46489b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f46488a) {
            case 0:
                JavaI420Buffer.a(this.f46489b);
                return;
            default:
                YuvConverter.a(this.f46489b);
                return;
        }
    }
}
