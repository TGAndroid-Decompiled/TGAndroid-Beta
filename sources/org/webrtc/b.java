package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44294a;
    public final Camera1Session.AnonymousClass2 f44295b;
    public final byte[] f44296c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44294a = i10;
        this.f44295b = anonymousClass2;
        this.f44296c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44294a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44295b, this.f44296c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44295b, this.f44296c);
                return;
        }
    }
}
