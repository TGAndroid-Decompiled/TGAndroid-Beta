package x2;

import java.util.Arrays;
public final class l1 implements b3.m {
    public final j2.m f60138a;
    public final j2.b0 f60139b;
    public byte[] f60140c;

    public l1(j2.h hVar, j2.m mVar) {
        u.f60236g.getAndIncrement();
        this.f60138a = mVar;
        this.f60139b = new j2.b0(hVar);
    }

    @Override
    public final void a() {
        j2.b0 b0Var = this.f60139b;
        b0Var.f17155b = 0L;
        try {
            b0Var.open(this.f60138a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) b0Var.f17155b;
                byte[] bArr = this.f60140c;
                if (bArr == null) {
                    this.f60140c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f60140c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f60140c;
                i7 = b0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.s0.a(b0Var);
        } catch (Throwable th2) {
            c8.s0.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void A() {
    }
}
