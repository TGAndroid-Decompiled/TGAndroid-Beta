package u2;

import java.util.Arrays;
import v7.k7;
public final class j1 implements y2.i {
    public final g2.m f48611a;
    public final g2.b0 f48612b;
    public byte[] f48613c;

    public j1(g2.h hVar, g2.m mVar) {
        t.f48706b.getAndIncrement();
        this.f48611a = mVar;
        this.f48612b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f48612b;
        b0Var.f10234b = 0L;
        try {
            b0Var.open(this.f48611a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f10234b;
                byte[] bArr = this.f48613c;
                if (bArr == null) {
                    this.f48613c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f48613c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f48613c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            k7.a(b0Var);
        } catch (Throwable th2) {
            k7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void v() {
    }
}
