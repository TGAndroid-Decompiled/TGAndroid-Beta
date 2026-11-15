package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f54456a;
    public final Camera1Session.AnonymousClass2 f54457b;
    public final byte[] f54458c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f54456a = i7;
        this.f54457b = anonymousClass2;
        this.f54458c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f54456a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f54457b, this.f54458c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f54457b, this.f54458c);
                return;
        }
    }
}
