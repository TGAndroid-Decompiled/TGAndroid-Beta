package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40631a;
    public final ByteBuffer f40632b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40631a = i10;
        this.f40632b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40631a) {
            case 0:
                JavaI420Buffer.a(this.f40632b);
                return;
            default:
                YuvConverter.a(this.f40632b);
                return;
        }
    }
}
