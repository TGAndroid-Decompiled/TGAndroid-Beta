package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40396a;
    public final Object f40397b;
    public final Object f40398c;

    public s(int i10, Object obj, Object obj2) {
        this.f40396a = i10;
        this.f40397b = obj;
        this.f40398c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40396a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40397b, (TextureBufferImpl.RefCountMonitor) this.f40398c);
                return;
            case 1:
                ((EglRenderer) this.f40397b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40398c);
                return;
            case 2:
                ((EglRenderer) this.f40397b).lambda$release$1((CountDownLatch) this.f40398c);
                return;
            case 3:
                ((EglRenderer) this.f40397b).lambda$release$2((Looper) this.f40398c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40397b).lambda$onFrame$0((VideoFrame) this.f40398c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40397b).lambda$release$2((CountDownLatch) this.f40398c);
                return;
            default:
                ((VideoSource) this.f40397b).lambda$setVideoProcessor$0((VideoFrame) this.f40398c);
                return;
        }
    }
}
