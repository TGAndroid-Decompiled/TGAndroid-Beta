package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f52943a;
    public final Camera1Session.AnonymousClass2 f52944b;
    public final byte[] f52945c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f52943a = i7;
        this.f52944b = anonymousClass2;
        this.f52945c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f52943a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f52944b, this.f52945c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f52944b, this.f52945c);
                return;
        }
    }
}
