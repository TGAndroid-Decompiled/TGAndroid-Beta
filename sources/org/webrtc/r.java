package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f55051a;
    public final Object f55052b;
    public final Object f55053c;

    public r(int i7, Object obj, Object obj2) {
        this.f55051a = i7;
        this.f55052b = obj;
        this.f55053c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f55051a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f55052b, (TextureBufferImpl.RefCountMonitor) this.f55053c);
                return;
            case 1:
                ((EglRenderer) this.f55052b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f55053c);
                return;
            case 2:
                ((EglRenderer) this.f55052b).lambda$release$1((CountDownLatch) this.f55053c);
                return;
            case 3:
                ((EglRenderer) this.f55052b).lambda$release$2((Looper) this.f55053c);
                return;
            case 4:
                ((VideoFileRenderer) this.f55052b).lambda$onFrame$0((VideoFrame) this.f55053c);
                return;
            case 5:
                ((VideoFileRenderer) this.f55052b).lambda$release$2((CountDownLatch) this.f55053c);
                return;
            default:
                ((VideoSource) this.f55052b).lambda$setVideoProcessor$0((VideoFrame) this.f55053c);
                return;
        }
    }
}
