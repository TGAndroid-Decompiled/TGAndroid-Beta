package u2;

import java.util.Arrays;
import v7.k7;
public final class m1 implements y2.i {
    public final g2.m f47369a;
    public final g2.b0 f47370b;
    public byte[] f47371c;

    public m1(g2.h hVar, g2.m mVar) {
        u.f47443g.getAndIncrement();
        this.f47369a = mVar;
        this.f47370b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f47370b;
        b0Var.f10763b = 0L;
        try {
            b0Var.open(this.f47369a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f10763b;
                byte[] bArr = this.f47371c;
                if (bArr == null) {
                    this.f47371c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f47371c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f47371c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            k7.a(b0Var);
        } catch (Throwable th2) {
            k7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void O() {
    }
}
