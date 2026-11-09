package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f53077a;
    public final Object f53078b;
    public final Object f53079c;

    public r(int i7, Object obj, Object obj2) {
        this.f53077a = i7;
        this.f53078b = obj;
        this.f53079c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f53077a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f53078b, (TextureBufferImpl.RefCountMonitor) this.f53079c);
                return;
            case 1:
                ((EglRenderer) this.f53078b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f53079c);
                return;
            case 2:
                ((EglRenderer) this.f53078b).lambda$release$1((CountDownLatch) this.f53079c);
                return;
            case 3:
                ((EglRenderer) this.f53078b).lambda$release$2((Looper) this.f53079c);
                return;
            case 4:
                ((VideoFileRenderer) this.f53078b).lambda$onFrame$0((VideoFrame) this.f53079c);
                return;
            case 5:
                ((VideoFileRenderer) this.f53078b).lambda$release$2((CountDownLatch) this.f53079c);
                return;
            default:
                ((VideoSource) this.f53078b).lambda$setVideoProcessor$0((VideoFrame) this.f53079c);
                return;
        }
    }
}
