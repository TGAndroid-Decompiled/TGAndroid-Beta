package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40633a;
    public final ByteBuffer f40634b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40633a = i10;
        this.f40634b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40633a) {
            case 0:
                JavaI420Buffer.a(this.f40634b);
                return;
            default:
                YuvConverter.a(this.f40634b);
                return;
        }
    }
}
