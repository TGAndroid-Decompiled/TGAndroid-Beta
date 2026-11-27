package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final byte a;
    public final Camera1Session.AnonymousClass2 b;
    public final byte[] c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, byte b) {
        this.a = b;
        this.b = anonymousClass2;
        this.c = bArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        Camera1Session.AnonymousClass2 anonymousClass2 = this.b;
        switch (b) {
            case 0:
                Camera1Session.AnonymousClass2.b(anonymousClass2, bArr);
                return;
            default:
                Camera1Session.AnonymousClass2.a(anonymousClass2, bArr);
                return;
        }
    }
}
