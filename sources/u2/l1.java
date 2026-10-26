package u2;

import a8.hc;
import java.util.Arrays;
public final class l1 implements y2.i {
    public final g2.m f49346a;
    public final g2.b0 f49347b;
    public byte[] f49348c;

    public l1(g2.h hVar, g2.m mVar) {
        u.f49435g.getAndIncrement();
        this.f49346a = mVar;
        this.f49347b = new g2.b0(hVar);
    }

    @Override
    public final void b() {
        g2.b0 b0Var = this.f49347b;
        b0Var.f12230b = 0L;
        try {
            b0Var.open(this.f49346a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f12230b;
                byte[] bArr = this.f49348c;
                if (bArr == null) {
                    this.f49348c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f49348c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f49348c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            hc.a(b0Var);
        } catch (Throwable th2) {
            hc.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void f0() {
    }
}
