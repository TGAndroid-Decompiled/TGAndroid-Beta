package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43913a;
    public final Camera1Session.AnonymousClass2 f43914b;
    public final byte[] f43915c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43913a = i10;
        this.f43914b = anonymousClass2;
        this.f43915c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43913a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43914b, this.f43915c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43914b, this.f43915c);
                return;
        }
    }
}
