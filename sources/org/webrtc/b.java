package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43945a;
    public final Camera1Session.AnonymousClass2 f43946b;
    public final byte[] f43947c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43945a = i10;
        this.f43946b = anonymousClass2;
        this.f43947c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43945a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43946b, this.f43947c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43946b, this.f43947c);
                return;
        }
    }
}
