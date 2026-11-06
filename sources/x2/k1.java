package x2;

import java.util.Arrays;
public final class k1 implements b3.l {
    public final j2.m f58278a;
    public final j2.c0 f58279b;
    public byte[] f58280c;

    public k1(j2.h hVar, j2.m mVar) {
        u.f58380g.getAndIncrement();
        this.f58278a = mVar;
        this.f58279b = new j2.c0(hVar);
    }

    @Override
    public final void a() {
        j2.c0 c0Var = this.f58279b;
        c0Var.f16413b = 0L;
        try {
            c0Var.open(this.f58278a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) c0Var.f16413b;
                byte[] bArr = this.f58280c;
                if (bArr == null) {
                    this.f58280c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f58280c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f58280c;
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
