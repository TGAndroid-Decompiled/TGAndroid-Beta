package u2;

import java.util.Arrays;
import v7.n7;
public final class j1 implements y2.i {
    public final g2.m f43726a;
    public final g2.b0 f43727b;
    public byte[] f43728c;

    public j1(g2.h hVar, g2.m mVar) {
        t.f43813b.getAndIncrement();
        this.f43726a = mVar;
        this.f43727b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43727b;
        b0Var.f9338b = 0L;
        try {
            b0Var.open(this.f43726a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9338b;
                byte[] bArr = this.f43728c;
                if (bArr == null) {
                    this.f43728c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43728c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43728c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            n7.a(b0Var);
        } catch (Throwable th2) {
            n7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void q() {
    }
}
