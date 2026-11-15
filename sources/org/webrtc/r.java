package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f54482a;
    public final Object f54483b;
    public final Object f54484c;

    public r(int i7, Object obj, Object obj2) {
        this.f54482a = i7;
        this.f54483b = obj;
        this.f54484c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f54482a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f54483b, (TextureBufferImpl.RefCountMonitor) this.f54484c);
                return;
            case 1:
                ((EglRenderer) this.f54483b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f54484c);
                return;
            case 2:
                ((EglRenderer) this.f54483b).lambda$release$1((CountDownLatch) this.f54484c);
                return;
            case 3:
                ((EglRenderer) this.f54483b).lambda$release$2((Looper) this.f54484c);
                return;
            case 4:
                ((VideoFileRenderer) this.f54483b).lambda$onFrame$0((VideoFrame) this.f54484c);
                return;
            case 5:
                ((VideoFileRenderer) this.f54483b).lambda$release$2((CountDownLatch) this.f54484c);
                return;
            default:
                ((VideoSource) this.f54483b).lambda$setVideoProcessor$0((VideoFrame) this.f54484c);
                return;
        }
    }
}
