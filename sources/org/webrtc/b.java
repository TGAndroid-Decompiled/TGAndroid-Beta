package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f55070a;
    public final Camera1Session.AnonymousClass2 f55071b;
    public final byte[] f55072c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f55070a = i7;
        this.f55071b = anonymousClass2;
        this.f55072c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f55070a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f55071b, this.f55072c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f55071b, this.f55072c);
                return;
        }
    }
}
