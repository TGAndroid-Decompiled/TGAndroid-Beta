package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f52945a;
    public final Camera1Session.AnonymousClass2 f52946b;
    public final byte[] f52947c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i7) {
        this.f52945a = i7;
        this.f52946b = anonymousClass2;
        this.f52947c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f52945a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f52946b, this.f52947c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f52946b, this.f52947c);
                return;
        }
    }
}
