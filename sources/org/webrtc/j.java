package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f44511a;
    public final ByteBuffer f44512b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f44511a = i10;
        this.f44512b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f44511a) {
            case 0:
                JavaI420Buffer.a(this.f44512b);
                return;
            default:
                YuvConverter.a(this.f44512b);
                return;
        }
    }
}
