package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40362a;
    public final ByteBuffer f40363b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40362a = i10;
        this.f40363b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40362a) {
            case 0:
                JavaI420Buffer.a(this.f40363b);
                return;
            default:
                YuvConverter.a(this.f40363b);
                return;
        }
    }
}
