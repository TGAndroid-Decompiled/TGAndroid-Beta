package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40893a;
    public final Camera1Session.AnonymousClass2 f40894b;
    public final byte[] f40895c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40893a = i10;
        this.f40894b = anonymousClass2;
        this.f40895c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40893a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40894b, this.f40895c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40894b, this.f40895c);
                return;
        }
    }
}
