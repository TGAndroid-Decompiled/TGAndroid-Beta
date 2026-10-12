package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45007a;
    public final ByteBuffer f45008b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45007a = i10;
        this.f45008b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45007a) {
            case 0:
                JavaI420Buffer.a(this.f45008b);
                return;
            default:
                YuvConverter.a(this.f45008b);
                return;
        }
    }
}
