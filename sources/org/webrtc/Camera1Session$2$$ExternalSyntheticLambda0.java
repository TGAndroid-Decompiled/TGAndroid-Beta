package org.webrtc;

public final class Camera1Session$2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Camera1Session.AnonymousClass2 f$0;
    public final byte[] f$1;

    public Camera1Session$2$$ExternalSyntheticLambda0(Camera1Session.AnonymousClass2 anonymousClass2, byte[] bArr, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
        this.f$1 = bArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onPreviewFrame$1(this.f$1);
                break;
            default:
                this.f$0.lambda$onPreviewFrame$0(this.f$1);
                break;
        }
    }
}
