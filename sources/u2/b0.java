package u2;

import a8.yb;
public final class b0 extends t1 {
    public final boolean f49281l;
    public final b2.o1 f49282m;
    public final b2.m1 f49283n;
    public z f49284o;
    public y f49285p;
    public boolean f49286q;
    public boolean f49287r;
    public boolean f49288s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49281l = z11;
        this.f49282m = new b2.o1();
        this.f49283n = new b2.m1();
        b2.p1 h = aVar.h();
        if (h != null) {
            this.f49284o = new z(h, null, null);
            this.f49288s = true;
            return;
        }
        this.f49284o = new z(new a0(aVar.i()), b2.o1.f3316q, z.h);
    }

    @Override
    public final void A(b2.p1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.p1):void");
    }

    @Override
    public final void C() {
        if (!this.f49281l) {
            this.f49286q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, a8.h0 h0Var, long j10) {
        boolean z10;
        y yVar = new y(g0Var, h0Var, j10);
        if (yVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        yVar.d = this.f49469k;
        if (this.f49287r) {
            Object obj = g0Var.f49332a;
            if (this.f49284o.f49526g != null && obj.equals(z.h)) {
                obj = this.f49284o.f49526g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f49285p = yVar;
        if (!this.f49286q) {
            this.f49286q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f49285p;
        int b10 = this.f49284o.b(yVar.f49509a.f49332a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f49284o;
        b2.m1 m1Var = this.f49283n;
        zVar.f(b10, m1Var, false);
        long j11 = m1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        return this.f49469k.a(p0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f49285p) {
            this.f49285p = null;
        }
    }

    @Override
    public final void q() {
        this.f49287r = false;
        this.f49286q = false;
        super.q();
    }

    @Override
    public final void t(b2.p0 p0Var) {
        q1 q1Var;
        if (this.f49288s) {
            z zVar = this.f49284o;
            b2.p1 p1Var = zVar.e;
            if (p1Var instanceof q1) {
                q1Var = new q1(((q1) p1Var).e, p0Var);
            } else {
                q1Var = new q1(p1Var, p0Var);
            }
            this.f49284o = new z(q1Var, zVar.f49525f, zVar.f49526g);
        } else {
            this.f49284o = new z(new a0(p0Var), b2.o1.f3316q, z.h);
        }
        this.f49469k.t(p0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f49332a;
        Object obj2 = this.f49284o.f49526g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
