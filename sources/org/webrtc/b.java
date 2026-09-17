package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43590a;
    public final Camera1Session.AnonymousClass2 f43591b;
    public final byte[] f43592c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43590a = i10;
        this.f43591b = anonymousClass2;
        this.f43592c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43590a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43591b, this.f43592c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43591b, this.f43592c);
                return;
        }
    }
}
