package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f42512a;
    public final Object f42513b;
    public final Object f42514c;

    public s(int i10, Object obj, Object obj2) {
        this.f42512a = i10;
        this.f42513b = obj;
        this.f42514c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f42512a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f42513b, (TextureBufferImpl.RefCountMonitor) this.f42514c);
                return;
            case 1:
                ((EglRenderer) this.f42513b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f42514c);
                return;
            case 2:
                ((EglRenderer) this.f42513b).lambda$release$1((CountDownLatch) this.f42514c);
                return;
            case 3:
                ((EglRenderer) this.f42513b).lambda$release$2((Looper) this.f42514c);
                return;
            case 4:
                ((VideoFileRenderer) this.f42513b).lambda$onFrame$0((VideoFrame) this.f42514c);
                return;
            case 5:
                ((VideoFileRenderer) this.f42513b).lambda$release$2((CountDownLatch) this.f42514c);
                return;
            default:
                ((VideoSource) this.f42513b).lambda$setVideoProcessor$0((VideoFrame) this.f42514c);
                return;
        }
    }
}
