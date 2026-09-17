package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f43645a;
    public final Object f43646b;
    public final Object f43647c;

    public s(int i10, Object obj, Object obj2) {
        this.f43645a = i10;
        this.f43646b = obj;
        this.f43647c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43645a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f43646b, (TextureBufferImpl.RefCountMonitor) this.f43647c);
                return;
            case 1:
                ((EglRenderer) this.f43646b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f43647c);
                return;
            case 2:
                ((EglRenderer) this.f43646b).lambda$release$1((CountDownLatch) this.f43647c);
                return;
            case 3:
                ((EglRenderer) this.f43646b).lambda$release$2((Looper) this.f43647c);
                return;
            case 4:
                ((VideoFileRenderer) this.f43646b).lambda$onFrame$0((VideoFrame) this.f43647c);
                return;
            case 5:
                ((VideoFileRenderer) this.f43646b).lambda$release$2((CountDownLatch) this.f43647c);
                return;
            default:
                ((VideoSource) this.f43646b).lambda$setVideoProcessor$0((VideoFrame) this.f43647c);
                return;
        }
    }
}
