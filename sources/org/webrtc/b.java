package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40618a;
    public final Camera1Session.AnonymousClass2 f40619b;
    public final byte[] f40620c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40618a = i10;
        this.f40619b = anonymousClass2;
        this.f40620c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40618a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40619b, this.f40620c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40619b, this.f40620c);
                return;
        }
    }
}
