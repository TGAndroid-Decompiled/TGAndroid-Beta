package r2;

import c8.p0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f54288s;
    public volatile boolean f54289w;
    public byte[] f54290x;

    @Override
    public final void a() {
        try {
            this.f58900r.open(this.f58895b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54289w) {
                byte[] bArr = this.f54288s;
                if (bArr.length < i10 + 16384) {
                    this.f54288s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58900r.read(this.f54288s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54289w) {
                this.f54290x = Arrays.copyOf(this.f54288s, i10);
            }
            p0.a(this.f58900r);
        } catch (Throwable th2) {
            p0.a(this.f58900r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54289w = true;
    }
}
