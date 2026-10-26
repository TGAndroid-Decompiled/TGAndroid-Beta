package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f46465a;
    public final Object f46466b;
    public final Object f46467c;

    public s(int i10, Object obj, Object obj2) {
        this.f46465a = i10;
        this.f46466b = obj;
        this.f46467c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f46465a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f46466b, (TextureBufferImpl.RefCountMonitor) this.f46467c);
                return;
            case 1:
                ((EglRenderer) this.f46466b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f46467c);
                return;
            case 2:
                ((EglRenderer) this.f46466b).lambda$release$1((CountDownLatch) this.f46467c);
                return;
            case 3:
                ((EglRenderer) this.f46466b).lambda$release$2((Looper) this.f46467c);
                return;
            case 4:
                ((VideoFileRenderer) this.f46466b).lambda$onFrame$0((VideoFrame) this.f46467c);
                return;
            case 5:
                ((VideoFileRenderer) this.f46466b).lambda$release$2((CountDownLatch) this.f46467c);
                return;
            default:
                ((VideoSource) this.f46466b).lambda$setVideoProcessor$0((VideoFrame) this.f46467c);
                return;
        }
    }
}
