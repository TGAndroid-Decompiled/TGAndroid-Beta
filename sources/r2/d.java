package r2;

import c8.s0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f56385s;
    public volatile boolean f56386w;
    public byte[] f56387x;

    @Override
    public final void A() {
        this.f56386w = true;
    }

    @Override
    public final void a() {
        try {
            this.f60728r.open(this.f60723b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f56386w) {
                byte[] bArr = this.f56385s;
                if (bArr.length < i10 + 16384) {
                    this.f56385s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f60728r.read(this.f56385s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f56386w) {
                this.f56387x = Arrays.copyOf(this.f56385s, i10);
            }
            s0.a(this.f60728r);
        } catch (Throwable th2) {
            s0.a(this.f60728r);
            throw th2;
        }
    }
}
