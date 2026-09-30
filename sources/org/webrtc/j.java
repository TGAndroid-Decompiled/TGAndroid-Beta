package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40731a;
    public final ByteBuffer f40732b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40731a = i10;
        this.f40732b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40731a) {
            case 0:
                JavaI420Buffer.a(this.f40732b);
                return;
            default:
                YuvConverter.a(this.f40732b);
                return;
        }
    }
}
