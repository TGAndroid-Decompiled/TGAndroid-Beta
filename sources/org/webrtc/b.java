package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40344a;
    public final Camera1Session.AnonymousClass2 f40345b;
    public final byte[] f40346c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40344a = i10;
        this.f40345b = anonymousClass2;
        this.f40346c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40344a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40345b, this.f40346c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40345b, this.f40346c);
                return;
        }
    }
}
