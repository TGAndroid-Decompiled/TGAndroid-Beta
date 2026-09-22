package org.webrtc;

import java.nio.ByteBuffer;
public final class j implements Runnable {
    public final int f40680a;
    public final ByteBuffer f40681b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f40680a = i10;
        this.f40681b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f40680a) {
            case 0:
                JavaI420Buffer.a(this.f40681b);
                return;
            default:
                YuvConverter.a(this.f40681b);
                return;
        }
    }
}
