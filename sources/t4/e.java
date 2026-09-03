package t4;

import j7.q7;
import java.util.Arrays;
public final class e extends q4.e {
    public byte[] f47918s;
    public volatile boolean v;
    public byte[] f47919w;

    @Override
    public final void a() {
        try {
            this.f44510r.open(this.f44505b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f47918s;
                if (bArr.length < i11 + 16384) {
                    this.f47918s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f44510r.read(this.f47918s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f47919w = Arrays.copyOf(this.f47918s, i11);
            }
            q7.a(this.f44510r);
        } catch (Throwable th2) {
            q7.a(this.f44510r);
            throw th2;
        }
    }

    @Override
    public final void l() {
        this.v = true;
    }
}
