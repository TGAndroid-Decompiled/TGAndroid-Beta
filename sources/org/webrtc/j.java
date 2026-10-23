package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f44308a;
    public final ByteBuffer f44309b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f44308a = i10;
        this.f44309b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f44308a) {
            case 0:
                JavaI420Buffer.a(this.f44309b);
                return;
            default:
                YuvConverter.a(this.f44309b);
                return;
        }
    }
}
