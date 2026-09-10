package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f39502a;
    public final Object f39503b;
    public final Object f39504c;

    public s(int i10, Object obj, Object obj2) {
        this.f39502a = i10;
        this.f39503b = obj;
        this.f39504c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f39502a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f39503b, (TextureBufferImpl.RefCountMonitor) this.f39504c);
                return;
            case 1:
                ((EglRenderer) this.f39503b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f39504c);
                return;
            case 2:
                ((EglRenderer) this.f39503b).lambda$release$1((CountDownLatch) this.f39504c);
                return;
            case 3:
                ((EglRenderer) this.f39503b).lambda$release$2((Looper) this.f39504c);
                return;
            case 4:
                ((VideoFileRenderer) this.f39503b).lambda$onFrame$0((VideoFrame) this.f39504c);
                return;
            case 5:
                ((VideoFileRenderer) this.f39503b).lambda$release$2((CountDownLatch) this.f39504c);
                return;
            default:
                ((VideoSource) this.f39503b).lambda$setVideoProcessor$0((VideoFrame) this.f39504c);
                return;
        }
    }
}
