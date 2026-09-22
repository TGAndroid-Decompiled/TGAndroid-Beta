package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.x0;
import java.util.List;
public final class c implements e {
    public static final e9.p f48076c = new e9.p(new a(1), x0.f8140b);
    public final i0 f48077a;
    public final long[] f48078b;

    public c(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.c.<init>(e9.a1):void");
    }

    @Override
    public final int A() {
        return this.f48077a.size();
    }

    @Override
    public final int d(long j3) {
        int a2 = d0.a(this.f48078b, j3, false);
        if (a2 < this.f48077a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long g(int i10) {
        boolean z10;
        if (i10 < this.f48077a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f48078b[i10];
    }

    @Override
    public final List l(long j3) {
        int e = d0.e(this.f48078b, j3, false);
        if (e == -1) {
            g0 g0Var = i0.f8081b;
            return a1.e;
        }
        return (i0) this.f48077a.get(e);
    }
}
