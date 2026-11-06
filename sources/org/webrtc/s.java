package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f52971a;
    public final Object f52972b;
    public final Object f52973c;

    public s(int i7, Object obj, Object obj2) {
        this.f52971a = i7;
        this.f52972b = obj;
        this.f52973c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f52971a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f52972b, (TextureBufferImpl.RefCountMonitor) this.f52973c);
                return;
            case 1:
                ((EglRenderer) this.f52972b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f52973c);
                return;
            case 2:
                ((EglRenderer) this.f52972b).lambda$release$1((CountDownLatch) this.f52973c);
                return;
            case 3:
                ((EglRenderer) this.f52972b).lambda$release$2((Looper) this.f52973c);
                return;
            case 4:
                ((VideoFileRenderer) this.f52972b).lambda$onFrame$0((VideoFrame) this.f52973c);
                return;
            case 5:
                ((VideoFileRenderer) this.f52972b).lambda$release$2((CountDownLatch) this.f52973c);
                return;
            default:
                ((VideoSource) this.f52972b).lambda$setVideoProcessor$0((VideoFrame) this.f52973c);
                return;
        }
    }
}
