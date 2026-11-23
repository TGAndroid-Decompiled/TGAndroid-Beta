package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class r implements Runnable {
    public final int f55096a;
    public final Object f55097b;
    public final Object f55098c;

    public r(int i7, Object obj, Object obj2) {
        this.f55096a = i7;
        this.f55097b = obj;
        this.f55098c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f55096a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f55097b, (TextureBufferImpl.RefCountMonitor) this.f55098c);
                return;
            case 1:
                ((EglRenderer) this.f55097b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f55098c);
                return;
            case 2:
                ((EglRenderer) this.f55097b).lambda$release$1((CountDownLatch) this.f55098c);
                return;
            case 3:
                ((EglRenderer) this.f55097b).lambda$release$2((Looper) this.f55098c);
                return;
            case 4:
                ((VideoFileRenderer) this.f55097b).lambda$onFrame$0((VideoFrame) this.f55098c);
                return;
            case 5:
                ((VideoFileRenderer) this.f55097b).lambda$release$2((CountDownLatch) this.f55098c);
                return;
            default:
                ((VideoSource) this.f55097b).lambda$setVideoProcessor$0((VideoFrame) this.f55098c);
                return;
        }
    }
}
