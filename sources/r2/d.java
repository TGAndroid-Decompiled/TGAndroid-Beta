package r2;

import c8.p0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f54289s;
    public volatile boolean f54290w;
    public byte[] f54291x;

    @Override
    public final void a() {
        try {
            this.f58901r.open(this.f58896b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54290w) {
                byte[] bArr = this.f54289s;
                if (bArr.length < i10 + 16384) {
                    this.f54289s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58901r.read(this.f54289s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54290w) {
                this.f54291x = Arrays.copyOf(this.f54289s, i10);
            }
            p0.a(this.f58901r);
        } catch (Throwable th2) {
            p0.a(this.f58901r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54290w = true;
    }
}
