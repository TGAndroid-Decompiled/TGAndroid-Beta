package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45367a;
    public final Camera1Session.AnonymousClass2 f45368b;
    public final byte[] f45369c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45367a = i10;
        this.f45368b = anonymousClass2;
        this.f45369c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45367a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45368b, this.f45369c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45368b, this.f45369c);
                return;
        }
    }
}
