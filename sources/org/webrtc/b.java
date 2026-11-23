package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f55035a;
    public final Camera1Session.AnonymousClass2 f55036b;
    public final byte[] f55037c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f55035a = i7;
        this.f55036b = anonymousClass2;
        this.f55037c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f55035a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f55036b, this.f55037c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f55036b, this.f55037c);
                return;
        }
    }
}
