package u2;
public final class d implements d0, c0 {
    public final d0 f43627a;
    public c0 f43628b;
    public c[] f43629c = new c[0];
    public long d;
    public long e;
    public long f43630f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f43627a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.e = j3;
        this.f43630f = j10;
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
        c0 c0Var = this.f43628b;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f43627a.c();
    }

    @Override
    public final long d() {
        long d = this.f43627a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f43630f;
            if (j3 == Long.MIN_VALUE || d < j3) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void g() {
        g gVar = this.h;
        if (gVar == null) {
            this.f43627a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f43629c) {
            if (cVar != null) {
                cVar.f43625b = false;
            }
        }
        long h = this.f43627a.h(j3);
        long j10 = this.e;
        long j11 = this.f43630f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f43627a.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43628b = c0Var;
        this.f43627a.k(this, j3);
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
        long l10 = this.f43627a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f43630f;
        long max = Math.max(l10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void m(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43628b;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean p(i2.s0 s0Var) {
        return this.f43627a.p(s0Var);
    }

    @Override
    public final long q(x2.r[] r18, boolean[] r19, u2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.q(x2.r[], boolean[], u2.b1[], boolean[], long):long");
    }

    @Override
    public final p1 r() {
        return this.f43627a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43627a.s();
        if (s10 != Long.MIN_VALUE) {
            long j3 = this.f43630f;
            if (j3 == Long.MIN_VALUE || s10 < j3) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j3, i2.q1 q1Var) {
        long j10;
        long j11 = this.e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(q1Var.f10852a, 0L, j3 - j11);
        long j12 = q1Var.f10853b;
        long j13 = this.f43630f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != q1Var.f10852a || i11 != q1Var.f10853b) {
            q1Var = new i2.q1(i10, i11);
        }
        return this.f43627a.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        this.f43627a.u(j3);
    }
}
