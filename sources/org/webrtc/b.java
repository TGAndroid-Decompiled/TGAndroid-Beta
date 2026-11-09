package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f53051a;
    public final Camera1Session.AnonymousClass2 f53052b;
    public final byte[] f53053c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f53051a = i7;
        this.f53052b = anonymousClass2;
        this.f53053c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f53051a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f53052b, this.f53053c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f53052b, this.f53053c);
                return;
        }
    }
}
