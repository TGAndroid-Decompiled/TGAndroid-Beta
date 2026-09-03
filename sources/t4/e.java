package t4;

import j7.p7;
import java.util.Arrays;
public final class e extends q4.e {
    public byte[] f44542s;
    public volatile boolean v;
    public byte[] f44543w;

    @Override
    public final void a() {
        try {
            this.f42764r.open(this.f42760b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f44542s;
                if (bArr.length < i11 + 16384) {
                    this.f44542s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f42764r.read(this.f44542s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f44543w = Arrays.copyOf(this.f44542s, i11);
            }
            p7.a(this.f42764r);
        } catch (Throwable th2) {
            p7.a(this.f42764r);
            throw th2;
        }
    }

    @Override
    public final void b() {
        this.v = true;
    }
}
