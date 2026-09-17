package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40370a;
    public final Camera1Session.AnonymousClass2 f40371b;
    public final byte[] f40372c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40370a = i10;
        this.f40371b = anonymousClass2;
        this.f40372c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40370a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40371b, this.f40372c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40371b, this.f40372c);
                return;
        }
    }
}
