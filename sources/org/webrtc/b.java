package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43930a;
    public final Camera1Session.AnonymousClass2 f43931b;
    public final byte[] f43932c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43930a = i10;
        this.f43931b = anonymousClass2;
        this.f43932c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43930a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43931b, this.f43932c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43931b, this.f43932c);
                return;
        }
    }
}
