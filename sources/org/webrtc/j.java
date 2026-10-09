package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45127a;
    public final ByteBuffer f45128b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45127a = i10;
        this.f45128b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45127a) {
            case 0:
                JavaI420Buffer.a(this.f45128b);
                return;
            default:
                YuvConverter.a(this.f45128b);
                return;
        }
    }
}
