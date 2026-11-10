package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f53076a;
    public final Object f53077b;
    public final Object f53078c;

    public r(int i7, Object obj, Object obj2) {
        this.f53076a = i7;
        this.f53077b = obj;
        this.f53078c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f53076a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f53077b, (TextureBufferImpl.RefCountMonitor) this.f53078c);
                return;
            case 1:
                ((EglRenderer) this.f53077b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f53078c);
                return;
            case 2:
                ((EglRenderer) this.f53077b).lambda$release$1((CountDownLatch) this.f53078c);
                return;
            case 3:
                ((EglRenderer) this.f53077b).lambda$release$2((Looper) this.f53078c);
                return;
            case 4:
                ((VideoFileRenderer) this.f53077b).lambda$onFrame$0((VideoFrame) this.f53078c);
                return;
            case 5:
                ((VideoFileRenderer) this.f53077b).lambda$release$2((CountDownLatch) this.f53078c);
                return;
            default:
                ((VideoSource) this.f53077b).lambda$setVideoProcessor$0((VideoFrame) this.f53078c);
                return;
        }
    }
}
