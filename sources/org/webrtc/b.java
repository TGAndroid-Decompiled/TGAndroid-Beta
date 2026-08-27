package org.webrtc;

public final class b implements Runnable {

    public final int f45293a;

    public final Camera1Session.AnonymousClass2 f45294b;

    public final byte[] f45295c;

    public b(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i10) {
        this.f45293a = i10;
        this.f45294b = anonymousClass2;
        this.f45295c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45293a) {
            case 0:
                this.f45294b.lambda$onPreviewFrame$1(this.f45295c);
                break;
            default:
                this.f45294b.lambda$onPreviewFrame$0(this.f45295c);
                break;
        }
    }
}
