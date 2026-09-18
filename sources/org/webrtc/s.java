package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40401a;
    public final Object f40402b;
    public final Object f40403c;

    public s(int i10, Object obj, Object obj2) {
        this.f40401a = i10;
        this.f40402b = obj;
        this.f40403c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40401a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40402b, (TextureBufferImpl.RefCountMonitor) this.f40403c);
                return;
            case 1:
                ((EglRenderer) this.f40402b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40403c);
                return;
            case 2:
                ((EglRenderer) this.f40402b).lambda$release$1((CountDownLatch) this.f40403c);
                return;
            case 3:
                ((EglRenderer) this.f40402b).lambda$release$2((Looper) this.f40403c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40402b).lambda$onFrame$0((VideoFrame) this.f40403c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40402b).lambda$release$2((CountDownLatch) this.f40403c);
                return;
            default:
                ((VideoSource) this.f40402b).lambda$setVideoProcessor$0((VideoFrame) this.f40403c);
                return;
        }
    }
}
