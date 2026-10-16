package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f42500a;
    public final ByteBuffer f42501b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f42500a = i10;
        this.f42501b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f42500a) {
            case 0:
                JavaI420Buffer.a(this.f42501b);
                return;
            default:
                YuvConverter.a(this.f42501b);
                return;
        }
    }
}
