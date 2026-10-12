package u2;

import java.util.Arrays;
import v7.k7;
public final class l1 implements y2.i {
    public final g2.m f45967a;
    public final g2.b0 f45968b;
    public byte[] f45969c;

    public l1(g2.h hVar, g2.m mVar) {
        u.f46053g.getAndIncrement();
        this.f45967a = mVar;
        this.f45968b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f45968b;
        b0Var.f9855b = 0L;
        try {
            b0Var.open(this.f45967a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9855b;
                byte[] bArr = this.f45969c;
                if (bArr == null) {
                    this.f45969c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f45969c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f45969c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            k7.a(b0Var);
        } catch (Throwable th2) {
            k7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void J() {
    }
}
