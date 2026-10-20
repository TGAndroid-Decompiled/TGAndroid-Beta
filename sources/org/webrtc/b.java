package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43875a;
    public final Camera1Session.AnonymousClass2 f43876b;
    public final byte[] f43877c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43875a = i10;
        this.f43876b = anonymousClass2;
        this.f43877c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43875a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43876b, this.f43877c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43876b, this.f43877c);
                return;
        }
    }
}
