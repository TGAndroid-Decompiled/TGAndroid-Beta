package w2;
public final class f extends s {
    public final long f57078f;
    public final long f57079g;
    public final long h;
    public final boolean f57080i;

    public f(d2.n1 n1Var, long j10, long j11, boolean z10) {
        super(n1Var);
        long max;
        int i3 = (j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1));
        if (i3 != 0 && j11 < j10) {
            throw new g(j10, 2, j11);
        }
        boolean z11 = false;
        if (n1Var.h() == 1) {
            d2.m1 m10 = n1Var.m(0, new d2.m1(), 0L);
            long max2 = Math.max(0L, j10);
            if (!z10 && !m10.f8216k && max2 != 0 && !m10.h) {
                throw new g(1);
            }
            if (i3 == 0) {
                max = m10.f8218m;
            } else {
                max = Math.max(0L, j11);
            }
            long j12 = m10.f8218m;
            int i10 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            if (i10 != 0) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f57078f = max2;
            this.f57079g = max;
            int i11 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.h = i11 != 0 ? max - max2 : -9223372036854775807L;
            if (m10.f8214i && (i11 == 0 || (i10 != 0 && max == j12))) {
                z11 = true;
            }
            this.f57080i = z11;
            return;
        }
        throw new g(0);
    }

    @Override
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        this.f57209e.f(0, k1Var, z10);
        long j10 = k1Var.f8164e - this.f57078f;
        long j11 = this.h;
        long j12 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
            j12 = j11 - j10;
        }
        k1Var.h(k1Var.f8161a, k1Var.f8162b, 0, j12, j10, d2.c.f8039c, false);
        return k1Var;
    }

    @Override
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        this.f57209e.m(0, m1Var, 0L);
        long j11 = m1Var.f8221p;
        long j12 = this.f57078f;
        m1Var.f8221p = j11 + j12;
        m1Var.f8218m = this.h;
        m1Var.f8214i = this.f57080i;
        long j13 = m1Var.f8217l;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            m1Var.f8217l = max;
            long j14 = this.f57079g;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            m1Var.f8217l = max - j12;
        }
        long h02 = g2.n0.h0(j12);
        long j15 = m1Var.f8211e;
        if (j15 != -9223372036854775807L) {
            m1Var.f8211e = j15 + h02;
        }
        long j16 = m1Var.f8212f;
        if (j16 != -9223372036854775807L) {
            m1Var.f8212f = j16 + h02;
        }
        return m1Var;
    }
}
