package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40375a;
    public final Camera1Session.AnonymousClass2 f40376b;
    public final byte[] f40377c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40375a = i10;
        this.f40376b = anonymousClass2;
        this.f40377c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40375a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40376b, this.f40377c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40376b, this.f40377c);
                return;
        }
    }
}
