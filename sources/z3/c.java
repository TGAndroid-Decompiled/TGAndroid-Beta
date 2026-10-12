package z3;

import e2.m0;
import e9.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.List;
import v7.u6;
public final class c implements e {
    public static final r f49255c = new r(new a(1), s1.f8615b);
    public final n0 f49256a;
    public final long[] f49257b;

    public c(e9.x1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.<init>(e9.x1):void");
    }

    @Override
    public final int c(long j10) {
        int b10 = m0.b(this.f49257b, j10, false);
        if (b10 < this.f49256a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long d(int i10) {
        boolean z10;
        if (i10 < this.f49256a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        return this.f49257b[i10];
    }

    @Override
    public final List f(long j10) {
        int f7 = m0.f(this.f49257b, j10, false);
        if (f7 == -1) {
            l0 l0Var = n0.f8592b;
            return x1.e;
        }
        return (n0) this.f49256a.get(f7);
    }

    @Override
    public final int j() {
        return this.f49256a.size();
    }
}
