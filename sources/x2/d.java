package x2;

import l2.t1;
public final class d implements e0, d0 {
    public final e0 f58192a;
    public d0 f58193b;
    public c[] f58194c = new c[0];
    public long d;
    public long f58195e;
    public long f58196f;
    public long h;
    public g f58197n;

    public d(e0 e0Var, boolean z9, long j3, long j10, int i7) {
        long j11;
        this.f58192a = e0Var;
        if (z9) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f58195e = -9223372036854775807L;
        this.f58196f = j3;
        this.h = j10;
    }

    @Override
    public final void a(e0 e0Var) {
        if (this.f58197n != null) {
            return;
        }
        d0 d0Var = this.f58193b;
        d0Var.getClass();
        d0Var.a(this);
    }

    @Override
    public final long b(a3.u[] r18, boolean[] r19, x2.c1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: x2.d.b(a3.u[], boolean[], x2.c1[], boolean[], long):long");
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        return this.f58192a.c(v0Var);
    }

    @Override
    public final void d(e1 e1Var) {
        e0 e0Var = (e0) e1Var;
        d0 d0Var = this.f58193b;
        d0Var.getClass();
        d0Var.d(this);
    }

    @Override
    public final long e() {
        long e10 = this.f58192a.e();
        if (e10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || e10 < j3) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f58192a.g();
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        long j10;
        long j11 = this.f58196f;
        if (j3 == j11) {
            return j11;
        }
        long j12 = h2.m0.j(t1Var.f18051a, 0L, j3 - j11);
        long j13 = t1Var.f18052b;
        long j14 = this.h;
        if (j14 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j14 - j3;
        }
        long j15 = h2.m0.j(j13, 0L, j10);
        if (j12 != t1Var.f18051a || j15 != t1Var.f18052b) {
            t1Var = new t1(j12, j15);
        }
        return this.f58192a.h(j3, t1Var);
    }

    @Override
    public final void i() {
        g gVar = this.f58197n;
        if (gVar == null) {
            this.f58192a.i();
            return;
        }
        throw gVar;
    }

    @Override
    public final long j(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f58194c) {
            if (cVar != null) {
                cVar.f58184b = false;
            }
        }
        long j10 = this.f58192a.j(j3);
        long j11 = this.f58196f;
        long j12 = this.h;
        long max = Math.max(j10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void k(long j3) {
        this.f58192a.k(j3);
    }

    @Override
    public final long n() {
        if (f()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.f58195e = j3;
            long n10 = n();
            if (n10 != -9223372036854775807L) {
                return n10;
            }
            return j3;
        }
        long n11 = this.f58192a.n();
        if (n11 != -9223372036854775807L) {
            long j10 = this.f58196f;
            long j11 = this.h;
            long max = Math.max(n11, j10);
            if (j11 != Long.MIN_VALUE) {
                max = Math.min(max, j11);
            }
            if (max != this.f58195e) {
                this.f58195e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final q1 o() {
        return this.f58192a.o();
    }

    @Override
    public final long p() {
        long p10 = this.f58192a.p();
        if (p10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || p10 < j3) {
                return p10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void q(d0 d0Var, long j3) {
        this.f58193b = d0Var;
        this.f58192a.q(this, j3);
    }

    @Override
    public final void r(long j3) {
        this.f58192a.r(j3);
    }
}
