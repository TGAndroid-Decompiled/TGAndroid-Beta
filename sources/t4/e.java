package t4;

import j7.p7;
import java.util.Arrays;
public final class e extends q4.e {
    public byte[] f44480s;
    public volatile boolean v;
    public byte[] f44481w;

    @Override
    public final void a() {
        try {
            this.f42734r.open(this.f42730b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f44480s;
                if (bArr.length < i11 + 16384) {
                    this.f44480s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f42734r.read(this.f44480s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f44481w = Arrays.copyOf(this.f44480s, i11);
            }
            p7.a(this.f42734r);
        } catch (Throwable th2) {
            p7.a(this.f42734r);
            throw th2;
        }
    }

    @Override
    public final void r() {
        this.v = true;
    }
}
