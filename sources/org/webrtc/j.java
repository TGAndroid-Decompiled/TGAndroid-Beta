package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f55167a;
    public final ByteBuffer f55168b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f55167a = i7;
        this.f55168b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f55167a) {
            case 0:
                JavaI420Buffer.a(this.f55168b);
                return;
            default:
                YuvConverter.a(this.f55168b);
                return;
        }
    }
}
