package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40634a;
    public final ByteBuffer f40635b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40634a = i10;
        this.f40635b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40634a) {
            case 0:
                JavaI420Buffer.a(this.f40635b);
                return;
            default:
                YuvConverter.a(this.f40635b);
                return;
        }
    }
}
