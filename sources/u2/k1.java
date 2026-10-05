package u2;

import java.util.Arrays;
import v7.m7;
public final class k1 implements y2.i {
    public final g2.m f47320a;
    public final g2.b0 f47321b;
    public byte[] f47322c;

    public k1(g2.h hVar, g2.m mVar) {
        t.f47408b.getAndIncrement();
        this.f47320a = mVar;
        this.f47321b = new g2.b0(hVar);
    }

    @Override
    public final void a() {
        g2.b0 b0Var = this.f47321b;
        b0Var.f10161b = 0L;
        try {
            b0Var.open(this.f47320a);
            int i10 = 0;
            while (i10 != -1) {
                int i11 = (int) b0Var.f10161b;
                byte[] bArr = this.f47322c;
                if (bArr == null) {
                    this.f47322c = new byte[1024];
                } else if (i11 == bArr.length) {
                    this.f47322c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f47322c;
                i10 = b0Var.read(bArr2, i11, bArr2.length - i11);
            }
            m7.a(b0Var);
        } catch (Throwable th2) {
            m7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void q() {
    }
}
