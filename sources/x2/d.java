package x2;
public final class d implements e0, d0 {
    public final e0 f60083a;
    public d0 f60084b;
    public c[] f60085c = new c[0];
    public long d;
    public long f60086e;
    public long f60087f;
    public long h;
    public g f60088n;

    public d(e0 e0Var, boolean z10, long j3, long j10, int i7) {
        long j11;
        this.f60083a = e0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f60086e = -9223372036854775807L;
        this.f60087f = j3;
        this.h = j10;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long b(a3.u[] r18, boolean[] r19, x2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: x2.d.b(a3.u[], boolean[], x2.d1[], boolean[], long):long");
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        return this.f60083a.c(s0Var);
    }

    @Override
    public final void c0(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f60084b;
        d0Var.getClass();
        d0Var.c0(this);
    }

    @Override
    public final long e() {
        long e10 = this.f60083a.e();
        if (e10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || e10 < j3) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long f(long j3, l2.p1 p1Var) {
        long j10;
        long j11 = this.f60087f;
        if (j3 == j11) {
            return j11;
        }
        long j12 = h2.l0.j(p1Var.f19524a, 0L, j3 - j11);
        long j13 = p1Var.f19525b;
        long j14 = this.h;
        if (j14 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j14 - j3;
        }
        long j15 = h2.l0.j(j13, 0L, j10);
        if (j12 != p1Var.f19524a || j15 != p1Var.f19525b) {
            p1Var = new l2.p1(j12, j15);
        }
        return this.f60083a.f(j3, p1Var);
    }

    @Override
    public final boolean g() {
        return this.f60083a.g();
    }

    @Override
    public final void i() {
        g gVar = this.f60088n;
        if (gVar == null) {
            this.f60083a.i();
            return;
        }
        throw gVar;
    }

    @Override
    public final long k(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f60085c) {
            if (cVar != null) {
                cVar.f60052b = false;
            }
        }
        long k10 = this.f60083a.k(j3);
        long j10 = this.f60087f;
        long j11 = this.h;
        long max = Math.max(k10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void m(e0 e0Var) {
        if (this.f60088n != null) {
            return;
        }
        d0 d0Var = this.f60084b;
        d0Var.getClass();
        d0Var.m(this);
    }

    @Override
    public final void n(long j3) {
        this.f60083a.n(j3);
    }

    @Override
    public final long o() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.f60086e = j3;
            long o4 = o();
            if (o4 != -9223372036854775807L) {
                return o4;
            }
            return j3;
        }
        long o10 = this.f60083a.o();
        if (o10 != -9223372036854775807L) {
            long j10 = this.f60087f;
            long j11 = this.h;
            long max = Math.max(o10, j10);
            if (j11 != Long.MIN_VALUE) {
                max = Math.min(max, j11);
            }
            if (max != this.f60086e) {
                this.f60086e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final r1 q() {
        return this.f60083a.q();
    }

    @Override
    public final long r() {
        long r10 = this.f60083a.r();
        if (r10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || r10 < j3) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        this.f60084b = d0Var;
        this.f60083a.t(this, j3);
    }

    @Override
    public final void u(long j3) {
        this.f60083a.u(j3);
    }
}
