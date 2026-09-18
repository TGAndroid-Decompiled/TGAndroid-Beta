package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.List;
import yf.q;
public final class b implements d {
    public static final p f48337c = new p(new q(4), x0.f8142b);
    public final i0 f48338a;
    public final long[] f48339b;

    public b(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.a1):void");
    }

    @Override
    public final int d(long j3) {
        int a2 = d0.a(this.f48339b, j3, false);
        if (a2 < this.f48338a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long g(int i10) {
        boolean z10;
        if (i10 < this.f48338a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f48339b[i10];
    }

    @Override
    public final List s(long j3) {
        int e = d0.e(this.f48339b, j3, false);
        if (e == -1) {
            g0 g0Var = i0.f8083b;
            return a1.e;
        }
        return (i0) this.f48338a.get(e);
    }

    @Override
    public final int v() {
        return this.f48338a.size();
    }
}
