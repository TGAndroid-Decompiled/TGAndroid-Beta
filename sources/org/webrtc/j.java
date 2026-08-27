package org.webrtc;

import java.nio.ByteBuffer;

public final class j implements Runnable {

    public final int f45309a;

    public final ByteBuffer f45310b;

    public j(int i10, ByteBuffer byteBuffer) {
        this.f45309a = i10;
        this.f45310b = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.f45309a) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f45310b);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f45310b);
                break;
        }
    }
}
