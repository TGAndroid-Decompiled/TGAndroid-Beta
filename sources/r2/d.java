package r2;

import c8.p0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f54300s;
    public volatile boolean f54301w;
    public byte[] f54302x;

    @Override
    public final void a() {
        try {
            this.f58908r.open(this.f58903b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f54301w) {
                byte[] bArr = this.f54300s;
                if (bArr.length < i10 + 16384) {
                    this.f54300s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f58908r.read(this.f54300s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f54301w) {
                this.f54302x = Arrays.copyOf(this.f54300s, i10);
            }
            p0.a(this.f58908r);
        } catch (Throwable th2) {
            p0.a(this.f58908r);
            throw th2;
        }
    }

    @Override
    public final void q0() {
        this.f54301w = true;
    }
}
