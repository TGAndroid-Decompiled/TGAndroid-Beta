package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40384a;
    public final ByteBuffer f40385b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40384a = i10;
        this.f40385b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40384a) {
            case 0:
                JavaI420Buffer.a(this.f40385b);
                return;
            default:
                YuvConverter.a(this.f40385b);
                return;
        }
    }
}
