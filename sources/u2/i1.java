package u2;

import java.util.Arrays;
import v7.k7;
public final class i1 implements y2.i {
    public final g2.m f48711a;
    public final g2.b0 f48712b;
    public byte[] f48713c;

    public i1(g2.h hVar, g2.m mVar) {
        t.f48808b.getAndIncrement();
        this.f48711a = mVar;
        this.f48712b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f48712b;
        b0Var.f10233b = 0L;
        try {
            b0Var.open(this.f48711a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f10233b;
                byte[] bArr = this.f48713c;
                if (bArr == null) {
                    this.f48713c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f48713c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f48713c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            k7.a(b0Var);
        } catch (Throwable th2) {
            k7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void v() {
    }
}
