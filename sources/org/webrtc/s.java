package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f45207a;
    public final Object f45208b;
    public final Object f45209c;

    public s(int i10, Object obj, Object obj2) {
        this.f45207a = i10;
        this.f45208b = obj;
        this.f45209c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45207a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f45208b, (TextureBufferImpl.RefCountMonitor) this.f45209c);
                return;
            case 1:
                ((EglRenderer) this.f45208b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45209c);
                return;
            case 2:
                ((EglRenderer) this.f45208b).lambda$release$1((CountDownLatch) this.f45209c);
                return;
            case 3:
                ((EglRenderer) this.f45208b).lambda$release$2((Looper) this.f45209c);
                return;
            case 4:
                ((VideoFileRenderer) this.f45208b).lambda$onFrame$0((VideoFrame) this.f45209c);
                return;
            case 5:
                ((VideoFileRenderer) this.f45208b).lambda$release$2((CountDownLatch) this.f45209c);
                return;
            default:
                ((VideoSource) this.f45208b).lambda$setVideoProcessor$0((VideoFrame) this.f45209c);
                return;
        }
    }
}
