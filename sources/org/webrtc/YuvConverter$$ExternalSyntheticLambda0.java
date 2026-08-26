package org.webrtc;

import java.nio.ByteBuffer;

public final class YuvConverter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ByteBuffer f$0;

    public YuvConverter$$ExternalSyntheticLambda0(int i, ByteBuffer byteBuffer) {
        this.$r8$classId = i;
        this.f$0 = byteBuffer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                JniCommon.nativeFreeByteBuffer(this.f$0);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(this.f$0);
                break;
        }
    }
}
