package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45111a;
    public final Camera1Session.AnonymousClass2 f45112b;
    public final byte[] f45113c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45111a = i10;
        this.f45112b = anonymousClass2;
        this.f45113c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45111a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45112b, this.f45113c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45112b, this.f45113c);
                return;
        }
    }
}
