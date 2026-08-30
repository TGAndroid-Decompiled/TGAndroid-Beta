package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40907a;
    public final ByteBuffer f40908b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40907a = i10;
        this.f40908b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40907a) {
            case 0:
                JavaI420Buffer.a(this.f40908b);
                return;
            default:
                YuvConverter.a(this.f40908b);
                return;
        }
    }
}
