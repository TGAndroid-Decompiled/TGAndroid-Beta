package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f55177a;
    public final Object f55178b;
    public final Object f55179c;

    public r(int i7, Object obj, Object obj2) {
        this.f55177a = i7;
        this.f55178b = obj;
        this.f55179c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f55177a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f55178b, (TextureBufferImpl.RefCountMonitor) this.f55179c);
                return;
            case 1:
                ((EglRenderer) this.f55178b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f55179c);
                return;
            case 2:
                ((EglRenderer) this.f55178b).lambda$release$1((CountDownLatch) this.f55179c);
                return;
            case 3:
                ((EglRenderer) this.f55178b).lambda$release$2((Looper) this.f55179c);
                return;
            case 4:
                ((VideoFileRenderer) this.f55178b).lambda$onFrame$0((VideoFrame) this.f55179c);
                return;
            case 5:
                ((VideoFileRenderer) this.f55178b).lambda$release$2((CountDownLatch) this.f55179c);
                return;
            default:
                ((VideoSource) this.f55178b).lambda$setVideoProcessor$0((VideoFrame) this.f55179c);
                return;
        }
    }
}
