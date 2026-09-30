package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40743a;
    public final Object f40744b;
    public final Object f40745c;

    public s(int i10, Object obj, Object obj2) {
        this.f40743a = i10;
        this.f40744b = obj;
        this.f40745c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40743a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40744b, (TextureBufferImpl.RefCountMonitor) this.f40745c);
                return;
            case 1:
                ((EglRenderer) this.f40744b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40745c);
                return;
            case 2:
                ((EglRenderer) this.f40744b).lambda$release$1((CountDownLatch) this.f40745c);
                return;
            case 3:
                ((EglRenderer) this.f40744b).lambda$release$2((Looper) this.f40745c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40744b).lambda$onFrame$0((VideoFrame) this.f40745c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40744b).lambda$release$2((CountDownLatch) this.f40745c);
                return;
            default:
                ((VideoSource) this.f40744b).lambda$setVideoProcessor$0((VideoFrame) this.f40745c);
                return;
        }
    }
}
