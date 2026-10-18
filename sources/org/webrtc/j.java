package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43887a;
    public final ByteBuffer f43888b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43887a = i10;
        this.f43888b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43887a) {
            case 0:
                JavaI420Buffer.a(this.f43888b);
                return;
            default:
                YuvConverter.a(this.f43888b);
                return;
        }
    }
}
