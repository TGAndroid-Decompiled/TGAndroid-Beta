package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f55061a;
    public final Object f55062b;
    public final Object f55063c;

    public r(int i7, Object obj, Object obj2) {
        this.f55061a = i7;
        this.f55062b = obj;
        this.f55063c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f55061a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f55062b, (TextureBufferImpl.RefCountMonitor) this.f55063c);
                return;
            case 1:
                ((EglRenderer) this.f55062b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f55063c);
                return;
            case 2:
                ((EglRenderer) this.f55062b).lambda$release$1((CountDownLatch) this.f55063c);
                return;
            case 3:
                ((EglRenderer) this.f55062b).lambda$release$2((Looper) this.f55063c);
                return;
            case 4:
                ((VideoFileRenderer) this.f55062b).lambda$onFrame$0((VideoFrame) this.f55063c);
                return;
            case 5:
                ((VideoFileRenderer) this.f55062b).lambda$release$2((CountDownLatch) this.f55063c);
                return;
            default:
                ((VideoSource) this.f55062b).lambda$setVideoProcessor$0((VideoFrame) this.f55063c);
                return;
        }
    }
}
