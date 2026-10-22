package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f43904a;
    public final Object f43905b;
    public final Object f43906c;

    public s(int i10, Object obj, Object obj2) {
        this.f43904a = i10;
        this.f43905b = obj;
        this.f43906c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43904a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f43905b, (TextureBufferImpl.RefCountMonitor) this.f43906c);
                return;
            case 1:
                ((EglRenderer) this.f43905b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f43906c);
                return;
            case 2:
                ((EglRenderer) this.f43905b).lambda$release$1((CountDownLatch) this.f43906c);
                return;
            case 3:
                ((EglRenderer) this.f43905b).lambda$release$2((Looper) this.f43906c);
                return;
            case 4:
                ((VideoFileRenderer) this.f43905b).lambda$onFrame$0((VideoFrame) this.f43906c);
                return;
            case 5:
                ((VideoFileRenderer) this.f43905b).lambda$release$2((CountDownLatch) this.f43906c);
                return;
            default:
                ((VideoSource) this.f43905b).lambda$setVideoProcessor$0((VideoFrame) this.f43906c);
                return;
        }
    }
}
