package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f39490a;
    public final ByteBuffer f39491b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f39490a = i10;
        this.f39491b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f39490a) {
            case 0:
                JavaI420Buffer.a(this.f39491b);
                return;
            default:
                YuvConverter.a(this.f39491b);
                return;
        }
    }
}
