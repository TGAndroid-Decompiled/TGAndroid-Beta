package z3;

import e2.d0;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.p;
import e9.x0;
import java.util.List;
import u2.l0;
public final class b implements d {
    public static final p f52362c = new p(new l0(26), x0.f8823b);
    public final i0 f52363a;
    public final long[] f52364b;

    public b(e9.a1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(e9.a1):void");
    }

    @Override
    public final int G() {
        return this.f52363a.size();
    }

    @Override
    public final int c(long j3) {
        int a2 = d0.a(this.f52364b, j3, false);
        if (a2 < this.f52363a.size()) {
            return a2;
        }
        return -1;
    }

    @Override
    public final long m(int i10) {
        boolean z10;
        if (i10 < this.f52363a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return this.f52364b[i10];
    }

    @Override
    public final List z(long j3) {
        int e7 = d0.e(this.f52364b, j3, false);
        if (e7 == -1) {
            g0 g0Var = i0.f8758b;
            return a1.f8721e;
        }
        return (i0) this.f52363a.get(e7);
    }
}
