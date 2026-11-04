package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f53026a;
    public final ByteBuffer f53027b;

    public j(int i3, ByteBuffer byteBuffer) {
        this.f53026a = i3;
        this.f53027b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f53026a) {
            case 0:
                JavaI420Buffer.a(this.f53027b);
                return;
            default:
                YuvConverter.a(this.f53027b);
                return;
        }
    }
}
