package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43938a;
    public final Camera1Session.AnonymousClass2 f43939b;
    public final byte[] f43940c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43938a = i10;
        this.f43939b = anonymousClass2;
        this.f43940c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43938a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43939b, this.f43940c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43939b, this.f43940c);
                return;
        }
    }
}
