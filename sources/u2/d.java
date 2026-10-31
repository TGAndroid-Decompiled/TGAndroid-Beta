package u2;

import i2.v1;
public final class d implements e0, d0 {
    public final e0 f49862a;
    public d0 f49863b;
    public c[] f49864c = new c[0];
    public long d;
    public long e;
    public long f49865f;
    public long h;
    public g f49866n;

    public d(e0 e0Var, boolean z10, long j10, long j11, int i10) {
        long j12;
        this.f49862a = e0Var;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.d = j12;
        this.e = -9223372036854775807L;
        this.f49865f = j10;
        this.h = j11;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long c() {
        long c10 = this.f49862a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean d() {
        return this.f49862a.d();
    }

    @Override
    public final void e(e0 e0Var) {
        if (this.f49866n != null) {
            return;
        }
        d0 d0Var = this.f49863b;
        d0Var.getClass();
        d0Var.e(this);
    }

    @Override
    public final void f() {
        g gVar = this.f49866n;
        if (gVar == null) {
            this.f49862a.f();
            return;
        }
        throw gVar;
    }

    @Override
    public final long g(long j10) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f49864c) {
            if (cVar != null) {
                cVar.f49833b = false;
            }
        }
        long g10 = this.f49862a.g(j10);
        long j11 = this.f49865f;
        long j12 = this.h;
        long max = Math.max(g10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void h(long j10) {
        this.f49862a.h(j10);
    }

    @Override
    public final void j(d0 d0Var, long j10) {
        this.f49863b = d0Var;
        this.f49862a.j(this, j10);
    }

    @Override
    public final long k() {
        if (a()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            this.e = j10;
            long k10 = k();
            if (k10 != -9223372036854775807L) {
                return k10;
            }
            return j10;
        }
        long k11 = this.f49862a.k();
        if (k11 != -9223372036854775807L) {
            long j11 = this.f49865f;
            long j12 = this.h;
            long max = Math.max(k11, j11);
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
        return this.f49862a.m(w0Var);
    }

    @Override
    public final long p(x2.q[] r18, boolean[] r19, u2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.p(x2.q[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final r1 q() {
        return this.f49862a.q();
    }

    @Override
    public final void r(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f49863b;
        d0Var.getClass();
        d0Var.r(this);
    }

    @Override
    public final long s() {
        long s10 = this.f49862a.s();
        if (s10 != Long.MIN_VALUE) {
            long j10 = this.h;
            if (j10 == Long.MIN_VALUE || s10 < j10) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j10, v1 v1Var) {
        long j11;
        long j12 = this.f49865f;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e2.l0.j(v1Var.f8103a, 0L, j10 - j12);
        long j14 = v1Var.f8104b;
        long j15 = this.h;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e2.l0.j(j14, 0L, j11);
        if (j13 != v1Var.f8103a || j16 != v1Var.f8104b) {
            v1Var = new v1(j13, j16);
        }
        return this.f49862a.t(j10, v1Var);
    }

    @Override
    public final void u(long j10) {
        this.f49862a.u(j10);
    }
}
