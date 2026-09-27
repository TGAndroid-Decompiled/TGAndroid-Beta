package u2;

import i2.q1;
public final class d implements d0, c0 {
    public final d0 f43672a;
    public c0 f43673b;
    public c[] f43674c = new c[0];
    public long d;
    public long e;
    public long f43675f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f43672a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.e = j3;
        this.f43675f = j10;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return this.f43672a.c();
    }

    @Override
    public final long d() {
        long d = this.f43672a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f43675f;
            if (j3 == Long.MIN_VALUE || d < j3) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void e(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.f43673b;
        c0Var.getClass();
        c0Var.e(this);
    }

    @Override
    public final void g() {
        g gVar = this.h;
        if (gVar == null) {
            this.f43672a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final void h(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f43673b;
        c0Var.getClass();
        c0Var.h(this);
    }

    @Override
    public final long i(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f43674c) {
            if (cVar != null) {
                cVar.f43670b = false;
            }
        }
        long i10 = this.f43672a.i(j3);
        long j10 = this.e;
        long j11 = this.f43675f;
        long max = Math.max(i10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void j(long j3) {
        this.f43672a.j(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43673b = c0Var;
        this.f43672a.k(this, j3);
    }

    @Override
    public final long n() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long n10 = n();
            if (n10 != -9223372036854775807L) {
                return n10;
            }
            return j3;
        }
        long n11 = this.f43672a.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f43675f;
        long max = Math.max(n11, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final boolean o(i2.s0 s0Var) {
        return this.f43672a.o(s0Var);
    }

    @Override
    public final long p(x2.r[] r18, boolean[] r19, u2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.p(x2.r[], boolean[], u2.b1[], boolean[], long):long");
    }

    @Override
    public final o1 r() {
        return this.f43672a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f43672a.s();
        if (s10 != Long.MIN_VALUE) {
            long j3 = this.f43675f;
            if (j3 == Long.MIN_VALUE || s10 < j3) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        long j10;
        long j11 = this.e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(q1Var.f10855a, 0L, j3 - j11);
        long j12 = q1Var.f10856b;
        long j13 = this.f43675f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != q1Var.f10855a || i11 != q1Var.f10856b) {
            q1Var = new q1(i10, i11);
        }
        return this.f43672a.t(j3, q1Var);
    }

    @Override
    public final void u(long j3) {
        this.f43672a.u(j3);
    }
}
