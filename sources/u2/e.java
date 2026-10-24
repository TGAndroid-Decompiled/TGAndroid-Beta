package u2;
public final class e implements f0, e0 {
    public final f0 f47731a;
    public e0 f47732b;
    public d[] f47733c = new d[0];
    public long d;
    public long e;
    public long f47734f;
    public long h;
    public h f47735n;

    public e(f0 f0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f47731a = f0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f47734f = j10;
        this.h = j11;
    }

    @Override
    public final void a(f0 f0Var) {
        if (this.f47735n != null) {
            return;
        }
        e0 e0Var = this.f47732b;
        e0Var.getClass();
        e0Var.a(this);
    }

    @Override
    public final void b(h1 h1Var) {
        f0 f0Var = (f0) h1Var;
        e0 e0Var = this.f47732b;
        e0Var.getClass();
        e0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f47731a.c();
    }

    @Override
    public final long d() {
        long d = this.f47731a.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean e() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void h() {
        h hVar = this.f47735n;
        if (hVar == null) {
            this.f47731a.h();
            return;
        }
        throw hVar;
    }

    @Override
    public final long i(long j10) {
        d[] dVarArr;
        this.d = -9223372036854775807L;
        for (d dVar : this.f47733c) {
            if (dVar != null) {
                dVar.f47724b = false;
            }
        }
        long i10 = this.f47731a.i(j10);
        long j11 = this.f47734f;
        long j12 = this.h;
        long max = Math.max(i10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void l(long j10) {
        this.f47731a.l(j10);
    }

    @Override
    public final void n(e0 e0Var, long j10) {
        this.f47732b = e0Var;
        this.f47731a.n(this, j10);
    }

    @Override
    public final long o() {
        if (e()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long o10 = o();
            if (o10 != -9223372036854775807L) {
                return o10;
            }
            return j10;
        }
        long o11 = this.f47731a.o();
        if (o11 != -9223372036854775807L) {
            long j11 = this.f47734f;
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
    public final boolean p(i2.u0 u0Var) {
        return this.f47731a.p(u0Var);
    }

    @Override
    public final long q(x2.p[] r18, boolean[] r19, u2.f1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e.q(x2.p[], boolean[], u2.f1[], boolean[], long):long");
    }

    @Override
    public final t1 r() {
        return this.f47731a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47731a.s();
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
        long j12 = this.f47734f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e2.m0.j(s1Var.f12613a, 0L, j10 - j12);
        long j14 = s1Var.f12614b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e2.m0.j(j14, 0L, j11);
        if (j13 != s1Var.f12613a || j16 != s1Var.f12614b) {
            s1Var = new i2.s1(j13, j16);
        }
        return this.f47731a.t(j10, s1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47731a.u(j10);
    }
}
