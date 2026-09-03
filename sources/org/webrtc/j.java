package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40929a;
    public final ByteBuffer f40930b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40929a = i10;
        this.f40930b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40929a) {
            case 0:
                JavaI420Buffer.a(this.f40930b);
                return;
            default:
                YuvConverter.a(this.f40930b);
                return;
        }
    }
}
