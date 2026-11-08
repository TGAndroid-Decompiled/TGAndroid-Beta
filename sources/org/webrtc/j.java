package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f53053a;
    public final ByteBuffer f53054b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f53053a = i7;
        this.f53054b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f53053a) {
            case 0:
                JavaI420Buffer.a(this.f53054b);
                return;
            default:
                YuvConverter.a(this.f53054b);
                return;
        }
    }
}
