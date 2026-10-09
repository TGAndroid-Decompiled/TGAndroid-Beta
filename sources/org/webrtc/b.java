package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45109a;
    public final Camera1Session.AnonymousClass2 f45110b;
    public final byte[] f45111c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45109a = i10;
        this.f45110b = anonymousClass2;
        this.f45111c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45109a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45110b, this.f45111c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45110b, this.f45111c);
                return;
        }
    }
}
