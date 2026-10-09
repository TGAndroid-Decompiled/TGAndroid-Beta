package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f45139a;
    public final Object f45140b;
    public final Object f45141c;

    public s(int i10, Object obj, Object obj2) {
        this.f45139a = i10;
        this.f45140b = obj;
        this.f45141c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45139a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f45140b, (TextureBufferImpl.RefCountMonitor) this.f45141c);
                return;
            case 1:
                ((EglRenderer) this.f45140b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45141c);
                return;
            case 2:
                ((EglRenderer) this.f45140b).lambda$release$1((CountDownLatch) this.f45141c);
                return;
            case 3:
                ((EglRenderer) this.f45140b).lambda$release$2((Looper) this.f45141c);
                return;
            case 4:
                ((VideoFileRenderer) this.f45140b).lambda$onFrame$0((VideoFrame) this.f45141c);
                return;
            case 5:
                ((VideoFileRenderer) this.f45140b).lambda$release$2((CountDownLatch) this.f45141c);
                return;
            default:
                ((VideoSource) this.f45140b).lambda$setVideoProcessor$0((VideoFrame) this.f45141c);
                return;
        }
    }
}
