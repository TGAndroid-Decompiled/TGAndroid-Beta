package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40632a;
    public final ByteBuffer f40633b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40632a = i10;
        this.f40633b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40632a) {
            case 0:
                JavaI420Buffer.a(this.f40633b);
                return;
            default:
                YuvConverter.a(this.f40633b);
                return;
        }
    }
}
