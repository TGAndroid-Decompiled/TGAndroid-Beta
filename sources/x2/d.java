package x2;

import l2.t1;
public final class d implements d0, c0 {
    public final d0 f58324a;
    public c0 f58325b;
    public c[] f58326c = new c[0];
    public long d;
    public long f58327e;
    public long f58328f;
    public long h;
    public g f58329n;

    public d(d0 d0Var, boolean z9, long j3, long j10, int i7) {
        long j11;
        this.f58324a = d0Var;
        if (z9) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f58327e = -9223372036854775807L;
        this.f58328f = j3;
        this.h = j10;
    }

    @Override
    public final void a(d0 d0Var) {
        if (this.f58329n != null) {
            return;
        }
        c0 c0Var = this.f58325b;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final long b(a3.u[] r18, boolean[] r19, x2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: x2.d.b(a3.u[], boolean[], x2.b1[], boolean[], long):long");
    }

    @Override
    public final boolean c(l2.v0 v0Var) {
        return this.f58324a.c(v0Var);
    }

    @Override
    public final void d(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f58325b;
        c0Var.getClass();
        c0Var.d(this);
    }

    @Override
    public final long e() {
        long e10 = this.f58324a.e();
        if (e10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || e10 < j3) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f58324a.g();
    }

    @Override
    public final long h(long j3, t1 t1Var) {
        long j10;
        long j11 = this.f58328f;
        if (j3 == j11) {
            return j11;
        }
        long j12 = h2.m0.j(t1Var.f18055a, 0L, j3 - j11);
        long j13 = t1Var.f18056b;
        long j14 = this.h;
        if (j14 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j14 - j3;
        }
        long j15 = h2.m0.j(j13, 0L, j10);
        if (j12 != t1Var.f18055a || j15 != t1Var.f18056b) {
            t1Var = new t1(j12, j15);
        }
        return this.f58324a.h(j3, t1Var);
    }

    @Override
    public final void i() {
        g gVar = this.f58329n;
        if (gVar == null) {
            this.f58324a.i();
            return;
        }
        throw gVar;
    }

    @Override
    public final long j(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f58326c) {
            if (cVar != null) {
                cVar.f58322b = false;
            }
        }
        long j10 = this.f58324a.j(j3);
        long j11 = this.f58328f;
        long j12 = this.h;
        long max = Math.max(j10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(max, j12);
        }
        return max;
    }

    @Override
    public final void k(long j3) {
        this.f58324a.k(j3);
    }

    @Override
    public final long n() {
        if (f()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.f58327e = j3;
            long n10 = n();
            if (n10 != -9223372036854775807L) {
                return n10;
            }
            return j3;
        }
        long n11 = this.f58324a.n();
        if (n11 != -9223372036854775807L) {
            long j10 = this.f58328f;
            long j11 = this.h;
            long max = Math.max(n11, j10);
            if (j11 != Long.MIN_VALUE) {
                max = Math.min(max, j11);
            }
            if (max != this.f58327e) {
                this.f58327e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final p1 o() {
        return this.f58324a.o();
    }

    @Override
    public final long p() {
        long p10 = this.f58324a.p();
        if (p10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || p10 < j3) {
                return p10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void q(c0 c0Var, long j3) {
        this.f58325b = c0Var;
        this.f58324a.q(this, j3);
    }

    @Override
    public final void r(long j3) {
        this.f58324a.r(j3);
    }
}
