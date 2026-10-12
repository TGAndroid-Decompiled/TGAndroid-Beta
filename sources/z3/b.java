package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.List;
import w9.w;
public final class b implements d {
    public static final p f53715c = new p(new w(11), x0.f8814b);
    public final i0 f53716a;
    public final long[] f53717b;

    public b(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.a1):void");
    }

    @Override
    public final int B() {
        return this.f53716a.size();
    }

    @Override
    public final int d(long j3) {
        int a2 = d0.a(this.f53717b, j3, false);
        if (a2 < this.f53716a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long m(int i10) {
        boolean z10;
        if (i10 < this.f53716a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f53717b[i10];
    }

    @Override
    public final List v(long j3) {
        int e7 = d0.e(this.f53717b, j3, false);
        if (e7 == -1) {
            g0 g0Var = i0.f8749b;
            return a1.f8712e;
        }
        return (i0) this.f53716a.get(e7);
    }
}
