package x2;

import java.util.Arrays;
public final class l1 implements b3.m {
    public final j2.m f60180a;
    public final j2.b0 f60181b;
    public byte[] f60182c;

    public l1(j2.h hVar, j2.m mVar) {
        u.f60278g.getAndIncrement();
        this.f60180a = mVar;
        this.f60181b = new j2.b0(hVar);
    }

    @Override
    public final void a() {
        j2.b0 b0Var = this.f60181b;
        b0Var.f17177b = 0L;
        try {
            b0Var.open(this.f60180a);
            int i7 = 0;
            while (i7 != -1) {
                int i10 = (int) b0Var.f17177b;
                byte[] bArr = this.f60182c;
                if (bArr == null) {
                    this.f60182c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f60182c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f60182c;
                i7 = b0Var.read(bArr2, i10, bArr2.length - i10);
            }
            c8.s0.a(b0Var);
        } catch (Throwable th2) {
            c8.s0.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final void A() {
    }
}
