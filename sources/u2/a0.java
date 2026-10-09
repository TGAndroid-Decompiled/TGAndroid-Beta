package u2;
public final class a0 extends p1 {
    public final boolean f48513l;
    public final b2.j1 f48514m;
    public final b2.h1 f48515n;
    public y f48516o;
    public x f48517p;
    public boolean f48518q;
    public boolean f48519r;
    public boolean f48520s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f48513l = z11;
        this.f48514m = new b2.j1();
        this.f48515n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f48516o = new y(h, null, null);
            this.f48520s = true;
            return;
        }
        this.f48516o = new y(new z(aVar.i()), b2.j1.f3370q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f48513l) {
            this.f48518q = true;
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
        xVar.d = this.f48687k;
        if (this.f48519r) {
            Object obj = f0Var.f48570a;
            if (this.f48516o.f48760g != null && obj.equals(y.h)) {
                obj = this.f48516o.f48760g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f48517p = xVar;
        if (!this.f48518q) {
            this.f48518q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f48517p;
        int b10 = this.f48516o.b(xVar.f48751a.f48570a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f48516o;
        b2.h1 h1Var = this.f48515n;
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
        return this.f48687k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f48754e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f48754e);
        }
        if (d0Var == this.f48517p) {
            this.f48517p = null;
        }
    }

    @Override
    public final void q() {
        this.f48519r = false;
        this.f48518q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f48520s) {
            y yVar = this.f48516o;
            this.f48516o = new y(new i2.l1(this.f48516o.f48689e, k0Var), yVar.f48759f, yVar.f48760g);
        } else {
            this.f48516o = new y(new z(k0Var), b2.j1.f3370q, y.h);
        }
        this.f48687k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f48570a;
        Object obj2 = this.f48516o.f48760g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
