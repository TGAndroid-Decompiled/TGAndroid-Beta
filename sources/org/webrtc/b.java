package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f52919a;
    public final Camera1Session.AnonymousClass2 f52920b;
    public final byte[] f52921c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f52919a = i7;
        this.f52920b = anonymousClass2;
        this.f52921c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f52919a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f52920b, this.f52921c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f52920b, this.f52921c);
                return;
        }
    }
}
