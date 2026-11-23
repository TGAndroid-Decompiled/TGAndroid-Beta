package x2;
public final class d implements e0, d0 {
    public final e0 f60201a;
    public d0 f60202b;
    public c[] f60203c = new c[0];
    public long d;
    public long f60204e;
    public long f60205f;
    public long h;
    public g f60206n;

    public d(e0 e0Var, boolean z10, long j3, long j10, int i7) {
        long j11;
        this.f60201a = e0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f60204e = -9223372036854775807L;
        this.f60205f = j3;
        this.h = j10;
    }

    @Override
    public final void V(e0 e0Var) {
        if (this.f60206n != null) {
            return;
        }
        d0 d0Var = this.f60202b;
        d0Var.getClass();
        d0Var.V(this);
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long c(a3.u[] r18, boolean[] r19, x2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: x2.d.c(a3.u[], boolean[], x2.d1[], boolean[], long):long");
    }

    @Override
    public final boolean d(l2.t0 t0Var) {
        return this.f60201a.d(t0Var);
    }

    @Override
    public final long f() {
        long f10 = this.f60201a.f();
        if (f10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || f10 < j3) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean g() {
        return this.f60201a.g();
    }

    @Override
    public final long i(long j3, l2.q1 q1Var) {
        long j10;
        long j11 = this.f60205f;
        if (j3 == j11) {
            return j11;
        }
        long j12 = h2.l0.j(q1Var.f19628a, 0L, j3 - j11);
        long j13 = q1Var.f19629b;
        long j14 = this.h;
        if (j14 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j14 - j3;
        }
        long j15 = h2.l0.j(j13, 0L, j10);
        if (j12 != q1Var.f19628a || j15 != q1Var.f19629b) {
            q1Var = new l2.q1(j12, j15);
        }
        return this.f60201a.i(j3, q1Var);
    }

    @Override
    public final void i2(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f60202b;
        d0Var.getClass();
        d0Var.i2(this);
    }

    @Override
    public final void j() {
        g gVar = this.f60206n;
        if (gVar == null) {
            this.f60201a.j();
            return;
        }
        throw gVar;
    }

    @Override
    public final long l(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f60203c) {
            if (cVar != null) {
                cVar.f60170b = false;
            }
        }
        long l10 = this.f60201a.l(j3);
        long j10 = this.f60205f;
        long j11 = this.h;
        long max = Math.max(l10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void n(long j3) {
        this.f60201a.n(j3);
    }

    @Override
    public final long p() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            this.f60204e = j3;
            long p10 = p();
            if (p10 != -9223372036854775807L) {
                return p10;
            }
            return j3;
        }
        long p11 = this.f60201a.p();
        if (p11 != -9223372036854775807L) {
            long j10 = this.f60205f;
            long j11 = this.h;
            long max = Math.max(p11, j10);
            if (j11 != Long.MIN_VALUE) {
                max = Math.min(max, j11);
            }
            if (max != this.f60204e) {
                this.f60204e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final r1 q() {
        return this.f60201a.q();
    }

    @Override
    public final long r() {
        long r10 = this.f60201a.r();
        if (r10 != Long.MIN_VALUE) {
            long j3 = this.h;
            if (j3 == Long.MIN_VALUE || r10 < j3) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void s(d0 d0Var, long j3) {
        this.f60202b = d0Var;
        this.f60201a.s(this, j3);
    }

    @Override
    public final void u(long j3) {
        this.f60201a.u(j3);
    }
}
