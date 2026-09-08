package u2;
public final class d implements d0, c0 {
    public final d0 f46678a;
    public c0 f46679b;
    public c[] f46680c = new c[0];
    public long d;
    public long f46681e;
    public long f46682f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f46678a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f46681e = j3;
        this.f46682f = j10;
    }

    @Override
    public final void a(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.f46679b;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final void b(d1 d1Var) {
        d0 d0Var = (d0) d1Var;
        c0 c0Var = this.f46679b;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f46678a.c();
    }

    @Override
    public final long d() {
        long d = this.f46678a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f46682f;
            if (j3 == Long.MIN_VALUE || d < j3) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean e() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void j() {
        g gVar = this.h;
        if (gVar == null) {
            this.f46678a.j();
            return;
        }
        throw gVar;
    }

    @Override
    public final long k(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f46680c) {
            if (cVar != null) {
                cVar.f46676b = false;
            }
        }
        long k10 = this.f46678a.k(j3);
        long j10 = this.f46681e;
        long j11 = this.f46682f;
        long max = Math.max(k10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void l(long j3) {
        this.f46678a.l(j3);
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        this.f46679b = c0Var;
        this.f46678a.n(this, j3);
    }

    @Override
    public final long o() {
        if (e()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long o9 = o();
            if (o9 != -9223372036854775807L) {
                return o9;
            }
            return j3;
        }
        long o10 = this.f46678a.o();
        if (o10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f46681e;
        long j11 = this.f46682f;
        long max = Math.max(o10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        return this.f46678a.p(r0Var);
    }

    @Override
    public final long q(x2.r[] r18, boolean[] r19, u2.b1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.q(x2.r[], boolean[], u2.b1[], boolean[], long):long");
    }

    @Override
    public final o1 r() {
        return this.f46678a.r();
    }

    @Override
    public final long s() {
        long s10 = this.f46678a.s();
        if (s10 != Long.MIN_VALUE) {
            long j3 = this.f46682f;
            if (j3 == Long.MIN_VALUE || s10 < j3) {
                return s10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        long j10;
        long j11 = this.f46681e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(p1Var.f11723a, 0L, j3 - j11);
        long j12 = p1Var.f11724b;
        long j13 = this.f46682f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != p1Var.f11723a || i11 != p1Var.f11724b) {
            p1Var = new i2.p1(i10, i11);
        }
        return this.f46678a.t(j3, p1Var);
    }

    @Override
    public final void u(long j3) {
        this.f46678a.u(j3);
    }
}
