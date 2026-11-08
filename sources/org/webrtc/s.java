package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f53065a;
    public final Object f53066b;
    public final Object f53067c;

    public s(int i7, Object obj, Object obj2) {
        this.f53065a = i7;
        this.f53066b = obj;
        this.f53067c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f53065a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f53066b, (TextureBufferImpl.RefCountMonitor) this.f53067c);
                return;
            case 1:
                ((EglRenderer) this.f53066b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f53067c);
                return;
            case 2:
                ((EglRenderer) this.f53066b).lambda$release$1((CountDownLatch) this.f53067c);
                return;
            case 3:
                ((EglRenderer) this.f53066b).lambda$release$2((Looper) this.f53067c);
                return;
            case 4:
                ((VideoFileRenderer) this.f53066b).lambda$onFrame$0((VideoFrame) this.f53067c);
                return;
            case 5:
                ((VideoFileRenderer) this.f53066b).lambda$release$2((CountDownLatch) this.f53067c);
                return;
            default:
                ((VideoSource) this.f53066b).lambda$setVideoProcessor$0((VideoFrame) this.f53067c);
                return;
        }
    }
}
