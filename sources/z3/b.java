package z3;

import e2.l0;
import e9.n0;
import e9.r;
import e9.s1;
import e9.x1;
import java.util.List;
import v7.t6;
public final class b implements d {
    public static final r f54573c = new r(new xg.a(27), s1.f6413b);
    public final n0 f54574a;
    public final long[] f54575b;

    public b(e9.x1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.x1):void");
    }

    @Override
    public final int a(long j10) {
        int b10 = l0.b(this.f54575b, j10, false);
        if (b10 < this.f54574a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long g(int i10) {
        boolean z10;
        if (i10 < this.f54574a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        return this.f54575b[i10];
    }

    @Override
    public final List p(long j10) {
        int f7 = l0.f(this.f54575b, j10, false);
        if (f7 == -1) {
            e9.l0 l0Var = n0.f6390b;
            return x1.e;
        }
        return (n0) this.f54574a.get(f7);
    }

    @Override
    public final int s() {
        return this.f54574a.size();
    }
}
