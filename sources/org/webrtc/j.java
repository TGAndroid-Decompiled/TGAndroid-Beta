package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40618a;
    public final ByteBuffer f40619b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40618a = i10;
        this.f40619b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40618a) {
            case 0:
                JavaI420Buffer.a(this.f40619b);
                return;
            default:
                YuvConverter.a(this.f40619b);
                return;
        }
    }
}
