package r2;

import c8.p0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f54301s;
    public volatile boolean f54302w;
    public byte[] f54303x;

    @Override
    public final void a() {
        try {
            this.f58910r.open(this.f58905b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54302w) {
                byte[] bArr = this.f54301s;
                if (bArr.length < i10 + 16384) {
                    this.f54301s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58910r.read(this.f54301s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54302w) {
                this.f54303x = Arrays.copyOf(this.f54301s, i10);
            }
            p0.a(this.f58910r);
        } catch (Throwable th2) {
            p0.a(this.f58910r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54302w = true;
    }
}
