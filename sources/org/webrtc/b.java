package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44999a;
    public final Camera1Session.AnonymousClass2 f45000b;
    public final byte[] f45001c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44999a = i10;
        this.f45000b = anonymousClass2;
        this.f45001c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44999a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45000b, this.f45001c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45000b, this.f45001c);
                return;
        }
    }
}
