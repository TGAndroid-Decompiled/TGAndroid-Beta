package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f53050a;
    public final Camera1Session.AnonymousClass2 f53051b;
    public final byte[] f53052c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f53050a = i7;
        this.f53051b = anonymousClass2;
        this.f53052c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f53050a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f53051b, this.f53052c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f53051b, this.f53052c);
                return;
        }
    }
}
