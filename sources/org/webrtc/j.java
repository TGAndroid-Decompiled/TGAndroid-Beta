package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f52935a;
    public final ByteBuffer f52936b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f52935a = i7;
        this.f52936b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f52935a) {
            case 0:
                JavaI420Buffer.a(this.f52936b);
                return;
            default:
                YuvConverter.a(this.f52936b);
                return;
        }
    }
}
