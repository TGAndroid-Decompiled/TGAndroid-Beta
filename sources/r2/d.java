package r2;

import c8.s0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f56389s;
    public volatile boolean f56390w;
    public byte[] f56391x;

    @Override
    public final void A() {
        this.f56390w = true;
    }

    @Override
    public final void a() {
        try {
            this.f60732r.open(this.f60727b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f56390w) {
                byte[] bArr = this.f56389s;
                if (bArr.length < i10 + 16384) {
                    this.f56389s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f60732r.read(this.f56389s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f56390w) {
                this.f56391x = Arrays.copyOf(this.f56389s, i10);
            }
            s0.a(this.f60732r);
        } catch (Throwable th2) {
            s0.a(this.f60732r);
            throw th2;
        }
    }
}
