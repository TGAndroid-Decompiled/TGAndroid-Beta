package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f43931a;
    public final Camera1Session.AnonymousClass2 f43932b;
    public final byte[] f43933c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f43931a = i10;
        this.f43932b = anonymousClass2;
        this.f43933c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f43931a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f43932b, this.f43933c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f43932b, this.f43933c);
                return;
        }
    }
}
