package u2;
public final class d implements d0, c0 {
    public final d0 f47334a;
    public c0 f47335b;
    public c[] f47336c = new c[0];
    public long d;
    public long e;
    public long f47337f;
    public long h;
    public g f47338n;

    public d(d0 d0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f47334a = d0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f47337f = j10;
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
        return this.f47334a.c();
    }

    @Override
    public final long d() {
        long d = this.f47334a.d();
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
        g gVar = this.f47338n;
        if (gVar == null) {
            this.f47334a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final void h(d0 d0Var) {
        if (this.f47338n != null) {
            return;
        }
        c0 c0Var = this.f47335b;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final long i(long j10) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f47336c) {
            if (cVar != null) {
                cVar.f47332b = false;
            }
        }
        long i10 = this.f47334a.i(j10);
        long j11 = this.f47337f;
        long j12 = this.h;
        long max = Math.max(i10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void k(long j10) {
        this.f47334a.k(j10);
    }

    @Override
    public final void m(c0 c0Var, long j10) {
        this.f47335b = c0Var;
        this.f47334a.m(this, j10);
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
        long o11 = this.f47334a.o();
        if (o11 != -9223372036854775807L) {
            long j11 = this.f47337f;
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
        return this.f47334a.p(u0Var);
    }

    @Override
    public final long q(x2.p[] r18, boolean[] r19, u2.c1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.q(x2.p[], boolean[], u2.c1[], boolean[], long):long");
    }

    @Override
    public final q1 r() {
        return this.f47334a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f47334a.s();
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
        long j12 = this.f47337f;
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
        return this.f47334a.t(j10, r1Var);
    }

    @Override
    public final void u(long j10) {
        this.f47334a.u(j10);
    }

    @Override
    public final void v(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f47335b;
        c0Var.getClass();
        c0Var.v(this);
    }
}
