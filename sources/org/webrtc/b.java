package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43616a;
    public final Camera1Session.AnonymousClass2 f43617b;
    public final byte[] f43618c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43616a = i10;
        this.f43617b = anonymousClass2;
        this.f43618c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43616a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43617b, this.f43618c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43617b, this.f43618c);
                return;
        }
    }
}
