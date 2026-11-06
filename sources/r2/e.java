package r2;

import c8.p0;
import java.util.Arrays;
public final class e extends y2.f {
    public byte[] f54172s;
    public volatile boolean f54173w;
    public byte[] f54174x;

    @Override
    public final void a() {
        try {
            this.f58781r.open(this.f58776b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54173w) {
                byte[] bArr = this.f54172s;
                if (bArr.length < i10 + 16384) {
                    this.f54172s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58781r.read(this.f54172s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54173w) {
                this.f54174x = Arrays.copyOf(this.f54172s, i10);
            }
            p0.a(this.f58781r);
        } catch (Throwable th2) {
            p0.a(this.f58781r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54173w = true;
    }
}
