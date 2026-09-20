package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40645a;
    public final Camera1Session.AnonymousClass2 f40646b;
    public final byte[] f40647c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40645a = i10;
        this.f40646b = anonymousClass2;
        this.f40647c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40645a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40646b, this.f40647c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40646b, this.f40647c);
                return;
        }
    }
}
