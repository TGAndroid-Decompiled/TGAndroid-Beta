package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43961a;
    public final ByteBuffer f43962b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43961a = i10;
        this.f43962b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43961a) {
            case 0:
                JavaI420Buffer.a(this.f43962b);
                return;
            default:
                YuvConverter.a(this.f43962b);
                return;
        }
    }
}
