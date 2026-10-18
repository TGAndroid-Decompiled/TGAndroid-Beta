package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43927a;
    public final ByteBuffer f43928b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43927a = i10;
        this.f43928b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43927a) {
            case 0:
                JavaI420Buffer.a(this.f43928b);
                return;
            default:
                YuvConverter.a(this.f43928b);
                return;
        }
    }
}
