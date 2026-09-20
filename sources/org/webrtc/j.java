package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40659a;
    public final ByteBuffer f40660b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40659a = i10;
        this.f40660b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40659a) {
            case 0:
                JavaI420Buffer.a(this.f40660b);
                return;
            default:
                YuvConverter.a(this.f40660b);
                return;
        }
    }
}
