package u2;
public final class e implements e0, d0 {
    public final e0 f47314a;
    public d0 f47315b;
    public d[] f47316c = new d[0];
    public long d;
    public long e;
    public long f47317f;
    public long h;
    public h f47318n;

    public e(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f47314a = e0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f47317f = j10;
        this.h = j11;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return this.f47314a.c();
    }

    @Override
    public final long d() {
        long d = this.f47314a.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void g() {
        h hVar = this.f47318n;
        if (hVar == null) {
            this.f47314a.g();
            return;
        }
        throw hVar;
    }

    @Override
    public final void h(e0 e0Var) {
        if (this.f47318n != null) {
            return;
        }
        d0 d0Var = this.f47315b;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        d[] dVarArr;
        this.d = -9223372036854775807L;
        for (d dVar : this.f47316c) {
            if (dVar != null) {
                dVar.f47312b = false;
            }
        }
        long i10 = this.f47314a.i(j10);
        long j11 = this.f47317f;
        long j12 = this.h;
        long max = Math.max(i10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void k(long j10) {
        this.f47314a.k(j10);
    }

    @Override
    public final void m(d0 d0Var, long j10) {
        this.f47315b = d0Var;
        this.f47314a.m(this, j10);
    }

    @Override
    public final long o() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long o10 = o();
            if (o10 != -9223372036854775807L) {
                return o10;
            }
            return j10;
        }
        long o11 = this.f47314a.o();
        if (o11 != -9223372036854775807L) {
            long j11 = this.f47317f;
            long j12 = this.h;
            long max = Math.max(o11, j11);
            if (j12 != Long.MIN_VALUE) {
                max = Math.min(max, j12);
            }
            if (max != this.e) {
                this.e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.t0 t0Var) {
        return this.f47314a.p(t0Var);
    }

    @Override
    public final long q(x2.p[] r18, boolean[] r19, u2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e.q(x2.p[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final r1 r() {
        return this.f47314a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47314a.s();
        if (s10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || s10 < j10) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j10, i2.r1 r1Var) {
        long j11;
        long j12 = this.f47317f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e2.m0.j(r1Var.f12582a, 0L, j10 - j12);
        long j14 = r1Var.f12583b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e2.m0.j(j14, 0L, j11);
        if (j13 != r1Var.f12582a || j16 != r1Var.f12583b) {
            r1Var = new i2.r1(j13, j16);
        }
        return this.f47314a.t(j10, r1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47314a.u(j10);
    }

    @Override
    public final void v(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f47315b;
        d0Var.getClass();
        d0Var.v(this);
    }
}
