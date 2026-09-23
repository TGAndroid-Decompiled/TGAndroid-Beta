package u2;

import java.util.Arrays;
import v7.m7;
public final class i1 implements y2.j {
    public final g2.m f43322a;
    public final g2.b0 f43323b;
    public byte[] f43324c;

    public i1(g2.h hVar, g2.m mVar) {
        t.f43412b.getAndIncrement();
        this.f43322a = mVar;
        this.f43323b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43323b;
        b0Var.f9334b = 0L;
        try {
            b0Var.open(this.f43322a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9334b;
                byte[] bArr = this.f43324c;
                if (bArr == null) {
                    this.f43324c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43324c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43324c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            m7.a(b0Var);
        } catch (Throwable th2) {
            m7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void H() {
    }
}
