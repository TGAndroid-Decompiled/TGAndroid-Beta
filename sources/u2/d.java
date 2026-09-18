package u2;
public final class d implements d0, c0 {
    public final d0 f43597a;
    public c0 f43598b;
    public c[] f43599c = new c[0];
    public long d;
    public long e;
    public long f43600f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f43597a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.e = j3;
        this.f43600f = j10;
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
        c0 c0Var = this.f43598b;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f43597a.c();
    }

    @Override
    public final long d() {
        long d = this.f43597a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f43600f;
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
            this.f43597a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f43599c) {
            if (cVar != null) {
                cVar.f43595b = false;
            }
        }
        long h = this.f43597a.h(j3);
        long j10 = this.e;
        long j11 = this.f43600f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f43597a.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43598b = c0Var;
        this.f43597a.k(this, j3);
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
        long l10 = this.f43597a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f43600f;
        long max = Math.max(l10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void m(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43598b;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        return this.f43597a.p(r0Var);
    }

    @Override
    public final long q(x2.r[] r18, boolean[] r19, u2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.q(x2.r[], boolean[], u2.b1[], boolean[], long):long");
    }

    @Override
    public final o1 r() {
        return this.f43597a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43597a.s();
        if (s10 != Long.MIN_VALUE) {
            long j3 = this.f43600f;
            if (j3 == Long.MIN_VALUE || s10 < j3) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        long j10;
        long j11 = this.e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(p1Var.f10860a, 0L, j3 - j11);
        long j12 = p1Var.f10861b;
        long j13 = this.f43600f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != p1Var.f10860a || i11 != p1Var.f10861b) {
            p1Var = new i2.p1(i10, i11);
        }
        return this.f43597a.t(j3, p1Var);
    }

    @Override
    public final void u(long j3) {
        this.f43597a.u(j3);
    }
}
