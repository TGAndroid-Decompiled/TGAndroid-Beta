package u2;

import a8.hc;
import java.util.Arrays;
public final class l1 implements y2.i {
    public final g2.m f49381a;
    public final g2.b0 f49382b;
    public byte[] f49383c;

    public l1(g2.h hVar, g2.m mVar) {
        u.f49470g.getAndIncrement();
        this.f49381a = mVar;
        this.f49382b = new g2.b0(hVar);
    }

    @Override
    public final void b() {
        g2.b0 b0Var = this.f49382b;
        b0Var.f12229b = 0L;
        try {
            b0Var.open(this.f49381a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f12229b;
                byte[] bArr = this.f49383c;
                if (bArr == null) {
                    this.f49383c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f49383c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f49383c;
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
