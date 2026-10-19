package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43881a;
    public final ByteBuffer f43882b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43881a = i10;
        this.f43882b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43881a) {
            case 0:
                JavaI420Buffer.a(this.f43882b);
                return;
            default:
                YuvConverter.a(this.f43882b);
                return;
        }
    }
}
