package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f53064a;
    public final Object f53065b;
    public final Object f53066c;

    public s(int i7, Object obj, Object obj2) {
        this.f53064a = i7;
        this.f53065b = obj;
        this.f53066c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f53064a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f53065b, (TextureBufferImpl.RefCountMonitor) this.f53066c);
                return;
            case 1:
                ((EglRenderer) this.f53065b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f53066c);
                return;
            case 2:
                ((EglRenderer) this.f53065b).lambda$release$1((CountDownLatch) this.f53066c);
                return;
            case 3:
                ((EglRenderer) this.f53065b).lambda$release$2((Looper) this.f53066c);
                return;
            case 4:
                ((VideoFileRenderer) this.f53065b).lambda$onFrame$0((VideoFrame) this.f53066c);
                return;
            case 5:
                ((VideoFileRenderer) this.f53065b).lambda$release$2((CountDownLatch) this.f53066c);
                return;
            default:
                ((VideoSource) this.f53065b).lambda$setVideoProcessor$0((VideoFrame) this.f53066c);
                return;
        }
    }
}
