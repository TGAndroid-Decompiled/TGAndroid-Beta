package u2;

import a8.yb;
public final class b0 extends t1 {
    public final boolean f49246l;
    public final b2.o1 f49247m;
    public final b2.m1 f49248n;
    public z f49249o;
    public y f49250p;
    public boolean f49251q;
    public boolean f49252r;
    public boolean f49253s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49246l = z11;
        this.f49247m = new b2.o1();
        this.f49248n = new b2.m1();
        b2.p1 h = aVar.h();
        if (h != null) {
            this.f49249o = new z(h, null, null);
            this.f49253s = true;
            return;
        }
        this.f49249o = new z(new a0(aVar.i()), b2.o1.f3316q, z.h);
    }

    @Override
    public final void A(b2.p1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.p1):void");
    }

    @Override
    public final void C() {
        if (!this.f49246l) {
            this.f49251q = true;
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
        yVar.d = this.f49434k;
        if (this.f49252r) {
            Object obj = g0Var.f49297a;
            if (this.f49249o.f49491g != null && obj.equals(z.h)) {
                obj = this.f49249o.f49491g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f49250p = yVar;
        if (!this.f49251q) {
            this.f49251q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f49250p;
        int b10 = this.f49249o.b(yVar.f49474a.f49297a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f49249o;
        b2.m1 m1Var = this.f49248n;
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
        return this.f49434k.a(p0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f49250p) {
            this.f49250p = null;
        }
    }

    @Override
    public final void q() {
        this.f49252r = false;
        this.f49251q = false;
        super.q();
    }

    @Override
    public final void t(b2.p0 p0Var) {
        q1 q1Var;
        if (this.f49253s) {
            z zVar = this.f49249o;
            b2.p1 p1Var = zVar.e;
            if (p1Var instanceof q1) {
                q1Var = new q1(((q1) p1Var).e, p0Var);
            } else {
                q1Var = new q1(p1Var, p0Var);
            }
            this.f49249o = new z(q1Var, zVar.f49490f, zVar.f49491g);
        } else {
            this.f49249o = new z(new a0(p0Var), b2.o1.f3316q, z.h);
        }
        this.f49434k.t(p0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f49297a;
        Object obj2 = this.f49249o.f49491g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
