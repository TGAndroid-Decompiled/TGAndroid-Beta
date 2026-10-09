package u2;

import i2.q1;
public final class d implements d0, c0 {
    public final d0 f48553a;
    public c0 f48554b;
    public c[] f48555c = new c[0];
    public long d;
    public long f48556e;
    public long f48557f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f48553a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f48556e = j3;
        this.f48557f = j10;
    }

    @Override
    public final void D(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f48554b;
        c0Var.getClass();
        c0Var.D(this);
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return this.f48553a.c();
    }

    @Override
    public final long d() {
        long d = this.f48553a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f48557f;
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
            this.f48553a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f48555c) {
            if (cVar != null) {
                cVar.f48551b = false;
            }
        }
        long h = this.f48553a.h(j3);
        long j10 = this.f48556e;
        long j11 = this.f48557f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f48553a.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f48554b = c0Var;
        this.f48553a.k(this, j3);
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
        long l10 = this.f48553a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f48556e;
        long j11 = this.f48557f;
        long max = Math.max(l10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void m(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.f48554b;
        c0Var.getClass();
        c0Var.m(this);
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        return this.f48553a.n(s0Var);
    }

    @Override
    public final long o(x2.r[] r18, boolean[] r19, u2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.o(x2.r[], boolean[], u2.b1[], boolean[], long):long");
    }

    @Override
    public final o1 p() {
        return this.f48553a.p();
    }

    @Override
    public final long q() {
        long q6 = this.f48553a.q();
        if (q6 != Long.MIN_VALUE) {
            long j3 = this.f48557f;
            if (j3 == Long.MIN_VALUE || q6 < j3) {
                return q6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        long j10;
        long j11 = this.f48556e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(q1Var.f11874a, 0L, j3 - j11);
        long j12 = q1Var.f11875b;
        long j13 = this.f48557f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != q1Var.f11874a || i11 != q1Var.f11875b) {
            q1Var = new q1(i10, i11);
        }
        return this.f48553a.r(j3, q1Var);
    }

    @Override
    public final void s(long j3) {
        this.f48553a.s(j3);
    }
}
