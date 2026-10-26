package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f46453a;
    public final ByteBuffer f46454b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f46453a = i10;
        this.f46454b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f46453a) {
            case 0:
                JavaI420Buffer.a(this.f46454b);
                return;
            default:
                YuvConverter.a(this.f46454b);
                return;
        }
    }
}
