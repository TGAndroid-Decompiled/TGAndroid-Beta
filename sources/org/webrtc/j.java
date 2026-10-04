package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43947a;
    public final ByteBuffer f43948b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43947a = i10;
        this.f43948b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43947a) {
            case 0:
                JavaI420Buffer.a(this.f43948b);
                return;
            default:
                YuvConverter.a(this.f43948b);
                return;
        }
    }
}
