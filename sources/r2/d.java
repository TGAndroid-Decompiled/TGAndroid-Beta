package r2;

import c8.s0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f56344s;
    public volatile boolean f56345w;
    public byte[] f56346x;

    @Override
    public final void A() {
        this.f56345w = true;
    }

    @Override
    public final void a() {
        try {
            this.f60686r.open(this.f60681b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f56345w) {
                byte[] bArr = this.f56344s;
                if (bArr.length < i10 + 16384) {
                    this.f56344s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f60686r.read(this.f56344s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f56345w) {
                this.f56346x = Arrays.copyOf(this.f56344s, i10);
            }
            s0.a(this.f60686r);
        } catch (Throwable th2) {
            s0.a(this.f60686r);
            throw th2;
        }
    }
}
