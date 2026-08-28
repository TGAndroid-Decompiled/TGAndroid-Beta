package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45303a;
    public final ByteBuffer f45304b;

    public j(int i9, ByteBuffer byteBuffer) {
        this.f45303a = i9;
        this.f45304b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45303a) {
            case 0:
                JavaI420Buffer.a(this.f45304b);
                return;
            default:
                YuvConverter.a(this.f45304b);
                return;
        }
    }
}
