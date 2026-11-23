package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f55151a;
    public final Camera1Session.AnonymousClass2 f55152b;
    public final byte[] f55153c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f55151a = i7;
        this.f55152b = anonymousClass2;
        this.f55153c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f55151a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f55152b, this.f55153c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f55152b, this.f55153c);
                return;
        }
    }
}
