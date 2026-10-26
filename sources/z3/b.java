package z3;

import a8.yb;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.n1;
import f9.s1;
import java.util.List;
public final class b implements d {
    public static final f9.n f52645c = new f9.n(new vg.d(15), n1.f10307b);
    public final i0 f52646a;
    public final long[] f52647b;

    public b(f9.s1 r19) {
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(f9.s1):void");
    }

    @Override
    public final int c(long j10) {
        int b10 = n0.b(this.f52647b, j10, false);
        if (b10 < this.f52646a.size()) {
            return b10;
        }
        return -1;
    }

    @Override
    public final long e(int i10) {
        boolean z10;
        if (i10 < this.f52646a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        return this.f52647b[i10];
    }

    @Override
    public final List g(long j10) {
        int f7 = n0.f(this.f52647b, j10, false);
        if (f7 == -1) {
            g0 g0Var = i0.f10287b;
            return s1.e;
        }
        return (i0) this.f52646a.get(f7);
    }

    @Override
    public final int k() {
        return this.f52646a.size();
    }
}
