package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40313a;
    public final ByteBuffer f40314b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40313a = i10;
        this.f40314b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40313a) {
            case 0:
                JavaI420Buffer.a(this.f40314b);
                return;
            default:
                YuvConverter.a(this.f40314b);
                return;
        }
    }
}
