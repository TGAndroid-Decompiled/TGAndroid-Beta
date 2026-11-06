package r2;

import c8.p0;
import java.util.Arrays;
public final class e extends y2.f {
    public byte[] f54197s;
    public volatile boolean f54198w;
    public byte[] f54199x;

    @Override
    public final void a() {
        try {
            this.f58806r.open(this.f58801b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54198w) {
                byte[] bArr = this.f54197s;
                if (bArr.length < i10 + 16384) {
                    this.f54197s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58806r.read(this.f54197s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54198w) {
                this.f54199x = Arrays.copyOf(this.f54197s, i10);
            }
            p0.a(this.f58806r);
        } catch (Throwable th2) {
            p0.a(this.f58806r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54198w = true;
    }
}
