package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40717a;
    public final Camera1Session.AnonymousClass2 f40718b;
    public final byte[] f40719c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40717a = i10;
        this.f40718b = anonymousClass2;
        this.f40719c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40717a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40718b, this.f40719c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40718b, this.f40719c);
                return;
        }
    }
}
