package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class t implements Runnable {
    public final int f42812a;
    public final Object f42813b;
    public final Object f42814c;

    public t(int i10, Object obj, Object obj2) {
        this.f42812a = i10;
        this.f42813b = obj;
        this.f42814c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f42812a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f42813b, (TextureBufferImpl.RefCountMonitor) this.f42814c);
                return;
            case 1:
                ((EglRenderer) this.f42813b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f42814c);
                return;
            case 2:
                ((EglRenderer) this.f42813b).lambda$release$1((CountDownLatch) this.f42814c);
                return;
            case 3:
                ((EglRenderer) this.f42813b).lambda$release$2((Looper) this.f42814c);
                return;
            case 4:
                ((VideoFileRenderer) this.f42813b).lambda$onFrame$0((VideoFrame) this.f42814c);
                return;
            case 5:
                ((VideoFileRenderer) this.f42813b).lambda$release$2((CountDownLatch) this.f42814c);
                return;
            default:
                ((VideoSource) this.f42813b).lambda$setVideoProcessor$0((VideoFrame) this.f42814c);
                return;
        }
    }
}
