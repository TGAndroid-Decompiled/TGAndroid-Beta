package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f43618a;
    public final Object f43619b;
    public final Object f43620c;

    public s(int i10, Object obj, Object obj2) {
        this.f43618a = i10;
        this.f43619b = obj;
        this.f43620c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43618a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f43619b, (TextureBufferImpl.RefCountMonitor) this.f43620c);
                return;
            case 1:
                ((EglRenderer) this.f43619b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f43620c);
                return;
            case 2:
                ((EglRenderer) this.f43619b).lambda$release$1((CountDownLatch) this.f43620c);
                return;
            case 3:
                ((EglRenderer) this.f43619b).lambda$release$2((Looper) this.f43620c);
                return;
            case 4:
                ((VideoFileRenderer) this.f43619b).lambda$onFrame$0((VideoFrame) this.f43620c);
                return;
            case 5:
                ((VideoFileRenderer) this.f43619b).lambda$release$2((CountDownLatch) this.f43620c);
                return;
            default:
                ((VideoSource) this.f43619b).lambda$setVideoProcessor$0((VideoFrame) this.f43620c);
                return;
        }
    }
}
