package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45287a;
    public final Camera1Session.AnonymousClass2 f45288b;
    public final byte[] f45289c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i9) {
        this.f45287a = i9;
        this.f45288b = anonymousClass2;
        this.f45289c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45287a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45288b, this.f45289c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45288b, this.f45289c);
                return;
        }
    }
}
