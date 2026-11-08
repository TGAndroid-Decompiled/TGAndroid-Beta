package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f53036a;
    public final Camera1Session.AnonymousClass2 f53037b;
    public final byte[] f53038c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f53036a = i7;
        this.f53037b = anonymousClass2;
        this.f53038c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f53036a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f53037b, this.f53038c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f53037b, this.f53038c);
                return;
        }
    }
}
