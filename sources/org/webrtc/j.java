package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f52961a;
    public final ByteBuffer f52962b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f52961a = i7;
        this.f52962b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f52961a) {
            case 0:
                JavaI420Buffer.a(this.f52962b);
                return;
            default:
                YuvConverter.a(this.f52962b);
                return;
        }
    }
}
