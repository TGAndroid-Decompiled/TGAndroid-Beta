package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f53010a;
    public final Camera1Session.AnonymousClass2 f53011b;
    public final byte[] f53012c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i3) {
        this.f53010a = i3;
        this.f53011b = anonymousClass2;
        this.f53012c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f53010a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f53011b, this.f53012c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f53011b, this.f53012c);
                return;
        }
    }
}
