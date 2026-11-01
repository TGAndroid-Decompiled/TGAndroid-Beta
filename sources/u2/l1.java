package u2;

import java.util.Arrays;
import v7.l7;
public final class l1 implements y2.i {
    public final g2.n f49938a;
    public final g2.c0 f49939b;
    public byte[] f49940c;

    public l1(g2.h hVar, g2.n nVar) {
        u.f50028g.getAndIncrement();
        this.f49938a = nVar;
        this.f49939b = new g2.c0(hVar);
    }

    @Override
    public final void b() {
        g2.c0 c0Var = this.f49939b;
        c0Var.f7284b = 0L;
        try {
            c0Var.open(this.f49938a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) c0Var.f7284b;
                byte[] bArr = this.f49940c;
                if (bArr == null) {
                    this.f49940c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f49940c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f49940c;
                i10 = c0Var.read(bArr2, i11, bArr2.length - i11);
            }
            l7.a(c0Var);
        } catch (Throwable th2) {
            l7.a(c0Var);
            throw th2;
        }
    }

    @Override
    public final void R1() {
    }
}
