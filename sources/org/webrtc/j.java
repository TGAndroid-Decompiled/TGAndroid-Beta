package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f55041a;
    public final ByteBuffer f55042b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f55041a = i7;
        this.f55042b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f55041a) {
            case 0:
                JavaI420Buffer.a(this.f55042b);
                return;
            default:
                YuvConverter.a(this.f55042b);
                return;
        }
    }
}
