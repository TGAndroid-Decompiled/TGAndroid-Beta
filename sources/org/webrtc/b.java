package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43879a;
    public final Camera1Session.AnonymousClass2 f43880b;
    public final byte[] f43881c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43879a = i10;
        this.f43880b = anonymousClass2;
        this.f43881c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43879a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43880b, this.f43881c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43880b, this.f43881c);
                return;
        }
    }
}
