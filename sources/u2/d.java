package u2;
public final class d implements e0, d0 {
    public final e0 f49284a;
    public d0 f49285b;
    public c[] f49286c = new c[0];
    public long d;
    public long e;
    public long f49287f;
    public long h;
    public g f49288n;

    public d(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f49284a = e0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f49287f = j10;
        this.h = j11;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long b() {
        long b10 = this.f49284a.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean c() {
        return this.f49284a.c();
    }

    @Override
    public final void g() {
        g gVar = this.f49288n;
        if (gVar == null) {
            this.f49284a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j10) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f49286c) {
            if (cVar != null) {
                cVar.f49255b = false;
            }
        }
        long h = this.f49284a.h(j10);
        long j11 = this.f49287f;
        long j12 = this.h;
        long max = Math.max(h, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void i(long j10) {
        this.f49284a.i(j10);
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.f49285b = d0Var;
        this.f49284a.k(this, j10);
    }

    @Override
    public final long l() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long l4 = l();
            if (l4 != -9223372036854775807L) {
                return l4;
            }
            return j10;
        }
        long l10 = this.f49284a.l();
        if (l10 != -9223372036854775807L) {
            long j11 = this.f49287f;
            long j12 = this.h;
            long max = Math.max(l10, j11);
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
    public final boolean m(i2.w0 w0Var) {
        return this.f49284a.m(w0Var);
    }

    @Override
    public final void n(e0 e0Var) {
        if (this.f49288n != null) {
            return;
        }
        d0 d0Var = this.f49285b;
        d0Var.getClass();
        d0Var.n(this);
    }

    @Override
    public final long o(x2.q[] r18, boolean[] r19, u2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.o(x2.q[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final r1 p() {
        return this.f49284a.p();
    }

    @Override
    public final long q() {
        long q5 = this.f49284a.q();
        if (q5 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || q5 < j10) {
                return q5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        long j11;
        long j12 = this.f49287f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e2.n0.j(t1Var.f13768a, 0L, j10 - j12);
        long j14 = t1Var.f13769b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e2.n0.j(j14, 0L, j11);
        if (j13 != t1Var.f13768a || j16 != t1Var.f13769b) {
            t1Var = new i2.t1(j13, j16);
        }
        return this.f49284a.r(j10, t1Var);
    }

    @Override
    public final void s(long j10) {
        this.f49284a.s(j10);
    }

    @Override
    public final void u(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f49285b;
        d0Var.getClass();
        d0Var.u(this);
    }
}
