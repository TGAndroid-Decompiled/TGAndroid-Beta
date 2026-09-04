package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.List;
public final class b implements d {
    public static final p f50685c = new p(new t0.a(29), x0.f9022b);
    public final i0 f50686a;
    public final long[] f50687b;

    public b(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.a1):void");
    }

    @Override
    public final int d(long j3) {
        int a2 = d0.a(this.f50687b, j3, false);
        if (a2 < this.f50686a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long e(int i10) {
        boolean z10;
        if (i10 < this.f50686a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f50687b[i10];
    }

    @Override
    public final List h(long j3) {
        int e7 = d0.e(this.f50687b, j3, false);
        if (e7 == -1) {
            g0 g0Var = i0.f8957b;
            return a1.f8920e;
        }
        return (i0) this.f50686a.get(e7);
    }

    @Override
    public final int k() {
        return this.f50686a.size();
    }
}
