package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f43901a;
    public final Object f43902b;
    public final Object f43903c;

    public s(int i10, Object obj, Object obj2) {
        this.f43901a = i10;
        this.f43902b = obj;
        this.f43903c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43901a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f43902b, (TextureBufferImpl.RefCountMonitor) this.f43903c);
                return;
            case 1:
                ((EglRenderer) this.f43902b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f43903c);
                return;
            case 2:
                ((EglRenderer) this.f43902b).lambda$release$1((CountDownLatch) this.f43903c);
                return;
            case 3:
                ((EglRenderer) this.f43902b).lambda$release$2((Looper) this.f43903c);
                return;
            case 4:
                ((VideoFileRenderer) this.f43902b).lambda$onFrame$0((VideoFrame) this.f43903c);
                return;
            case 5:
                ((VideoFileRenderer) this.f43902b).lambda$release$2((CountDownLatch) this.f43903c);
                return;
            default:
                ((VideoSource) this.f43902b).lambda$setVideoProcessor$0((VideoFrame) this.f43903c);
                return;
        }
    }
}
