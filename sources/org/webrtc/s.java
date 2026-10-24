package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f44319a;
    public final Object f44320b;
    public final Object f44321c;

    public s(int i10, Object obj, Object obj2) {
        this.f44319a = i10;
        this.f44320b = obj;
        this.f44321c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44319a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f44320b, (TextureBufferImpl.RefCountMonitor) this.f44321c);
                return;
            case 1:
                ((EglRenderer) this.f44320b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f44321c);
                return;
            case 2:
                ((EglRenderer) this.f44320b).lambda$release$1((CountDownLatch) this.f44321c);
                return;
            case 3:
                ((EglRenderer) this.f44320b).lambda$release$2((Looper) this.f44321c);
                return;
            case 4:
                ((VideoFileRenderer) this.f44320b).lambda$onFrame$0((VideoFrame) this.f44321c);
                return;
            case 5:
                ((VideoFileRenderer) this.f44320b).lambda$release$2((CountDownLatch) this.f44321c);
                return;
            default:
                ((VideoSource) this.f44320b).lambda$setVideoProcessor$0((VideoFrame) this.f44321c);
                return;
        }
    }
}
