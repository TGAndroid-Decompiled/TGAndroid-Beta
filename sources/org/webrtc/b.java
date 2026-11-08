package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f53037a;
    public final Camera1Session.AnonymousClass2 f53038b;
    public final byte[] f53039c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f53037a = i7;
        this.f53038b = anonymousClass2;
        this.f53039c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f53037a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f53038b, this.f53039c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f53038b, this.f53039c);
                return;
        }
    }
}
