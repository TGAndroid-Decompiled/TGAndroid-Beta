package u2;
public final class a0 extends q1 {
    public final boolean f47216l;
    public final b2.j1 f47217m;
    public final b2.h1 f47218n;
    public y f47219o;
    public x f47220p;
    public boolean f47221q;
    public boolean f47222r;
    public boolean f47223s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47216l = z11;
        this.f47217m = new b2.j1();
        this.f47218n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f47219o = new y(h, null, null);
            this.f47223s = true;
            return;
        }
        this.f47219o = new y(new z(aVar.i()), b2.j1.f3291q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f47216l) {
            this.f47221q = true;
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
        xVar.d = this.f47391k;
        if (this.f47222r) {
            Object obj = f0Var.f47270a;
            if (this.f47219o.f47461g != null && obj.equals(y.h)) {
                obj = this.f47219o.f47461g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f47220p = xVar;
        if (!this.f47221q) {
            this.f47221q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f47220p;
        int b10 = this.f47219o.b(xVar.f47444a.f47270a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f47219o;
        b2.h1 h1Var = this.f47218n;
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
        return this.f47391k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f47447e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f47447e);
        }
        if (d0Var == this.f47220p) {
            this.f47220p = null;
        }
    }

    @Override
    public final void q() {
        this.f47222r = false;
        this.f47221q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f47223s) {
            y yVar = this.f47219o;
            this.f47219o = new y(new i2.l1(this.f47219o.f47392e, k0Var), yVar.f47460f, yVar.f47461g);
        } else {
            this.f47219o = new y(new z(k0Var), b2.j1.f3291q, y.h);
        }
        this.f47391k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f47270a;
        Object obj2 = this.f47219o.f47461g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
