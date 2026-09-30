package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40620a;
    public final Camera1Session.AnonymousClass2 f40621b;
    public final byte[] f40622c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40620a = i10;
        this.f40621b = anonymousClass2;
        this.f40622c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40620a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40621b, this.f40622c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40621b, this.f40622c);
                return;
        }
    }
}
