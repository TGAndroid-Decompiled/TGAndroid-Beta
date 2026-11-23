package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f55051a;
    public final ByteBuffer f55052b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f55051a = i7;
        this.f55052b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f55051a) {
            case 0:
                JavaI420Buffer.a(this.f55052b);
                return;
            default:
                YuvConverter.a(this.f55052b);
                return;
        }
    }
}
