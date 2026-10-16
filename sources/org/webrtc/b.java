package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f42486a;
    public final Camera1Session.AnonymousClass2 f42487b;
    public final byte[] f42488c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f42486a = i10;
        this.f42487b = anonymousClass2;
        this.f42488c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f42486a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f42487b, this.f42488c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f42487b, this.f42488c);
                return;
        }
    }
}
