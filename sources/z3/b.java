package z3;

import e2.m0;
import e9.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.List;
import v7.u6;
public final class b implements d {
    public static final r f50644c = new r(new ya.b(5), s1.f8497b);
    public final n0 f50645a;
    public final long[] f50646b;

    public b(e9.x1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.x1):void");
    }

    @Override
    public final int d(long j10) {
        int b10 = m0.b(this.f50646b, j10, false);
        if (b10 < this.f50645a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long k(int i10) {
        boolean z10;
        if (i10 < this.f50645a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        return this.f50646b[i10];
    }

    @Override
    public final List s(long j10) {
        int f7 = m0.f(this.f50646b, j10, false);
        if (f7 == -1) {
            l0 l0Var = n0.f8474b;
            return x1.e;
        }
        return (n0) this.f50645a.get(f7);
    }

    @Override
    public final int u() {
        return this.f50645a.size();
    }
}
