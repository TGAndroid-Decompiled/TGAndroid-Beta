package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40666a;
    public final Camera1Session.AnonymousClass2 f40667b;
    public final byte[] f40668c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40666a = i10;
        this.f40667b = anonymousClass2;
        this.f40668c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40666a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40667b, this.f40668c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40667b, this.f40668c);
                return;
        }
    }
}
