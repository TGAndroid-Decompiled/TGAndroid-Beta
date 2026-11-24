package org.webrtc;

import org.webrtc.Camera1Session;
import org.webrtc.TextureBufferImpl;
public final class b implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public b(Object obj, Object obj2, byte b) {
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
                Camera1Session.AnonymousClass2.a((Camera1Session.AnonymousClass2) obj2, (byte[]) obj);
                return;
            case 1:
                Camera1Session.AnonymousClass2.b((Camera1Session.AnonymousClass2) obj2, (byte[]) obj);
                return;
            default:
                TextureBufferImpl.a((TextureBufferImpl) obj2, (TextureBufferImpl.RefCountMonitor) obj);
                return;
        }
    }
}
