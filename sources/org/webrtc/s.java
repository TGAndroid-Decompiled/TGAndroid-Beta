package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f43939a;
    public final Object f43940b;
    public final Object f43941c;

    public s(int i10, Object obj, Object obj2) {
        this.f43939a = i10;
        this.f43940b = obj;
        this.f43941c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43939a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f43940b, (TextureBufferImpl.RefCountMonitor) this.f43941c);
                return;
            case 1:
                ((EglRenderer) this.f43940b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f43941c);
                return;
            case 2:
                ((EglRenderer) this.f43940b).lambda$release$1((CountDownLatch) this.f43941c);
                return;
            case 3:
                ((EglRenderer) this.f43940b).lambda$release$2((Looper) this.f43941c);
                return;
            case 4:
                ((VideoFileRenderer) this.f43940b).lambda$onFrame$0((VideoFrame) this.f43941c);
                return;
            case 5:
                ((VideoFileRenderer) this.f43940b).lambda$release$2((CountDownLatch) this.f43941c);
                return;
            default:
                ((VideoSource) this.f43940b).lambda$setVideoProcessor$0((VideoFrame) this.f43941c);
                return;
        }
    }
}
