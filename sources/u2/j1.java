package u2;

import java.util.Arrays;
import v7.n7;
public final class j1 implements y2.i {
    public final g2.m f43681a;
    public final g2.b0 f43682b;
    public byte[] f43683c;

    public j1(g2.h hVar, g2.m mVar) {
        t.f43770b.getAndIncrement();
        this.f43681a = mVar;
        this.f43682b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43682b;
        b0Var.f9333b = 0L;
        try {
            b0Var.open(this.f43681a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9333b;
                byte[] bArr = this.f43683c;
                if (bArr == null) {
                    this.f43683c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43683c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43683c;
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
