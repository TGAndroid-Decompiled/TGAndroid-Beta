package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43617a;
    public final Camera1Session.AnonymousClass2 f43618b;
    public final byte[] f43619c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43617a = i10;
        this.f43618b = anonymousClass2;
        this.f43619c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43617a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43618b, this.f43619c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43618b, this.f43619c);
                return;
        }
    }
}
