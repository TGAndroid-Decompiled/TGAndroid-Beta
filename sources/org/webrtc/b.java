package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43589a;
    public final Camera1Session.AnonymousClass2 f43590b;
    public final byte[] f43591c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43589a = i10;
        this.f43590b = anonymousClass2;
        this.f43591c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43589a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43590b, this.f43591c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43590b, this.f43591c);
                return;
        }
    }
}
