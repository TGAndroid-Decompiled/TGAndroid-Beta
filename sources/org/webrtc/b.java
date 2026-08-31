package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44038a;
    public final Camera1Session.AnonymousClass2 f44039b;
    public final byte[] f44040c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44038a = i10;
        this.f44039b = anonymousClass2;
        this.f44040c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44038a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44039b, this.f44040c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44039b, this.f44040c);
                return;
        }
    }
}
