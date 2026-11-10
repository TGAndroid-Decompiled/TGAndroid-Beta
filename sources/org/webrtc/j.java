package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f53066a;
    public final ByteBuffer f53067b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f53066a = i7;
        this.f53067b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f53066a) {
            case 0:
                JavaI420Buffer.a(this.f53067b);
                return;
            default:
                YuvConverter.a(this.f53067b);
                return;
        }
    }
}
