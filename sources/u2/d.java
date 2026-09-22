package u2;
public final class d implements d0, c0 {
    public final d0 f43662a;
    public c0 f43663b;
    public c[] f43664c = new c[0];
    public long d;
    public long e;
    public long f43665f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f43662a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.e = j3;
        this.f43665f = j10;
    }

    @Override
    public final void a(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.f43663b;
        c0Var.getClass();
        c0Var.a(this);
    }

    public final boolean b() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        return this.f43662a.c();
    }

    @Override
    public final long d() {
        long d = this.f43662a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f43665f;
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
            this.f43662a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f43664c) {
            if (cVar != null) {
                cVar.f43660b = false;
            }
        }
        long h = this.f43662a.h(j3);
        long j10 = this.e;
        long j11 = this.f43665f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f43662a.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f43663b = c0Var;
        this.f43662a.k(this, j3);
    }

    @Override
    public final void l(e1 e1Var) {
        d0 d0Var = (d0) e1Var;
        c0 c0Var = this.f43663b;
        c0Var.getClass();
        c0Var.l(this);
    }

    @Override
    public final long m() {
        if (b()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long m10 = m();
            if (m10 != -9223372036854775807L) {
                return m10;
            }
            return j3;
        }
        long m11 = this.f43662a.m();
        if (m11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.e;
        long j11 = this.f43665f;
        long max = Math.max(m11, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final boolean q(i2.r0 r0Var) {
        return this.f43662a.q(r0Var);
    }

    @Override
    public final long r(x2.s[] r18, boolean[] r19, u2.c1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.r(x2.s[], boolean[], u2.c1[], boolean[], long):long");
    }

    @Override
    public final p1 s() {
        return this.f43662a.s();
    }

    @Override
    public final long t() {
        long t10 = this.f43662a.t();
        if (t10 != Long.MIN_VALUE) {
            long j3 = this.f43665f;
            if (j3 == Long.MIN_VALUE || t10 < j3) {
                return t10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long u(long j3, i2.p1 p1Var) {
        long j10;
        long j11 = this.e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(p1Var.f10861a, 0L, j3 - j11);
        long j12 = p1Var.f10862b;
        long j13 = this.f43665f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != p1Var.f10861a || i11 != p1Var.f10862b) {
            p1Var = new i2.p1(i10, i11);
        }
        return this.f43662a.u(j3, p1Var);
    }

    @Override
    public final void v(long j3) {
        this.f43662a.v(j3);
    }
}
