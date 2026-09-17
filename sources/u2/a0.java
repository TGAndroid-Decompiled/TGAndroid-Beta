package u2;
public final class a0 extends p1 {
    public final boolean f46611l;
    public final b2.j1 f46612m;
    public final b2.h1 f46613n;
    public y f46614o;
    public x f46615p;
    public boolean f46616q;
    public boolean f46617r;
    public boolean f46618s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46611l = z11;
        this.f46612m = new b2.j1();
        this.f46613n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f46614o = new y(h, null, null);
            this.f46618s = true;
            return;
        }
        this.f46614o = new y(new z(aVar.i()), b2.j1.f2097q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f46611l) {
            this.f46616q = true;
            B();
        }
    }

    @Override
    public final x c(f0 f0Var, y2.d dVar, long j3) {
        boolean z10;
        x xVar = new x(f0Var, dVar, j3);
        if (xVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        xVar.d = this.f46786k;
        if (this.f46617r) {
            Object obj = f0Var.f46668a;
            if (this.f46614o.f46859g != null && obj.equals(y.h)) {
                obj = this.f46614o.f46859g;
            }
            xVar.e(f0Var.a(obj));
            return xVar;
        }
        this.f46615p = xVar;
        if (!this.f46616q) {
            this.f46616q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f46615p;
        int b10 = this.f46614o.b(xVar.f46850a.f46668a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f46614o;
        b2.h1 h1Var = this.f46613n;
        yVar.f(b10, h1Var, false);
        long j10 = h1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        xVar.h = j3;
        return true;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        return this.f46786k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f46853e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f46853e);
        }
        if (d0Var == this.f46615p) {
            this.f46615p = null;
        }
    }

    @Override
    public final void q() {
        this.f46617r = false;
        this.f46616q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f46618s) {
            y yVar = this.f46614o;
            this.f46614o = new y(new i2.k1(this.f46614o.f46788e, k0Var), yVar.f46858f, yVar.f46859g);
        } else {
            this.f46614o = new y(new z(k0Var), b2.j1.f2097q, y.h);
        }
        this.f46786k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f46668a;
        Object obj2 = this.f46614o.f46859g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
