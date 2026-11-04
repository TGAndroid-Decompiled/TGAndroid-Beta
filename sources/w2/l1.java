package w2;

import b8.uc;
import java.util.Arrays;
public final class l1 implements a3.m {
    public final i2.n f57132a;
    public final i2.c0 f57133b;
    public byte[] f57134c;

    public l1(i2.h hVar, i2.n nVar) {
        u.f57230g.getAndIncrement();
        this.f57132a = nVar;
        this.f57133b = new i2.c0(hVar);
    }

    @Override
    public final void a() {
        i2.c0 c0Var = this.f57133b;
        c0Var.f14528b = 0L;
        try {
            c0Var.open(this.f57132a);
            int i3 = 0;
            while (i3 != -1) {
                int i10 = (int) c0Var.f14528b;
                byte[] bArr = this.f57134c;
                if (bArr == null) {
                    this.f57134c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f57134c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f57134c;
                i3 = c0Var.read(bArr2, i10, bArr2.length - i10);
            }
            uc.a(c0Var);
        } catch (Throwable th2) {
            uc.a(c0Var);
            throw th2;
        }
    }

    @Override
    public final void X1() {
    }
}
