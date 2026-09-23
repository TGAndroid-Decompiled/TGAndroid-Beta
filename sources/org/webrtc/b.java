package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40299a;
    public final Camera1Session.AnonymousClass2 f40300b;
    public final byte[] f40301c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40299a = i10;
        this.f40300b = anonymousClass2;
        this.f40301c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40299a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40300b, this.f40301c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40300b, this.f40301c);
                return;
        }
    }
}
