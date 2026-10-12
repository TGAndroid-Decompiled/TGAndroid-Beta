package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f45019a;
    public final Object f45020b;
    public final Object f45021c;

    public s(int i10, Object obj, Object obj2) {
        this.f45019a = i10;
        this.f45020b = obj;
        this.f45021c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45019a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f45020b, (TextureBufferImpl.RefCountMonitor) this.f45021c);
                return;
            case 1:
                ((EglRenderer) this.f45020b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45021c);
                return;
            case 2:
                ((EglRenderer) this.f45020b).lambda$release$1((CountDownLatch) this.f45021c);
                return;
            case 3:
                ((EglRenderer) this.f45020b).lambda$release$2((Looper) this.f45021c);
                return;
            case 4:
                ((VideoFileRenderer) this.f45020b).lambda$onFrame$0((VideoFrame) this.f45021c);
                return;
            case 5:
                ((VideoFileRenderer) this.f45020b).lambda$release$2((CountDownLatch) this.f45021c);
                return;
            default:
                ((VideoSource) this.f45020b).lambda$setVideoProcessor$0((VideoFrame) this.f45021c);
                return;
        }
    }
}
