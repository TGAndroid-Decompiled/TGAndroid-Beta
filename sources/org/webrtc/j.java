package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f44054a;
    public final ByteBuffer f44055b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f44054a = i10;
        this.f44055b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f44054a) {
            case 0:
                JavaI420Buffer.a(this.f44055b);
                return;
            default:
                YuvConverter.a(this.f44055b);
                return;
        }
    }
}
