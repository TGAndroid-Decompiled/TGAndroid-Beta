package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43893a;
    public final Camera1Session.AnonymousClass2 f43894b;
    public final byte[] f43895c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43893a = i10;
        this.f43894b = anonymousClass2;
        this.f43895c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43893a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43894b, this.f43895c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43894b, this.f43895c);
                return;
        }
    }
}
