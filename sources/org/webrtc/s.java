package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f46500a;
    public final Object f46501b;
    public final Object f46502c;

    public s(int i10, Object obj, Object obj2) {
        this.f46500a = i10;
        this.f46501b = obj;
        this.f46502c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46500a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f46501b, (TextureBufferImpl.RefCountMonitor) this.f46502c);
                return;
            case 1:
                ((EglRenderer) this.f46501b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f46502c);
                return;
            case 2:
                ((EglRenderer) this.f46501b).lambda$release$1((CountDownLatch) this.f46502c);
                return;
            case 3:
                ((EglRenderer) this.f46501b).lambda$release$2((Looper) this.f46502c);
                return;
            case 4:
                ((VideoFileRenderer) this.f46501b).lambda$onFrame$0((VideoFrame) this.f46502c);
                return;
            case 5:
                ((VideoFileRenderer) this.f46501b).lambda$release$2((CountDownLatch) this.f46502c);
                return;
            default:
                ((VideoSource) this.f46501b).lambda$setVideoProcessor$0((VideoFrame) this.f46502c);
                return;
        }
    }
}
