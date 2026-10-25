package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f46436a;
    public final Camera1Session.AnonymousClass2 f46437b;
    public final byte[] f46438c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f46436a = i10;
        this.f46437b = anonymousClass2;
        this.f46438c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f46436a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f46437b, this.f46438c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f46437b, this.f46438c);
                return;
        }
    }
}
