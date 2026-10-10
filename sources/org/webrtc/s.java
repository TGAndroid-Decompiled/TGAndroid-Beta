package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f45183a;
    public final Object f45184b;
    public final Object f45185c;

    public s(int i10, Object obj, Object obj2) {
        this.f45183a = i10;
        this.f45184b = obj;
        this.f45185c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45183a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f45184b, (TextureBufferImpl.RefCountMonitor) this.f45185c);
                return;
            case 1:
                ((EglRenderer) this.f45184b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45185c);
                return;
            case 2:
                ((EglRenderer) this.f45184b).lambda$release$1((CountDownLatch) this.f45185c);
                return;
            case 3:
                ((EglRenderer) this.f45184b).lambda$release$2((Looper) this.f45185c);
                return;
            case 4:
                ((VideoFileRenderer) this.f45184b).lambda$onFrame$0((VideoFrame) this.f45185c);
                return;
            case 5:
                ((VideoFileRenderer) this.f45184b).lambda$release$2((CountDownLatch) this.f45185c);
                return;
            default:
                ((VideoSource) this.f45184b).lambda$setVideoProcessor$0((VideoFrame) this.f45185c);
                return;
        }
    }
}
