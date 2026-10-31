package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f44500a;
    public final ByteBuffer f44501b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f44500a = i10;
        this.f44501b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f44500a) {
            case 0:
                JavaI420Buffer.a(this.f44501b);
                return;
            default:
                YuvConverter.a(this.f44501b);
                return;
        }
    }
}
