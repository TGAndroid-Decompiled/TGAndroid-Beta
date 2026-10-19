package u2;
public final class e implements e0, d0 {
    public final e0 f47293a;
    public d0 f47294b;
    public d[] f47295c = new d[0];
    public long d;
    public long e;
    public long f47296f;
    public long h;
    public h f47297n;

    public e(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f47293a = e0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f47296f = j10;
        this.h = j11;
    }

    @Override
    public final void a(e0 e0Var) {
        if (this.f47297n != null) {
            return;
        }
        d0 d0Var = this.f47294b;
        d0Var.getClass();
        d0Var.a(this);
    }

    public final boolean b() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return this.f47293a.c();
    }

    @Override
    public final long d() {
        long d = this.f47293a.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void h(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f47294b;
        d0Var.getClass();
        d0Var.h(this);
    }

    @Override
    public final void i() {
        h hVar = this.f47297n;
        if (hVar == null) {
            this.f47293a.i();
            return;
        }
        throw hVar;
    }

    @Override
    public final long j(long j10) {
        d[] dVarArr;
        this.d = -9223372036854775807L;
        for (d dVar : this.f47295c) {
            if (dVar != null) {
                dVar.f47291b = false;
            }
        }
        long j11 = this.f47293a.j(j10);
        long j12 = this.f47296f;
        long j13 = this.h;
        long max = Math.max(j11, j12);
        if (j13 != Long.MIN_VALUE) {
            return Math.min(max, j13);
        }
        return max;
    }

    @Override
    public final void l(long j10) {
        this.f47293a.l(j10);
    }

    @Override
    public final void n(d0 d0Var, long j10) {
        this.f47294b = d0Var;
        this.f47293a.n(this, j10);
    }

    @Override
    public final long o() {
        if (b()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long o10 = o();
            if (o10 != -9223372036854775807L) {
                return o10;
            }
            return j10;
        }
        long o11 = this.f47293a.o();
        if (o11 != -9223372036854775807L) {
            long j11 = this.f47296f;
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
    public final boolean p(i2.v0 v0Var) {
        return this.f47293a.p(v0Var);
    }

    @Override
    public final long q(x2.p[] r18, boolean[] r19, u2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e.q(x2.p[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final r1 r() {
        return this.f47293a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47293a.s();
        if (s10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || s10 < j10) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j10, i2.s1 s1Var) {
        long j11;
        long j12 = this.f47296f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e2.m0.j(s1Var.f12583a, 0L, j10 - j12);
        long j14 = s1Var.f12584b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e2.m0.j(j14, 0L, j11);
        if (j13 != s1Var.f12583a || j16 != s1Var.f12584b) {
            s1Var = new i2.s1(j13, j16);
        }
        return this.f47293a.t(j10, s1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47293a.u(j10);
    }
}
