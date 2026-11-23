package r2;

import c8.t0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f56467s;
    public volatile boolean f56468w;
    public byte[] f56469x;

    @Override
    public final void a() {
        try {
            this.f60815r.open(this.f60810b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f56468w) {
                byte[] bArr = this.f56467s;
                if (bArr.length < i10 + 16384) {
                    this.f56467s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f60815r.read(this.f56467s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f56468w) {
                this.f56469x = Arrays.copyOf(this.f56467s, i10);
            }
            t0.a(this.f60815r);
        } catch (Throwable th2) {
            t0.a(this.f60815r);
            throw th2;
        }
    }

    @Override
    public final void y() {
        this.f56468w = true;
    }
}
