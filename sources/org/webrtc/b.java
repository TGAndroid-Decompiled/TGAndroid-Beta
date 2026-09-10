package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f39476a;
    public final Camera1Session.AnonymousClass2 f39477b;
    public final byte[] f39478c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f39476a = i10;
        this.f39477b = anonymousClass2;
        this.f39478c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f39476a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f39477b, this.f39478c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f39477b, this.f39478c);
                return;
        }
    }
}
