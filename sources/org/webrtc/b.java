package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40348a;
    public final Camera1Session.AnonymousClass2 f40349b;
    public final byte[] f40350c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40348a = i10;
        this.f40349b = anonymousClass2;
        this.f40350c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40348a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40349b, this.f40350c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40349b, this.f40350c);
                return;
        }
    }
}
