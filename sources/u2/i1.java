package u2;

import java.util.Arrays;
import v7.k7;
public final class i1 implements y2.i {
    public final g2.m f48677a;
    public final g2.b0 f48678b;
    public byte[] f48679c;

    public i1(g2.h hVar, g2.m mVar) {
        t.f48774b.getAndIncrement();
        this.f48677a = mVar;
        this.f48678b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f48678b;
        b0Var.f10233b = 0L;
        try {
            b0Var.open(this.f48677a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f10233b;
                byte[] bArr = this.f48679c;
                if (bArr == null) {
                    this.f48679c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f48679c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f48679c;
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
