package x2;

import java.util.Arrays;
public final class j1 implements b3.l {
    public final j2.m f59564a;
    public final j2.b0 f59565b;
    public byte[] f59566c;

    public j1(j2.h hVar, j2.m mVar) {
        t.f59664g.getAndIncrement();
        this.f59564a = mVar;
        this.f59565b = new j2.b0(hVar);
    }

    @Override
    public final void a() {
        j2.b0 b0Var = this.f59565b;
        b0Var.f16770b = 0L;
        try {
            b0Var.open(this.f59564a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) b0Var.f16770b;
                byte[] bArr = this.f59566c;
                if (bArr == null) {
                    this.f59566c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f59566c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f59566c;
                i7 = b0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.q0.a(b0Var);
        } catch (Throwable th2) {
            c8.q0.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void D() {
    }
}
