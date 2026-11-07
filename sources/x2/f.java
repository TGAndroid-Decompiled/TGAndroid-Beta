package x2;
public final class f extends s {
    public final long f58234f;
    public final long f58235g;
    public final long h;
    public final boolean f58236i;

    public f(e2.l1 l1Var, long j3, long j10, boolean z9) {
        super(l1Var);
        long max;
        int i7 = (j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1));
        if (i7 != 0 && j10 < j3) {
            throw new g(j3, 2, j10);
        }
        boolean z10 = false;
        if (l1Var.h() == 1) {
            e2.k1 m10 = l1Var.m(0, new e2.k1(), 0L);
            long max2 = Math.max(0L, j3);
            if (!z9 && !m10.f10332k && max2 != 0 && !m10.h) {
                throw new g(1);
            }
            if (i7 == 0) {
                max = m10.f10334m;
            } else {
                max = Math.max(0L, j10);
            }
            long j11 = m10.f10334m;
            int i10 = (j11 > (-9223372036854775807L) ? 1 : (j11 == (-9223372036854775807L) ? 0 : -1));
            if (i10 != 0) {
                max = max > j11 ? j11 : max;
                if (max2 > max) {
                    max2 = max;
                }
            }
            this.f58234f = max2;
            this.f58235g = max;
            int i11 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.h = i11 != 0 ? max - max2 : -9223372036854775807L;
            if (m10.f10330i && (i11 == 0 || (i10 != 0 && max == j11))) {
                z10 = true;
            }
            this.f58236i = z10;
            return;
        }
        throw new g(0);
    }

    @Override
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z9) {
        this.f58366e.f(0, i1Var, z9);
        long j3 = i1Var.f10283e - this.f58234f;
        long j10 = this.h;
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            j11 = j10 - j3;
        }
        i1Var.h(i1Var.f10280a, i1Var.f10281b, 0, j11, j3, e2.c.f10190c, false);
        return i1Var;
    }

    @Override
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        this.f58366e.m(0, k1Var, 0L);
        long j10 = k1Var.f10337p;
        long j11 = this.f58234f;
        k1Var.f10337p = j10 + j11;
        k1Var.f10334m = this.h;
        k1Var.f10330i = this.f58236i;
        long j12 = k1Var.f10333l;
        if (j12 != -9223372036854775807L) {
            long max = Math.max(j12, j11);
            k1Var.f10333l = max;
            long j13 = this.f58235g;
            if (j13 != -9223372036854775807L) {
                max = Math.min(max, j13);
            }
            k1Var.f10333l = max - j11;
        }
        long h02 = h2.m0.h0(j11);
        long j14 = k1Var.f10327e;
        if (j14 != -9223372036854775807L) {
            k1Var.f10327e = j14 + h02;
        }
        long j15 = k1Var.f10328f;
        if (j15 != -9223372036854775807L) {
            k1Var.f10328f = j15 + h02;
        }
        return k1Var;
    }
}
