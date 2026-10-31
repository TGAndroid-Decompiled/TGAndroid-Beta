package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44486a;
    public final Camera1Session.AnonymousClass2 f44487b;
    public final byte[] f44488c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44486a = i10;
        this.f44487b = anonymousClass2;
        this.f44488c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44486a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44487b, this.f44488c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44487b, this.f44488c);
                return;
        }
    }
}
