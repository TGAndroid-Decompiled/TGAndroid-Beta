package r2;

import c8.t0;
import java.util.Arrays;
public final class d extends y2.f {
    public byte[] f56354s;
    public volatile boolean f56355w;
    public byte[] f56356x;

    @Override
    public final void A() {
        this.f56355w = true;
    }

    @Override
    public final void a() {
        try {
            this.f60697r.open(this.f60692b);
            int i7 = 0;
            int i10 = 0;
            while (i7 != -1 && !this.f56355w) {
                byte[] bArr = this.f56354s;
                if (bArr.length < i10 + 16384) {
                    this.f56354s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i7 = this.f60697r.read(this.f56354s, i10, 16384);
                if (i7 != -1) {
                    i10 += i7;
                }
            }
            if (!this.f56355w) {
                this.f56356x = Arrays.copyOf(this.f56354s, i10);
            }
            t0.a(this.f60697r);
        } catch (Throwable th2) {
            t0.a(this.f60697r);
            throw th2;
        }
    }
}
