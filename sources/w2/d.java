package w2;
public final class d implements e0, d0 {
    public final e0 f57066a;
    public d0 f57067b;
    public c[] f57068c = new c[0];
    public long d;
    public long f57069e;
    public long f57070f;
    public long h;
    public g f57071n;

    public d(e0 e0Var, boolean z10, long j10, long j11, int i3) {
        long j12;
        this.f57066a = e0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.f57069e = -9223372036854775807L;
        this.f57070f = j10;
        this.h = j11;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(e0 e0Var) {
        if (this.f57071n != null) {
            return;
        }
        d0 d0Var = this.f57067b;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override
    public final boolean c(k2.v0 v0Var) {
        return this.f57066a.c(v0Var);
    }

    @Override
    public final boolean d() {
        return this.f57066a.d();
    }

    @Override
    public final long e() {
        long e10 = this.f57066a.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void g() {
        g gVar = this.f57071n;
        if (gVar == null) {
            this.f57066a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final void i(d0 d0Var, long j10) {
        this.f57067b = d0Var;
        this.f57066a.i(this, j10);
    }

    @Override
    public final long j(long j10) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f57068c) {
            if (cVar != null) {
                cVar.f57035b = false;
            }
        }
        long j11 = this.f57066a.j(j10);
        long j12 = this.f57070f;
        long j13 = this.h;
        long max = Math.max(j11, j12);
        if (j13 != Long.MIN_VALUE) {
            return Math.min(max, j13);
        }
        return max;
    }

    @Override
    public final void k(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f57067b;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override
    public final void l(long j10) {
        this.f57066a.l(j10);
    }

    @Override
    public final long n() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.f57069e = j10;
            long n4 = n();
            if (n4 != -9223372036854775807L) {
                return n4;
            }
            return j10;
        }
        long n10 = this.f57066a.n();
        if (n10 != -9223372036854775807L) {
            long j11 = this.f57070f;
            long j12 = this.h;
            long max = Math.max(n10, j11);
            if (j12 != Long.MIN_VALUE) {
                max = Math.min(max, j12);
            }
            if (max != this.f57069e) {
                this.f57069e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final r1 p() {
        return this.f57066a.p();
    }

    @Override
    public final long q() {
        long q10 = this.f57066a.q();
        if (q10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || q10 < j10) {
                return q10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long r(long j10, k2.t1 t1Var) {
        long j11;
        long j12 = this.f57070f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = g2.n0.j(t1Var.f16739a, 0L, j10 - j12);
        long j14 = t1Var.f16740b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = g2.n0.j(j14, 0L, j11);
        if (j13 != t1Var.f16739a || j16 != t1Var.f16740b) {
            t1Var = new k2.t1(j13, j16);
        }
        return this.f57066a.r(j10, t1Var);
    }

    @Override
    public final long s(z2.p[] r18, boolean[] r19, w2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: w2.d.s(z2.p[], boolean[], w2.d1[], boolean[], long):long");
    }

    @Override
    public final void t(long j10) {
        this.f57066a.t(j10);
    }
}
