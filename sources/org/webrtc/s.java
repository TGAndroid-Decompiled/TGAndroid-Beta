package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f53038a;
    public final Object f53039b;
    public final Object f53040c;

    public s(int i3, Object obj, Object obj2) {
        this.f53038a = i3;
        this.f53039b = obj;
        this.f53040c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f53038a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f53039b, (TextureBufferImpl.RefCountMonitor) this.f53040c);
                return;
            case 1:
                ((EglRenderer) this.f53039b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f53040c);
                return;
            case 2:
                ((EglRenderer) this.f53039b).lambda$release$1((CountDownLatch) this.f53040c);
                return;
            case 3:
                ((EglRenderer) this.f53039b).lambda$release$2((Looper) this.f53040c);
                return;
            case 4:
                ((VideoFileRenderer) this.f53039b).lambda$onFrame$0((VideoFrame) this.f53040c);
                return;
            case 5:
                ((VideoFileRenderer) this.f53039b).lambda$release$2((CountDownLatch) this.f53040c);
                return;
            default:
                ((VideoSource) this.f53039b).lambda$setVideoProcessor$0((VideoFrame) this.f53040c);
                return;
        }
    }
}
