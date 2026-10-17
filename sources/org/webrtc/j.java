package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43907a;
    public final ByteBuffer f43908b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43907a = i10;
        this.f43908b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43907a) {
            case 0:
                JavaI420Buffer.a(this.f43908b);
                return;
            default:
                YuvConverter.a(this.f43908b);
                return;
        }
    }
}
