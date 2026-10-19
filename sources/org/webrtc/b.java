package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43867a;
    public final Camera1Session.AnonymousClass2 f43868b;
    public final byte[] f43869c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43867a = i10;
        this.f43868b = anonymousClass2;
        this.f43869c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43867a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43868b, this.f43869c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43868b, this.f43869c);
                return;
        }
    }
}
