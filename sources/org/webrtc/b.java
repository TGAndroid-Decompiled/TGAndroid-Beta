package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f45145a;
    public final Camera1Session.AnonymousClass2 f45146b;
    public final byte[] f45147c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45145a = i10;
        this.f45146b = anonymousClass2;
        this.f45147c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45145a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f45146b, this.f45147c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f45146b, this.f45147c);
                return;
        }
    }
}
