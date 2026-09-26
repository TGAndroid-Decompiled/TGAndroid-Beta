package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40643a;
    public final Object f40644b;
    public final Object f40645c;

    public s(int i10, Object obj, Object obj2) {
        this.f40643a = i10;
        this.f40644b = obj;
        this.f40645c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40643a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40644b, (TextureBufferImpl.RefCountMonitor) this.f40645c);
                return;
            case 1:
                ((EglRenderer) this.f40644b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40645c);
                return;
            case 2:
                ((EglRenderer) this.f40644b).lambda$release$1((CountDownLatch) this.f40645c);
                return;
            case 3:
                ((EglRenderer) this.f40644b).lambda$release$2((Looper) this.f40645c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40644b).lambda$onFrame$0((VideoFrame) this.f40645c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40644b).lambda$release$2((CountDownLatch) this.f40645c);
                return;
            default:
                ((VideoSource) this.f40644b).lambda$setVideoProcessor$0((VideoFrame) this.f40645c);
                return;
        }
    }
}
