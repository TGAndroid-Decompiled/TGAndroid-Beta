package u2;
public final class g extends s {
    public final long f45917f;
    public final long f45918g;
    public final long h;
    public final boolean f45919i;

    public g(b2.p1 p1Var, long j10, long j11, boolean z10) {
        super(p1Var);
        long max;
        int i10 = (j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1));
        if (i10 != 0 && j11 < j10) {
            throw new h(2, j10, j11);
        }
        boolean z11 = false;
        if (p1Var.h() == 1) {
            b2.o1 m10 = p1Var.m(0, new b2.o1(), 0L);
            long max2 = Math.max(0L, j10);
            if (!z10 && !m10.f2265k && max2 != 0 && !m10.h) {
                throw new h(1);
            }
            if (i10 == 0) {
                max = m10.f2267m;
            } else {
                max = Math.max(0L, j11);
            }
            long j12 = m10.f2267m;
            int i11 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            if (i11 != 0) {
                max = max > j12 ? j12 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f45917f = max2;
            this.f45918g = max;
            int i12 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.h = i12 != 0 ? max - max2 : -9223372036854775807L;
            if (m10.f2263i && (i12 == 0 || (i11 != 0 && max == j12))) {
                z11 = true;
            }
            this.f45919i = z11;
            return;
        }
        throw new h(0);
    }

    @Override
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        this.e.f(0, m1Var, z10);
        long j10 = m1Var.e - this.f45917f;
        long j11 = this.h;
        long j12 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
            j12 = j11 - j10;
        }
        m1Var.h(m1Var.f2211a, m1Var.f2212b, 0, j12, j10, b2.c.f2086c, false);
        return m1Var;
    }

    @Override
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        this.e.m(0, o1Var, 0L);
        long j11 = o1Var.f2270p;
        long j12 = this.f45917f;
        o1Var.f2270p = j11 + j12;
        o1Var.f2267m = this.h;
        o1Var.f2263i = this.f45919i;
        long j13 = o1Var.f2266l;
        if (j13 != -9223372036854775807L) {
            long max = Math.max(j13, j12);
            o1Var.f2266l = max;
            long j14 = this.f45918g;
            if (j14 != -9223372036854775807L) {
                max = Math.min(max, j14);
            }
            o1Var.f2266l = max - j12;
        }
        long h02 = e2.m0.h0(j12);
        long j15 = o1Var.e;
        if (j15 != -9223372036854775807L) {
            o1Var.e = j15 + h02;
        }
        long j16 = o1Var.f2261f;
        if (j16 != -9223372036854775807L) {
            o1Var.f2261f = j16 + h02;
        }
        return o1Var;
    }
}
