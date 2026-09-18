package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40630a;
    public final Object f40631b;
    public final Object f40632c;

    public s(int i10, Object obj, Object obj2) {
        this.f40630a = i10;
        this.f40631b = obj;
        this.f40632c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40630a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40631b, (TextureBufferImpl.RefCountMonitor) this.f40632c);
                return;
            case 1:
                ((EglRenderer) this.f40631b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40632c);
                return;
            case 2:
                ((EglRenderer) this.f40631b).lambda$release$1((CountDownLatch) this.f40632c);
                return;
            case 3:
                ((EglRenderer) this.f40631b).lambda$release$2((Looper) this.f40632c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40631b).lambda$onFrame$0((VideoFrame) this.f40632c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40631b).lambda$release$2((CountDownLatch) this.f40632c);
                return;
            default:
                ((VideoSource) this.f40631b).lambda$setVideoProcessor$0((VideoFrame) this.f40632c);
                return;
        }
    }
}
