package u2;

import java.util.Arrays;
import v7.n7;
public final class l1 implements y2.k {
    public final g2.m f42375a;
    public final g2.b0 f42376b;
    public byte[] f42377c;

    public l1(g2.h hVar, g2.m mVar) {
        u.f42455b.getAndIncrement();
        this.f42375a = mVar;
        this.f42376b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f42376b;
        b0Var.f8479b = 0L;
        try {
            b0Var.open(this.f42375a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f8479b;
                byte[] bArr = this.f42377c;
                if (bArr == null) {
                    this.f42377c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f42377c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f42377c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            n7.a(b0Var);
        } catch (Throwable th2) {
            n7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void k() {
    }
}
