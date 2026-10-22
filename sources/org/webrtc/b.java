package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43878a;
    public final Camera1Session.AnonymousClass2 f43879b;
    public final byte[] f43880c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43878a = i10;
        this.f43879b = anonymousClass2;
        this.f43880c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43878a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43879b, this.f43880c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43879b, this.f43880c);
                return;
        }
    }
}
