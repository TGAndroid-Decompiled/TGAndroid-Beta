package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f52947a;
    public final Object f52948b;
    public final Object f52949c;

    public s(int i7, Object obj, Object obj2) {
        this.f52947a = i7;
        this.f52948b = obj;
        this.f52949c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f52947a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f52948b, (TextureBufferImpl.RefCountMonitor) this.f52949c);
                return;
            case 1:
                ((EglRenderer) this.f52948b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f52949c);
                return;
            case 2:
                ((EglRenderer) this.f52948b).lambda$release$1((CountDownLatch) this.f52949c);
                return;
            case 3:
                ((EglRenderer) this.f52948b).lambda$release$2((Looper) this.f52949c);
                return;
            case 4:
                ((VideoFileRenderer) this.f52948b).lambda$onFrame$0((VideoFrame) this.f52949c);
                return;
            case 5:
                ((VideoFileRenderer) this.f52948b).lambda$release$2((CountDownLatch) this.f52949c);
                return;
            default:
                ((VideoSource) this.f52948b).lambda$setVideoProcessor$0((VideoFrame) this.f52949c);
                return;
        }
    }
}
