package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44293a;
    public final Camera1Session.AnonymousClass2 f44294b;
    public final byte[] f44295c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44293a = i10;
        this.f44294b = anonymousClass2;
        this.f44295c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44293a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44294b, this.f44295c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44294b, this.f44295c);
                return;
        }
    }
}
