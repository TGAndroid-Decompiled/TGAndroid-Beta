package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f42783a;
    public final Camera1Session.AnonymousClass2 f42784b;
    public final byte[] f42785c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f42783a = i10;
        this.f42784b = anonymousClass2;
        this.f42785c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f42783a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f42784b, this.f42785c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f42784b, this.f42785c);
                return;
        }
    }
}
