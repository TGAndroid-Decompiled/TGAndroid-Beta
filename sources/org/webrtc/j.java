package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f44085a;
    public final ByteBuffer f44086b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f44085a = i10;
        this.f44086b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f44085a) {
            case 0:
                JavaI420Buffer.a(this.f44086b);
                return;
            default:
                YuvConverter.a(this.f44086b);
                return;
        }
    }
}
