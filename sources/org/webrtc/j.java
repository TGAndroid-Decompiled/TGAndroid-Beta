package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40389a;
    public final ByteBuffer f40390b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40389a = i10;
        this.f40390b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40389a) {
            case 0:
                JavaI420Buffer.a(this.f40390b);
                return;
            default:
                YuvConverter.a(this.f40390b);
                return;
        }
    }
}
