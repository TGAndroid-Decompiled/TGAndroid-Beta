package u2;

import java.util.Arrays;
import v7.n7;
public final class j1 implements y2.i {
    public final g2.m f43679a;
    public final g2.b0 f43680b;
    public byte[] f43681c;

    public j1(g2.h hVar, g2.m mVar) {
        t.f43768b.getAndIncrement();
        this.f43679a = mVar;
        this.f43680b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43680b;
        b0Var.f9333b = 0L;
        try {
            b0Var.open(this.f43679a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9333b;
                byte[] bArr = this.f43681c;
                if (bArr == null) {
                    this.f43681c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43681c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43681c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            n7.a(b0Var);
        } catch (Throwable th2) {
            n7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void D() {
    }
}
