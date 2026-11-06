package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f52959a;
    public final ByteBuffer f52960b;

    public j(int i7, ByteBuffer byteBuffer) {
        this.f52959a = i7;
        this.f52960b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f52959a) {
            case 0:
                JavaI420Buffer.a(this.f52960b);
                return;
            default:
                YuvConverter.a(this.f52960b);
                return;
        }
    }
}
