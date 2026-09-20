package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40671a;
    public final Object f40672b;
    public final Object f40673c;

    public s(int i10, Object obj, Object obj2) {
        this.f40671a = i10;
        this.f40672b = obj;
        this.f40673c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40671a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40672b, (TextureBufferImpl.RefCountMonitor) this.f40673c);
                return;
            case 1:
                ((EglRenderer) this.f40672b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40673c);
                return;
            case 2:
                ((EglRenderer) this.f40672b).lambda$release$1((CountDownLatch) this.f40673c);
                return;
            case 3:
                ((EglRenderer) this.f40672b).lambda$release$2((Looper) this.f40673c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40672b).lambda$onFrame$0((VideoFrame) this.f40673c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40672b).lambda$release$2((CountDownLatch) this.f40673c);
                return;
            default:
                ((VideoSource) this.f40672b).lambda$setVideoProcessor$0((VideoFrame) this.f40673c);
                return;
        }
    }
}
