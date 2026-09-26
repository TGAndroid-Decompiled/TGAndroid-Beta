package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40617a;
    public final Camera1Session.AnonymousClass2 f40618b;
    public final byte[] f40619c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40617a = i10;
        this.f40618b = anonymousClass2;
        this.f40619c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40617a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40618b, this.f40619c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40618b, this.f40619c);
                return;
        }
    }
}
