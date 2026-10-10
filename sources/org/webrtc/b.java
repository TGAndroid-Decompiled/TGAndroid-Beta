package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45155a;
    public final Camera1Session.AnonymousClass2 f45156b;
    public final byte[] f45157c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45155a = i10;
        this.f45156b = anonymousClass2;
        this.f45157c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45155a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45156b, this.f45157c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45156b, this.f45157c);
                return;
        }
    }
}
