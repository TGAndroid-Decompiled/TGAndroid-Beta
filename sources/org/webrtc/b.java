package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f55025a;
    public final Camera1Session.AnonymousClass2 f55026b;
    public final byte[] f55027c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f55025a = i7;
        this.f55026b = anonymousClass2;
        this.f55027c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f55025a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f55026b, this.f55027c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f55026b, this.f55027c);
                return;
        }
    }
}
