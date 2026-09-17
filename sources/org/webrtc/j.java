package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43606a;
    public final ByteBuffer f43607b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43606a = i10;
        this.f43607b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43606a) {
            case 0:
                JavaI420Buffer.a(this.f43607b);
                return;
            default:
                YuvConverter.a(this.f43607b);
                return;
        }
    }
}
