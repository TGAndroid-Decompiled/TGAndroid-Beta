package u2;
public final class f extends r {
    public final long f43354f;
    public final long f43355g;
    public final long h;
    public final boolean f43356i;

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
            if (!z10 && !m10.f3060k && max2 != 0 && !m10.h) {
                throw new g(1);
            }
            if (i10 == 0) {
                max = m10.f3062m;
            } else {
                max = Math.max(0L, j10);
            }
            long j12 = m10.f3062m;
            if (j12 != -9223372036854775807L) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f43354f = max2;
            this.f43355g = max;
            int i11 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            if (i11 == 0) {
                j11 = -9223372036854775807L;
            } else {
                j11 = max - max2;
            }
            this.h = j11;
            if (m10.f3058i && (i11 == 0 || (j12 != -9223372036854775807L && max == j12))) {
                z11 = true;
            }
            this.f43356i = z11;
            return;
        }
        throw new g(0);
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        this.e.f(0, h1Var, z10);
        long j3 = h1Var.e - this.f43354f;
        long j10 = this.h;
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            j11 = j10 - j3;
        }
        h1Var.h(h1Var.f3007a, h1Var.f3008b, 0, j11, j3, b2.b.f2930c, false);
        return h1Var;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        this.e.m(0, j1Var, 0L);
        long j10 = j1Var.f3065p;
        long j11 = this.f43354f;
        j1Var.f3065p = j10 + j11;
        j1Var.f3062m = this.h;
        j1Var.f3058i = this.f43356i;
        long j12 = j1Var.f3061l;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            j1Var.f3061l = max;
            long j13 = this.f43355g;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            j1Var.f3061l = max - j11;
        }
        long e02 = e2.d0.e0(j11);
        long j14 = j1Var.e;
        if (j14 != -9223372036854775807L) {
            j1Var.e = j14 + e02;
        }
        long j15 = j1Var.f3056f;
        if (j15 != -9223372036854775807L) {
            j1Var.f3056f = j15 + e02;
        }
        return j1Var;
    }
}
