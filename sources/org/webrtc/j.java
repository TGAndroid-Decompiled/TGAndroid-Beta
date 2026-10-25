package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f46450a;
    public final ByteBuffer f46451b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f46450a = i10;
        this.f46451b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f46450a) {
            case 0:
                JavaI420Buffer.a(this.f46451b);
                return;
            default:
                YuvConverter.a(this.f46451b);
                return;
        }
    }
}
