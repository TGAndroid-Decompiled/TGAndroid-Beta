package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f45015a;
    public final ByteBuffer f45016b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45015a = i10;
        this.f45016b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45015a) {
            case 0:
                JavaI420Buffer.a(this.f45016b);
                return;
            default:
                YuvConverter.a(this.f45016b);
                return;
        }
    }
}
