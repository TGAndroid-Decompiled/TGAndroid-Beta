package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43873a;
    public final Camera1Session.AnonymousClass2 f43874b;
    public final byte[] f43875c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43873a = i10;
        this.f43874b = anonymousClass2;
        this.f43875c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43873a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43874b, this.f43875c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43874b, this.f43875c);
                return;
        }
    }
}
