package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43865a;
    public final Camera1Session.AnonymousClass2 f43866b;
    public final byte[] f43867c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43865a = i10;
        this.f43866b = anonymousClass2;
        this.f43867c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43865a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43866b, this.f43867c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43866b, this.f43867c);
                return;
        }
    }
}
