package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f46474a;
    public final Camera1Session.AnonymousClass2 f46475b;
    public final byte[] f46476c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f46474a = i10;
        this.f46475b = anonymousClass2;
        this.f46476c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f46474a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f46475b, this.f46476c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f46475b, this.f46476c);
                return;
        }
    }
}
