package org.webrtc;

import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoSource;
public final class f implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public f(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TextureBufferImpl.b((TextureBufferImpl) obj2, (TextureBufferImpl.RefCountMonitor) obj);
                return;
            default:
                VideoSource.AnonymousClass1.b((VideoSource.AnonymousClass1) obj2, (VideoFrame) obj);
                return;
        }
    }
}
