package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43605a;
    public final ByteBuffer f43606b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43605a = i10;
        this.f43606b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43605a) {
            case 0:
                JavaI420Buffer.a(this.f43606b);
                return;
            default:
                YuvConverter.a(this.f43606b);
                return;
        }
    }
}
