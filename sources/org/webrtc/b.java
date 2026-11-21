package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f55066a;
    public final Camera1Session.AnonymousClass2 f55067b;
    public final byte[] f55068c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f55066a = i7;
        this.f55067b = anonymousClass2;
        this.f55068c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f55066a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f55067b, this.f55068c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f55067b, this.f55068c);
                return;
        }
    }
}
