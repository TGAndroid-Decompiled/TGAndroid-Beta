package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f44320a;
    public final Object f44321b;
    public final Object f44322c;

    public s(int i10, Object obj, Object obj2) {
        this.f44320a = i10;
        this.f44321b = obj;
        this.f44322c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44320a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f44321b, (TextureBufferImpl.RefCountMonitor) this.f44322c);
                return;
            case 1:
                ((EglRenderer) this.f44321b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f44322c);
                return;
            case 2:
                ((EglRenderer) this.f44321b).lambda$release$1((CountDownLatch) this.f44322c);
                return;
            case 3:
                ((EglRenderer) this.f44321b).lambda$release$2((Looper) this.f44322c);
                return;
            case 4:
                ((VideoFileRenderer) this.f44321b).lambda$onFrame$0((VideoFrame) this.f44322c);
                return;
            case 5:
                ((VideoFileRenderer) this.f44321b).lambda$release$2((CountDownLatch) this.f44322c);
                return;
            default:
                ((VideoSource) this.f44321b).lambda$setVideoProcessor$0((VideoFrame) this.f44322c);
                return;
        }
    }
}
