package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

public final class s implements Runnable {

    public final int f45321a;

    public final Object f45322b;

    public final Object f45323c;

    public s(int i10, Object obj, Object obj2) {
        this.f45321a = i10;
        this.f45322b = obj;
        this.f45323c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f45321a) {
            case 0:
                ((TextureBufferImpl) this.f45322b).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f45323c);
                break;
            case 1:
                ((EglRenderer) this.f45322b).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f45323c);
                break;
            case 2:
                ((EglRenderer) this.f45322b).lambda$release$1((CountDownLatch) this.f45323c);
                break;
            case 3:
                ((EglRenderer) this.f45322b).lambda$release$2((Looper) this.f45323c);
                break;
            case 4:
                ((VideoFileRenderer) this.f45322b).lambda$onFrame$0((VideoFrame) this.f45323c);
                break;
            case 5:
                ((VideoFileRenderer) this.f45322b).lambda$release$2((CountDownLatch) this.f45323c);
                break;
            default:
                ((VideoSource) this.f45322b).lambda$setVideoProcessor$0((VideoFrame) this.f45323c);
                break;
        }
    }
}
