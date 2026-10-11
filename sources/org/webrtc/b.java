package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45179a;
    public final Camera1Session.AnonymousClass2 f45180b;
    public final byte[] f45181c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45179a = i10;
        this.f45180b = anonymousClass2;
        this.f45181c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45179a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45180b, this.f45181c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45180b, this.f45181c);
                return;
        }
    }
}
