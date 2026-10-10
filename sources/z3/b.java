package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.List;
public final class b implements d {
    public static final p f53535c = new p(new xa.b(9), x0.f8817b);
    public final i0 f53536a;
    public final long[] f53537b;

    public b(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.a1):void");
    }

    @Override
    public final int e(long j3) {
        int a2 = d0.a(this.f53537b, j3, false);
        if (a2 < this.f53536a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long l(int i10) {
        boolean z10;
        if (i10 < this.f53536a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f53537b[i10];
    }

    @Override
    public final List p(long j3) {
        int e7 = d0.e(this.f53537b, j3, false);
        if (e7 == -1) {
            g0 g0Var = i0.f8752b;
            return a1.f8715e;
        }
        return (i0) this.f53536a.get(e7);
    }

    @Override
    public final int w() {
        return this.f53536a.size();
    }
}
