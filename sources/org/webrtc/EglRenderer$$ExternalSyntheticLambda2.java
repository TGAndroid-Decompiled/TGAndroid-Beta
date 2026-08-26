package org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

public final class EglRenderer$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public EglRenderer$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) this.f$0).lambda$getTexture$7((GlGenericDrawer.TextureCallback) this.f$1);
                break;
            case 1:
                ((TextureBufferImpl) this.f$0).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f$1);
                break;
            case 2:
                ((EglRenderer) this.f$0).lambda$release$1((CountDownLatch) this.f$1);
                break;
            case 3:
                ((EglRenderer) this.f$0).lambda$release$2((Looper) this.f$1);
                break;
            case 4:
                ((VideoFileRenderer) this.f$0).lambda$onFrame$0((VideoFrame) this.f$1);
                break;
            case 5:
                ((VideoFileRenderer) this.f$0).lambda$release$2((CountDownLatch) this.f$1);
                break;
            default:
                ((VideoSource) this.f$0).lambda$setVideoProcessor$0((VideoFrame) this.f$1);
                break;
        }
    }
}
