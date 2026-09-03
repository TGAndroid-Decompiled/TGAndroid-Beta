package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40941a;
    public final Object f40942b;
    public final Object f40943c;

    public s(int i10, Object obj, Object obj2) {
        this.f40941a = i10;
        this.f40942b = obj;
        this.f40943c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40941a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40942b, (TextureBufferImpl.RefCountMonitor) this.f40943c);
                return;
            case 1:
                ((EglRenderer) this.f40942b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40943c);
                return;
            case 2:
                ((EglRenderer) this.f40942b).lambda$release$1((CountDownLatch) this.f40943c);
                return;
            case 3:
                ((EglRenderer) this.f40942b).lambda$release$2((Looper) this.f40943c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40942b).lambda$onFrame$0((VideoFrame) this.f40943c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40942b).lambda$release$2((CountDownLatch) this.f40943c);
                return;
            default:
                ((VideoSource) this.f40942b).lambda$setVideoProcessor$0((VideoFrame) this.f40943c);
                return;
        }
    }
}
