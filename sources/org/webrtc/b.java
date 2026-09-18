package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40604a;
    public final Camera1Session.AnonymousClass2 f40605b;
    public final byte[] f40606c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40604a = i10;
        this.f40605b = anonymousClass2;
        this.f40606c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40604a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40605b, this.f40606c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40605b, this.f40606c);
                return;
        }
    }
}
