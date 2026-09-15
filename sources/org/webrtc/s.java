package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40374a;
    public final Object f40375b;
    public final Object f40376c;

    public s(int i10, Object obj, Object obj2) {
        this.f40374a = i10;
        this.f40375b = obj;
        this.f40376c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40374a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40375b, (TextureBufferImpl.RefCountMonitor) this.f40376c);
                return;
            case 1:
                ((EglRenderer) this.f40375b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40376c);
                return;
            case 2:
                ((EglRenderer) this.f40375b).lambda$release$1((CountDownLatch) this.f40376c);
                return;
            case 3:
                ((EglRenderer) this.f40375b).lambda$release$2((Looper) this.f40376c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40375b).lambda$onFrame$0((VideoFrame) this.f40376c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40375b).lambda$release$2((CountDownLatch) this.f40376c);
                return;
            default:
                ((VideoSource) this.f40375b).lambda$setVideoProcessor$0((VideoFrame) this.f40376c);
                return;
        }
    }
}
