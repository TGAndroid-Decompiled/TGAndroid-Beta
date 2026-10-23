package u2;
public final class g extends t {
    public final long f47764f;
    public final long f47765g;
    public final long h;
    public final boolean f47766i;

    public g(b2.o1 o1Var, long j10, long j11, boolean z10) {
        super(o1Var);
        long max;
        int i10 = (j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1));
        if (i10 != 0 && j11 < j10) {
            throw new h(2, j10, j11);
        }
        boolean z11 = false;
        if (o1Var.h() == 1) {
            b2.n1 m10 = o1Var.m(0, new b2.n1(), 0L);
            long max2 = Math.max(0L, j10);
            if (!z10 && !m10.f3881k && max2 != 0 && !m10.h) {
                throw new h(1);
            }
            if (i10 == 0) {
                max = m10.f3883m;
            } else {
                max = Math.max(0L, j11);
            }
            long j12 = m10.f3883m;
            int i11 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            if (i11 != 0) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f47764f = max2;
            this.f47765g = max;
            int i12 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.h = i12 != 0 ? max - max2 : -9223372036854775807L;
            if (m10.f3879i && (i12 == 0 || (i11 != 0 && max == j12))) {
                z11 = true;
            }
            this.f47766i = z11;
            return;
        }
        throw new h(0);
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        this.e.f(0, l1Var, z10);
        long j10 = l1Var.e - this.f47764f;
        long j11 = this.h;
        long j12 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
            j12 = j11 - j10;
        }
        l1Var.h(l1Var.f3827a, l1Var.f3828b, 0, j12, j10, b2.c.f3708c, false);
        return l1Var;
    }

    @Override
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        this.e.m(0, n1Var, 0L);
        long j11 = n1Var.f3886p;
        long j12 = this.f47764f;
        n1Var.f3886p = j11 + j12;
        n1Var.f3883m = this.h;
        n1Var.f3879i = this.f47766i;
        long j13 = n1Var.f3882l;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            n1Var.f3882l = max;
            long j14 = this.f47765g;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            n1Var.f3882l = max - j12;
        }
        long h02 = e2.m0.h0(j12);
        long j15 = n1Var.e;
        if (j15 != -9223372036854775807L) {
            n1Var.e = j15 + h02;
        }
        long j16 = n1Var.f3877f;
        if (j16 != -9223372036854775807L) {
            n1Var.f3877f = j16 + h02;
        }
        return n1Var;
    }
}
