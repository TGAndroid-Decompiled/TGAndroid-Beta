package x2;
public final class d implements d0, c0 {
    public final d0 f59505a;
    public c0 f59506b;
    public c[] f59507c = new c[0];
    public long d;
    public long f59508e;
    public long f59509f;
    public long h;
    public g f59510n;

    public d(d0 d0Var, boolean z10, long j3, long j10, int i7) {
        long j11;
        this.f59505a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f59508e = -9223372036854775807L;
        this.f59509f = j3;
        this.h = j10;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long b(a3.u[] r18, boolean[] r19, x2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: x2.d.b(a3.u[], boolean[], x2.b1[], boolean[], long):long");
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        return this.f59505a.c(s0Var);
    }

    @Override
    public final long e() {
        long e10 = this.f59505a.e();
        if (e10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || e10 < j3) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void f0(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f59506b;
        c0Var.getClass();
        c0Var.f0(this);
    }

    @Override
    public final boolean g() {
        return this.f59505a.g();
    }

    @Override
    public final long h(long j3, l2.p1 p1Var) {
        long j10;
        long j11 = this.f59509f;
        if (j3 == j11) {
            return j11;
        }
        long j12 = h2.l0.j(p1Var.f19163a, 0L, j3 - j11);
        long j13 = p1Var.f19164b;
        long j14 = this.h;
        if (j14 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j14 - j3;
        }
        long j15 = h2.l0.j(j13, 0L, j10);
        if (j12 != p1Var.f19163a || j15 != p1Var.f19164b) {
            p1Var = new l2.p1(j12, j15);
        }
        return this.f59505a.h(j3, p1Var);
    }

    @Override
    public final void i() {
        g gVar = this.f59510n;
        if (gVar == null) {
            this.f59505a.i();
            return;
        }
        throw gVar;
    }

    @Override
    public final long j(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f59507c) {
            if (cVar != null) {
                cVar.f59503b = false;
            }
        }
        long j10 = this.f59505a.j(j3);
        long j11 = this.f59509f;
        long j12 = this.h;
        long max = Math.max(j10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void k(d0 d0Var) {
        if (this.f59510n != null) {
            return;
        }
        c0 c0Var = this.f59506b;
        c0Var.getClass();
        c0Var.k(this);
    }

    @Override
    public final void l(long j3) {
        this.f59505a.l(j3);
    }

    @Override
    public final long o() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.f59508e = j3;
            long o4 = o();
            if (o4 != -9223372036854775807L) {
                return o4;
            }
            return j3;
        }
        long o10 = this.f59505a.o();
        if (o10 != -9223372036854775807L) {
            long j10 = this.f59509f;
            long j11 = this.h;
            long max = Math.max(o10, j10);
            if (j11 != Long.MIN_VALUE) {
                max = Math.min(max, j11);
            }
            if (max != this.f59508e) {
                this.f59508e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final q1 p() {
        return this.f59505a.p();
    }

    @Override
    public final long s() {
        long s5 = this.f59505a.s();
        if (s5 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || s5 < j3) {
                return s5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        this.f59506b = c0Var;
        this.f59505a.t(this, j3);
    }

    @Override
    public final void u(long j3) {
        this.f59505a.u(j3);
    }
}
