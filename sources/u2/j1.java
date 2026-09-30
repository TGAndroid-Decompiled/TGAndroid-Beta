package u2;

import java.util.Arrays;
import v7.n7;
public final class j1 implements y2.i {
    public final g2.m f43788a;
    public final g2.b0 f43789b;
    public byte[] f43790c;

    public j1(g2.h hVar, g2.m mVar) {
        t.f43877b.getAndIncrement();
        this.f43788a = mVar;
        this.f43789b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43789b;
        b0Var.f9345b = 0L;
        try {
            b0Var.open(this.f43788a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9345b;
                byte[] bArr = this.f43790c;
                if (bArr == null) {
                    this.f43790c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43790c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43790c;
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
