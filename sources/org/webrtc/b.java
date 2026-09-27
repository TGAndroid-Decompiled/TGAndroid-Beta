package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40616a;
    public final Camera1Session.AnonymousClass2 f40617b;
    public final byte[] f40618c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40616a = i10;
        this.f40617b = anonymousClass2;
        this.f40618c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40616a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40617b, this.f40618c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40617b, this.f40618c);
                return;
        }
    }
}
