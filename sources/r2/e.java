package r2;

import c8.p0;
import java.util.Arrays;
public final class e extends y2.f {
    public byte[] f54196s;
    public volatile boolean f54197w;
    public byte[] f54198x;

    @Override
    public final void a() {
        try {
            this.f58805r.open(this.f58800b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54197w) {
                byte[] bArr = this.f54196s;
                if (bArr.length < i10 + 16384) {
                    this.f54196s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58805r.read(this.f54196s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54197w) {
                this.f54198x = Arrays.copyOf(this.f54196s, i10);
            }
            p0.a(this.f58805r);
        } catch (Throwable th2) {
            p0.a(this.f58805r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54197w = true;
    }
}
