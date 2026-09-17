package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43633a;
    public final ByteBuffer f43634b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43633a = i10;
        this.f43634b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43633a) {
            case 0:
                JavaI420Buffer.a(this.f43634b);
                return;
            default:
                YuvConverter.a(this.f43634b);
                return;
        }
    }
}
