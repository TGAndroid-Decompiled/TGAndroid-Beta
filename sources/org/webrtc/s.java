package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f44097a;
    public final Object f44098b;
    public final Object f44099c;

    public s(int i10, Object obj, Object obj2) {
        this.f44097a = i10;
        this.f44098b = obj;
        this.f44099c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44097a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f44098b, (TextureBufferImpl.RefCountMonitor) this.f44099c);
                return;
            case 1:
                ((EglRenderer) this.f44098b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f44099c);
                return;
            case 2:
                ((EglRenderer) this.f44098b).lambda$release$1((CountDownLatch) this.f44099c);
                return;
            case 3:
                ((EglRenderer) this.f44098b).lambda$release$2((Looper) this.f44099c);
                return;
            case 4:
                ((VideoFileRenderer) this.f44098b).lambda$onFrame$0((VideoFrame) this.f44099c);
                return;
            case 5:
                ((VideoFileRenderer) this.f44098b).lambda$release$2((CountDownLatch) this.f44099c);
                return;
            default:
                ((VideoSource) this.f44098b).lambda$setVideoProcessor$0((VideoFrame) this.f44099c);
                return;
        }
    }
}
