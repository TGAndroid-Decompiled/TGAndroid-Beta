package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40358a;
    public final ByteBuffer f40359b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40358a = i10;
        this.f40359b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40358a) {
            case 0:
                JavaI420Buffer.a(this.f40359b);
                return;
            default:
                YuvConverter.a(this.f40359b);
                return;
        }
    }
}
