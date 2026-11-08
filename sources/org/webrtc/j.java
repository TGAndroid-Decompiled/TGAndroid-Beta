package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f53052a;
    public final ByteBuffer f53053b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f53052a = i7;
        this.f53053b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f53052a) {
            case 0:
                JavaI420Buffer.a(this.f53053b);
                return;
            default:
                YuvConverter.a(this.f53053b);
                return;
        }
    }
}
