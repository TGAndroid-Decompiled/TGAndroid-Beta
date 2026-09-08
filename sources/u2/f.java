package u2;
public final class f extends r {
    public final long f46692f;
    public final long f46693g;
    public final long h;
    public final boolean f46694i;

    public f(b2.k1 k1Var, long j3, long j10, boolean z10) {
        super(k1Var);
        long max;
        long j11;
        int i10 = (j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1));
        if (i10 != 0 && j10 < j3) {
            throw new g(2, j3, j10);
        }
        boolean z11 = false;
        if (k1Var.h() == 1) {
            b2.j1 m10 = k1Var.m(0, new b2.j1(), 0L);
            long max2 = Math.max(0L, j3);
            if (!z10 && !m10.f2141k && max2 != 0 && !m10.h) {
                throw new g(1);
            }
            if (i10 == 0) {
                max = m10.f2143m;
            } else {
                max = Math.max(0L, j10);
            }
            long j12 = m10.f2143m;
            if (j12 != -9223372036854775807L) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f46692f = max2;
            this.f46693g = max;
            int i11 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            if (i11 == 0) {
                j11 = -9223372036854775807L;
            } else {
                j11 = max - max2;
            }
            this.h = j11;
            if (m10.f2139i && (i11 == 0 || (j12 != -9223372036854775807L && max == j12))) {
                z11 = true;
            }
            this.f46694i = z11;
            return;
        }
        throw new g(0);
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.f46815e.f(0, h1Var, z10);
        long j3 = h1Var.f2084e - this.f46692f;
        long j10 = this.h;
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            j11 = j10 - j3;
        }
        h1Var.h(h1Var.f2081a, h1Var.f2082b, 0, j11, j3, b2.b.f1993c, false);
        return h1Var;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.f46815e.m(0, j1Var, 0L);
        long j10 = j1Var.f2146p;
        long j11 = this.f46692f;
        j1Var.f2146p = j10 + j11;
        j1Var.f2143m = this.h;
        j1Var.f2139i = this.f46694i;
        long j12 = j1Var.f2142l;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            j1Var.f2142l = max;
            long j13 = this.f46693g;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            j1Var.f2142l = max - j11;
        }
        long e02 = e2.d0.e0(j11);
        long j14 = j1Var.f2136e;
        if (j14 != -9223372036854775807L) {
            j1Var.f2136e = j14 + e02;
        }
        long j15 = j1Var.f2137f;
        if (j15 != -9223372036854775807L) {
            j1Var.f2137f = j15 + e02;
        }
        return j1Var;
    }
}
