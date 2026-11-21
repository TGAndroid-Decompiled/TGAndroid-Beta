package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f55082a;
    public final ByteBuffer f55083b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f55082a = i7;
        this.f55083b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f55082a) {
            case 0:
                JavaI420Buffer.a(this.f55083b);
                return;
            default:
                YuvConverter.a(this.f55083b);
                return;
        }
    }
}
