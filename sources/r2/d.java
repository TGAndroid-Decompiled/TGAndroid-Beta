package r2;

import c8.q0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f55769s;
    public volatile boolean f55770w;
    public byte[] f55771x;

    @Override
    public final void D() {
        this.f55770w = true;
    }

    @Override
    public final void a() {
        try {
            this.f60121r.open(this.f60116b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f55770w) {
                byte[] bArr = this.f55769s;
                if (bArr.length < i10 + 16384) {
                    this.f55769s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f60121r.read(this.f55769s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f55770w) {
                this.f55771x = Arrays.copyOf(this.f55769s, i10);
            }
            q0.a(this.f60121r);
        } catch (Throwable th2) {
            q0.a(this.f60121r);
            throw th2;
        }
    }
}
