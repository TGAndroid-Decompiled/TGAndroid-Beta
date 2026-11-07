package x2;

import java.util.Arrays;
public final class k1 implements b3.l {
    public final j2.m f58284a;
    public final j2.c0 f58285b;
    public byte[] f58286c;

    public k1(j2.h hVar, j2.m mVar) {
        u.f58386g.getAndIncrement();
        this.f58284a = mVar;
        this.f58285b = new j2.c0(hVar);
    }

    @Override
    public final void a() {
        j2.c0 c0Var = this.f58285b;
        c0Var.f16413b = 0L;
        try {
            c0Var.open(this.f58284a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) c0Var.f16413b;
                byte[] bArr = this.f58286c;
                if (bArr == null) {
                    this.f58286c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f58286c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f58286c;
                i7 = c0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.p0.a(c0Var);
        } catch (Throwable th2) {
            c8.p0.a(c0Var);
            throw th2;
        }
    }

    @Override
    public final void q0() {
    }
}
