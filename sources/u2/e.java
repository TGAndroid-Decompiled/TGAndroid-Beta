package u2;
public final class e implements e0, d0 {
    public final e0 f45907a;
    public d0 f45908b;
    public d[] f45909c = new d[0];
    public long d;
    public long e;
    public long f45910f;
    public long h;
    public h f45911n;

    public e(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f45907a = e0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f45910f = j10;
        this.h = j11;
    }

    @Override
    public final void F(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f45908b;
        d0Var.getClass();
        d0Var.F(this);
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return this.f45907a.c();
    }

    @Override
    public final long d() {
        long d = this.f45907a.d();
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
        h hVar = this.f45911n;
        if (hVar == null) {
            this.f45907a.g();
            return;
        }
        throw hVar;
    }

    @Override
    public final long h(long j10) {
        d[] dVarArr;
        this.d = -9223372036854775807L;
        for (d dVar : this.f45909c) {
            if (dVar != null) {
                dVar.f45905b = false;
            }
        }
        long h = this.f45907a.h(j10);
        long j11 = this.f45910f;
        long j12 = this.h;
        long max = Math.max(h, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void i(long j10) {
        this.f45907a.i(j10);
    }

    @Override
    public final void k(d0 d0Var, long j10) {
        this.f45908b = d0Var;
        this.f45907a.k(this, j10);
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
        long l10 = this.f45907a.l();
        if (l10 != -9223372036854775807L) {
            long j11 = this.f45910f;
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
    public final boolean m(i2.v0 v0Var) {
        return this.f45907a.m(v0Var);
    }

    @Override
    public final long n(x2.p[] r18, boolean[] r19, u2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e.n(x2.p[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final r1 o() {
        return this.f45907a.o();
    }

    @Override
    public final long p() {
        long p5 = this.f45907a.p();
        if (p5 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || p5 < j10) {
                return p5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void q(e0 e0Var) {
        if (this.f45911n != null) {
            return;
        }
        d0 d0Var = this.f45908b;
        d0Var.getClass();
        d0Var.q(this);
    }

    @Override
    public final long r(long j10, i2.t1 t1Var) {
        long j11;
        long j12 = this.f45910f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e2.m0.j(t1Var.f11198a, 0L, j10 - j12);
        long j14 = t1Var.f11199b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e2.m0.j(j14, 0L, j11);
        if (j13 != t1Var.f11198a || j16 != t1Var.f11199b) {
            t1Var = new i2.t1(j13, j16);
        }
        return this.f45907a.r(j10, t1Var);
    }

    @Override
    public final void s(long j10) {
        this.f45907a.s(j10);
    }
}
