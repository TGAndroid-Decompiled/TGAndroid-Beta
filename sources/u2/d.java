package u2;

import i2.q1;
public final class d implements d0, c0 {
    public final d0 f48771a;
    public c0 f48772b;
    public c[] f48773c = new c[0];
    public long d;
    public long f48774e;
    public long f48775f;
    public g h;

    public d(d0 d0Var, boolean z10, long j3, long j10) {
        long j11;
        this.f48771a = d0Var;
        if (z10) {
            j11 = j3;
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        this.f48774e = j3;
        this.f48775f = j10;
    }

    @Override
    public final void a(d0 d0Var) {
        if (this.h != null) {
            return;
        }
        c0 c0Var = this.f48772b;
        c0Var.getClass();
        c0Var.a(this);
    }

    @Override
    public final void b(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        c0 c0Var = this.f48772b;
        c0Var.getClass();
        c0Var.b(this);
    }

    @Override
    public final boolean c() {
        return this.f48771a.c();
    }

    @Override
    public final long d() {
        long d = this.f48771a.d();
        if (d != Long.MIN_VALUE) {
            long j3 = this.f48775f;
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
    public final void g() {
        g gVar = this.h;
        if (gVar == null) {
            this.f48771a.g();
            return;
        }
        throw gVar;
    }

    @Override
    public final long h(long j3) {
        c[] cVarArr;
        this.d = -9223372036854775807L;
        for (c cVar : this.f48773c) {
            if (cVar != null) {
                cVar.f48769b = false;
            }
        }
        long h = this.f48771a.h(j3);
        long j10 = this.f48774e;
        long j11 = this.f48775f;
        long max = Math.max(h, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final void i(long j3) {
        this.f48771a.i(j3);
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        this.f48772b = c0Var;
        this.f48771a.k(this, j3);
    }

    @Override
    public final long l() {
        if (e()) {
            long j3 = this.d;
            this.d = -9223372036854775807L;
            long l4 = l();
            if (l4 != -9223372036854775807L) {
                return l4;
            }
            return j3;
        }
        long l10 = this.f48771a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f48774e;
        long j11 = this.f48775f;
        long max = Math.max(l10, j10);
        if (j11 != Long.MIN_VALUE) {
            return Math.min(max, j11);
        }
        return max;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        return this.f48771a.m(s0Var);
    }

    @Override
    public final long n(x2.r[] r18, boolean[] r19, u2.a1[] r20, boolean[] r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: u2.d.n(x2.r[], boolean[], u2.a1[], boolean[], long):long");
    }

    @Override
    public final n1 o() {
        return this.f48771a.o();
    }

    @Override
    public final long p() {
        long p5 = this.f48771a.p();
        if (p5 != Long.MIN_VALUE) {
            long j3 = this.f48775f;
            if (j3 == Long.MIN_VALUE || p5 < j3) {
                return p5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long q(long j3, q1 q1Var) {
        long j10;
        long j11 = this.f48774e;
        if (j3 == j11) {
            return j11;
        }
        long i10 = e2.d0.i(q1Var.f11872a, 0L, j3 - j11);
        long j12 = q1Var.f11873b;
        long j13 = this.f48775f;
        if (j13 == Long.MIN_VALUE) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = j13 - j3;
        }
        long i11 = e2.d0.i(j12, 0L, j10);
        if (i10 != q1Var.f11872a || i11 != q1Var.f11873b) {
            q1Var = new q1(i10, i11);
        }
        return this.f48771a.q(j3, q1Var);
    }

    @Override
    public final void r(long j3) {
        this.f48771a.r(j3);
    }
}
