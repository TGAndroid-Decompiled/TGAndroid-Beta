package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44497a;
    public final Camera1Session.AnonymousClass2 f44498b;
    public final byte[] f44499c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44497a = i10;
        this.f44498b = anonymousClass2;
        this.f44499c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44497a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44498b, this.f44499c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44498b, this.f44499c);
                return;
        }
    }
}
