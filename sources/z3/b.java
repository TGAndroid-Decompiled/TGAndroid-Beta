package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.List;
import yh.a2;
public final class b implements d {
    public static final p f48083c = new p(new a2(2), x0.f8138b);
    public final i0 f48084a;
    public final long[] f48085b;

    public b(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.a1):void");
    }

    @Override
    public final int A() {
        return this.f48084a.size();
    }

    @Override
    public final int d(long j3) {
        int a2 = d0.a(this.f48085b, j3, false);
        if (a2 < this.f48084a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long g(int i10) {
        boolean z10;
        if (i10 < this.f48084a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f48085b[i10];
    }

    @Override
    public final List l(long j3) {
        int e = d0.e(this.f48085b, j3, false);
        if (e == -1) {
            g0 g0Var = i0.f8079b;
            return a1.e;
        }
        return (i0) this.f48084a.get(e);
    }
}
