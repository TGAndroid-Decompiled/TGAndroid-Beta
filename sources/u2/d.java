package u2;
public final class d implements d0, c0 {
    public final d0 f47249a;
    public c0 f47250b;
    public c[] f47251c = new c[0];
    public long d;
    public long f47252e;
    public long f47253f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f47249a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f47252e = j3;
        this.f47253f = j10;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.f47250b;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f47249a.c();
    }

    @Override
    public final long d() {
        long d = this.f47249a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f47253f;
            if (j3 == Long.MIN_VALUE || d < j3) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void f(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f47250b;
        c0Var.getClass();
        c0Var.f(this);
    }

    @Override
    public final void g() {
        g gVar = this.h;
        if (gVar == null) {
            this.f47249a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f47251c) {
            if (cVar != null) {
                cVar.f47247b = false;
            }
        }
        long h = this.f47249a.h(j3);
        long j10 = this.f47252e;
        long j11 = this.f47253f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f47249a.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f47250b = c0Var;
        this.f47249a.k(this, j3);
    }

    @Override
    public final long l() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long l4 = l();
            if (l4 != -9223372036854775807L) {
                return l4;
            }
            return j3;
        }
        long l10 = this.f47249a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f47252e;
        long j11 = this.f47253f;
        long max = Math.max(l10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        return this.f47249a.m(s0Var);
    }

    @Override
    public final long n(x2.r[] r18, boolean[] r19, u2.c1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.n(x2.r[], boolean[], u2.c1[], boolean[], long):long");
    }

    @Override
    public final p1 o() {
        return this.f47249a.o();
    }

    @Override
    public final long p() {
        long p5 = this.f47249a.p();
        if (p5 != Long.MIN_VALUE) {
            long j3 = this.f47253f;
            if (j3 == Long.MIN_VALUE || p5 < j3) {
                return p5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long q(long j3, i2.q1 q1Var) {
        long j10;
        long j11 = this.f47252e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(q1Var.f11824a, 0L, j3 - j11);
        long j12 = q1Var.f11825b;
        long j13 = this.f47253f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != q1Var.f11824a || i11 != q1Var.f11825b) {
            q1Var = new i2.q1(i10, i11);
        }
        return this.f47249a.q(j3, q1Var);
    }

    @Override
    public final void r(long j3) {
        this.f47249a.r(j3);
    }
}
