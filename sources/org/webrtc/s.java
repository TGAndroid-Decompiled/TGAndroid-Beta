package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.webrtc.GlGenericDrawer;
import org.webrtc.TextureBufferImpl;
public final class s implements Runnable {
    public final int f40370a;
    public final Object f40371b;
    public final Object f40372c;

    public s(int i10, Object obj, Object obj2) {
        this.f40370a = i10;
        this.f40371b = obj;
        this.f40372c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f40370a) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) this.f40371b, (TextureBufferImpl.RefCountMonitor) this.f40372c);
                return;
            case 1:
                ((EglRenderer) this.f40371b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f40372c);
                return;
            case 2:
                ((EglRenderer) this.f40371b).lambda$release$1((CountDownLatch) this.f40372c);
                return;
            case 3:
                ((EglRenderer) this.f40371b).lambda$release$2((Looper) this.f40372c);
                return;
            case 4:
                ((VideoFileRenderer) this.f40371b).lambda$onFrame$0((VideoFrame) this.f40372c);
                return;
            case 5:
                ((VideoFileRenderer) this.f40371b).lambda$release$2((CountDownLatch) this.f40372c);
                return;
            default:
                ((VideoSource) this.f40371b).lambda$setVideoProcessor$0((VideoFrame) this.f40372c);
                return;
        }
    }
}
