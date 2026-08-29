package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45383a;
    public final ByteBuffer f45384b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45383a = i10;
        this.f45384b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45383a) {
            case 0:
                JavaI420Buffer.a(this.f45384b);
                return;
            default:
                YuvConverter.a(this.f45384b);
                return;
        }
    }
}
