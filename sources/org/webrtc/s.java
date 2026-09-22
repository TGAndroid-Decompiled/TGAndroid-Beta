package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40692a;
    public final Object f40693b;
    public final Object f40694c;

    public s(int i10, Object obj, Object obj2) {
        this.f40692a = i10;
        this.f40693b = obj;
        this.f40694c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40692a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40693b, (TextureBufferImpl.RefCountMonitor) this.f40694c);
                return;
            case 1:
                ((EglRenderer) this.f40693b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40694c);
                return;
            case 2:
                ((EglRenderer) this.f40693b).lambda$release$1((CountDownLatch) this.f40694c);
                return;
            case 3:
                ((EglRenderer) this.f40693b).lambda$release$2((Looper) this.f40694c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40693b).lambda$onFrame$0((VideoFrame) this.f40694c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40693b).lambda$release$2((CountDownLatch) this.f40694c);
                return;
            default:
                ((VideoSource) this.f40693b).lambda$setVideoProcessor$0((VideoFrame) this.f40694c);
                return;
        }
    }
}
