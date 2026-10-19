package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f43893a;
    public final Object f43894b;
    public final Object f43895c;

    public s(int i10, Object obj, Object obj2) {
        this.f43893a = i10;
        this.f43894b = obj;
        this.f43895c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f43893a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f43894b, (TextureBufferImpl.RefCountMonitor) this.f43895c);
                return;
            case 1:
                ((EglRenderer) this.f43894b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f43895c);
                return;
            case 2:
                ((EglRenderer) this.f43894b).lambda$release$1((CountDownLatch) this.f43895c);
                return;
            case 3:
                ((EglRenderer) this.f43894b).lambda$release$2((Looper) this.f43895c);
                return;
            case 4:
                ((VideoFileRenderer) this.f43894b).lambda$onFrame$0((VideoFrame) this.f43895c);
                return;
            case 5:
                ((VideoFileRenderer) this.f43894b).lambda$release$2((CountDownLatch) this.f43895c);
                return;
            default:
                ((VideoSource) this.f43894b).lambda$setVideoProcessor$0((VideoFrame) this.f43895c);
                return;
        }
    }
}
