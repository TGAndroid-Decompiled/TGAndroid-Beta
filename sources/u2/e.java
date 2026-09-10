package u2;
public final class e implements e0, d0 {
    public final e0 f42312a;
    public d0 f42313b;
    public d[] f42314c = new d[0];
    public long d;
    public long e;
    public long f42315f;
    public h h;

    public e(e0 e0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f42312a = e0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.e = j3;
        this.f42315f = j10;
    }

    public final boolean a() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void b(e0 e0Var) {
        if (this.h != null) {
            return;
        }
        d0 d0Var = this.f42313b;
        d0Var.getClass();
        d0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f42312a.c();
    }

    @Override
    public final long d() {
        long d = this.f42312a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f42315f;
            if (j3 == Long.MIN_VALUE || d < j3) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void f() {
        h hVar = this.h;
        if (hVar == null) {
            this.f42312a.f();
            return;
        }
        throw hVar;
    }

    @Override
    public final void g(f1 f1Var) {
        e0 e0Var = (e0) f1Var;
        d0 d0Var = this.f42313b;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override
    public final long h(long j3) {
        d[] dVarArr;
        this.d = -9223372036854775807L;
        for (d dVar : this.f42314c) {
            if (dVar != null) {
                dVar.f42310b = false;
            }
        }
        long h = this.f42312a.h(j3);
        long j10 = this.e;
        long j11 = this.f42315f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f42312a.i(j3);
    }

    @Override
    public final void j(d0 d0Var, long j3) {
        this.f42313b = d0Var;
        this.f42312a.j(this, j3);
    }

    @Override
    public final long m() {
        if (a()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long m10 = m();
            if (m10 != -9223372036854775807L) {
                return m10;
            }
            return j3;
        }
        long m11 = this.f42312a.m();
        if (m11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f42315f;
        long max = Math.max(m11, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
        return this.f42312a.n(q0Var);
    }

    @Override
    public final long o(x2.r[] r18, boolean[] r19, u2.d1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.e.o(x2.r[], boolean[], u2.d1[], boolean[], long):long");
    }

    @Override
    public final q1 q() {
        return this.f42312a.q();
    }

    @Override
    public final long r() {
        long r10 = this.f42312a.r();
        if (r10 != Long.MIN_VALUE) {
            long j3 = this.f42315f;
            if (j3 == Long.MIN_VALUE || r10 < j3) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long s(long j3, i2.o1 o1Var) {
        long j10;
        long j11 = this.e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(o1Var.f10319a, 0L, j3 - j11);
        long j12 = o1Var.f10320b;
        long j13 = this.f42315f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != o1Var.f10319a || i11 != o1Var.f10320b) {
            o1Var = new i2.o1(i10, i11);
        }
        return this.f42312a.s(j3, o1Var);
    }

    @Override
    public final void u(long j3) {
        this.f42312a.u(j3);
    }
}
