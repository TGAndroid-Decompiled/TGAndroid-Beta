package org.webrtc;

import org.webrtc.Camera1Session;
public final class b implements Runnable {
    public final int f40915a;
    public final Camera1Session.AnonymousClass2 f40916b;
    public final byte[] f40917c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f40915a = i10;
        this.f40916b = anonymousClass2;
        this.f40917c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40915a) {
            case 0:
                Camera1Session.AnonymousClass2.a(this.f40916b, this.f40917c);
                return;
            default:
                Camera1Session.AnonymousClass2.b(this.f40916b, this.f40917c);
                return;
        }
    }
}
