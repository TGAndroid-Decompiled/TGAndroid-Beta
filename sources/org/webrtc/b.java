package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f46439a;
    public final Camera1Session.AnonymousClass2 f46440b;
    public final byte[] f46441c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f46439a = i10;
        this.f46440b = anonymousClass2;
        this.f46441c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f46439a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f46440b, this.f46441c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f46440b, this.f46441c);
                return;
        }
    }
}
