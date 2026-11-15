package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f54472a;
    public final ByteBuffer f54473b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f54472a = i7;
        this.f54473b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f54472a) {
            case 0:
                JavaI420Buffer.a(this.f54473b);
                return;
            default:
                YuvConverter.a(this.f54473b);
                return;
        }
    }
}
