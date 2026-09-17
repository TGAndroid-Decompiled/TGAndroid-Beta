package u2;

import java.util.Arrays;
import v7.m7;
public final class j1 implements y2.j {
    public final g2.m f43422a;
    public final g2.b0 f43423b;
    public byte[] f43424c;

    public j1(g2.h hVar, g2.m mVar) {
        t.f43507b.getAndIncrement();
        this.f43422a = mVar;
        this.f43423b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43423b;
        b0Var.f9351b = 0L;
        try {
            b0Var.open(this.f43422a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9351b;
                byte[] bArr = this.f43424c;
                if (bArr == null) {
                    this.f43424c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43424c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43424c;
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
