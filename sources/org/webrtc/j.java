package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f43889a;
    public final ByteBuffer f43890b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f43889a = i10;
        this.f43890b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f43889a) {
            case 0:
                JavaI420Buffer.a(this.f43890b);
                return;
            default:
                YuvConverter.a(this.f43890b);
                return;
        }
    }
}
