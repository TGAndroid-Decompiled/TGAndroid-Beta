package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f45173a;
    public final Object f45174b;
    public final Object f45175c;

    public s(int i10, Object obj, Object obj2) {
        this.f45173a = i10;
        this.f45174b = obj;
        this.f45175c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45173a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f45174b, (TextureBufferImpl.RefCountMonitor) this.f45175c);
                return;
            case 1:
                ((EglRenderer) this.f45174b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45175c);
                return;
            case 2:
                ((EglRenderer) this.f45174b).lambda$release$1((CountDownLatch) this.f45175c);
                return;
            case 3:
                ((EglRenderer) this.f45174b).lambda$release$2((Looper) this.f45175c);
                return;
            case 4:
                ((VideoFileRenderer) this.f45174b).lambda$onFrame$0((VideoFrame) this.f45175c);
                return;
            case 5:
                ((VideoFileRenderer) this.f45174b).lambda$release$2((CountDownLatch) this.f45175c);
                return;
            default:
                ((VideoSource) this.f45174b).lambda$setVideoProcessor$0((VideoFrame) this.f45175c);
                return;
        }
    }
}
