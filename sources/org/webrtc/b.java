package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44991a;
    public final Camera1Session.AnonymousClass2 f44992b;
    public final byte[] f44993c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44991a = i10;
        this.f44992b = anonymousClass2;
        this.f44993c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44991a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44992b, this.f44993c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44992b, this.f44993c);
                return;
        }
    }
}
