package u2;
public final class a0 extends q1 {
    public final boolean f47201l;
    public final b2.j1 f47202m;
    public final b2.h1 f47203n;
    public y f47204o;
    public x f47205p;
    public boolean f47206q;
    public boolean f47207r;
    public boolean f47208s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47201l = z11;
        this.f47202m = new b2.j1();
        this.f47203n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f47204o = new y(h, null, null);
            this.f47208s = true;
            return;
        }
        this.f47204o = new y(new z(aVar.i()), b2.j1.f3291q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f47201l) {
            this.f47206q = true;
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
        xVar.d = this.f47376k;
        if (this.f47207r) {
            Object obj = f0Var.f47255a;
            if (this.f47204o.f47446g != null && obj.equals(y.h)) {
                obj = this.f47204o.f47446g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f47205p = xVar;
        if (!this.f47206q) {
            this.f47206q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f47205p;
        int b10 = this.f47204o.b(xVar.f47429a.f47255a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f47204o;
        b2.h1 h1Var = this.f47203n;
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
        return this.f47376k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f47432e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f47432e);
        }
        if (d0Var == this.f47205p) {
            this.f47205p = null;
        }
    }

    @Override
    public final void q() {
        this.f47207r = false;
        this.f47206q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f47208s) {
            y yVar = this.f47204o;
            this.f47204o = new y(new i2.l1(this.f47204o.f47377e, k0Var), yVar.f47445f, yVar.f47446g);
        } else {
            this.f47204o = new y(new z(k0Var), b2.j1.f3291q, y.h);
        }
        this.f47376k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f47255a;
        Object obj2 = this.f47204o.f47446g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
