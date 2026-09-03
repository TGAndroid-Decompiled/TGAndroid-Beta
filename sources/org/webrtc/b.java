package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f44069a;
    public final Camera1Session.AnonymousClass2 f44070b;
    public final byte[] f44071c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f44069a = i10;
        this.f44070b = anonymousClass2;
        this.f44071c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f44069a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f44070b, this.f44071c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f44070b, this.f44071c);
                return;
        }
    }
}
