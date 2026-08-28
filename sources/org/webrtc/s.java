package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f45315a;
    public final Object f45316b;
    public final Object f45317c;

    public s(int i9, Object obj, Object obj2) {
        this.f45315a = i9;
        this.f45316b = obj;
        this.f45317c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45315a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f45316b, (TextureBufferImpl.RefCountMonitor) this.f45317c);
                return;
            case 1:
                ((EglRenderer) this.f45316b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45317c);
                return;
            case 2:
                ((EglRenderer) this.f45316b).lambda$release$1((CountDownLatch) this.f45317c);
                return;
            case 3:
                ((EglRenderer) this.f45316b).lambda$release$2((Looper) this.f45317c);
                return;
            case 4:
                ((VideoFileRenderer) this.f45316b).lambda$onFrame$0((VideoFrame) this.f45317c);
                return;
            case 5:
                ((VideoFileRenderer) this.f45316b).lambda$release$2((CountDownLatch) this.f45317c);
                return;
            default:
                ((VideoSource) this.f45316b).lambda$setVideoProcessor$0((VideoFrame) this.f45317c);
                return;
        }
    }
}
