package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f44066a;
    public final Object f44067b;
    public final Object f44068c;

    public s(int i10, Object obj, Object obj2) {
        this.f44066a = i10;
        this.f44067b = obj;
        this.f44068c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44066a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f44067b, (TextureBufferImpl.RefCountMonitor) this.f44068c);
                return;
            case 1:
                ((EglRenderer) this.f44067b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f44068c);
                return;
            case 2:
                ((EglRenderer) this.f44067b).lambda$release$1((CountDownLatch) this.f44068c);
                return;
            case 3:
                ((EglRenderer) this.f44067b).lambda$release$2((Looper) this.f44068c);
                return;
            case 4:
                ((VideoFileRenderer) this.f44067b).lambda$onFrame$0((VideoFrame) this.f44068c);
                return;
            case 5:
                ((VideoFileRenderer) this.f44067b).lambda$release$2((CountDownLatch) this.f44068c);
                return;
            default:
                ((VideoSource) this.f44067b).lambda$setVideoProcessor$0((VideoFrame) this.f44068c);
                return;
        }
    }
}
