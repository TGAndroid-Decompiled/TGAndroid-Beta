package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f44512a;
    public final Object f44513b;
    public final Object f44514c;

    public s(int i10, Object obj, Object obj2) {
        this.f44512a = i10;
        this.f44513b = obj;
        this.f44514c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f44512a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f44513b, (TextureBufferImpl.RefCountMonitor) this.f44514c);
                return;
            case 1:
                ((EglRenderer) this.f44513b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f44514c);
                return;
            case 2:
                ((EglRenderer) this.f44513b).lambda$release$1((CountDownLatch) this.f44514c);
                return;
            case 3:
                ((EglRenderer) this.f44513b).lambda$release$2((Looper) this.f44514c);
                return;
            case 4:
                ((VideoFileRenderer) this.f44513b).lambda$onFrame$0((VideoFrame) this.f44514c);
                return;
            case 5:
                ((VideoFileRenderer) this.f44513b).lambda$release$2((CountDownLatch) this.f44514c);
                return;
            default:
                ((VideoSource) this.f44513b).lambda$setVideoProcessor$0((VideoFrame) this.f44514c);
                return;
        }
    }
}
