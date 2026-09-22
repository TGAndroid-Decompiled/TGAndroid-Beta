package u2;

import java.util.Arrays;
import v7.n7;
public final class k1 implements y2.j {
    public final g2.m f43725a;
    public final g2.b0 f43726b;
    public byte[] f43727c;

    public k1(g2.h hVar, g2.m mVar) {
        t.f43805b.getAndIncrement();
        this.f43725a = mVar;
        this.f43726b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f43726b;
        b0Var.f9351b = 0L;
        try {
            b0Var.open(this.f43725a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f9351b;
                byte[] bArr = this.f43727c;
                if (bArr == null) {
                    this.f43727c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f43727c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f43727c;
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
