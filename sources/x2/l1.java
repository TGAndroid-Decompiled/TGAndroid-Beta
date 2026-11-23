package x2;

import java.util.Arrays;
public final class l1 implements b3.m {
    public final j2.m f60149a;
    public final j2.b0 f60150b;
    public byte[] f60151c;

    public l1(j2.h hVar, j2.m mVar) {
        u.f60247g.getAndIncrement();
        this.f60149a = mVar;
        this.f60150b = new j2.b0(hVar);
    }

    @Override
    public final void a() {
        j2.b0 b0Var = this.f60150b;
        b0Var.f17146b = 0L;
        try {
            b0Var.open(this.f60149a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) b0Var.f17146b;
                byte[] bArr = this.f60151c;
                if (bArr == null) {
                    this.f60151c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f60151c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f60151c;
                i7 = b0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.t0.a(b0Var);
        } catch (Throwable th2) {
            c8.t0.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void A() {
    }
}
