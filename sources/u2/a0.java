package u2;
public final class a0 extends q1 {
    public final boolean f47200l;
    public final b2.j1 f47201m;
    public final b2.h1 f47202n;
    public y f47203o;
    public x f47204p;
    public boolean f47205q;
    public boolean f47206r;
    public boolean f47207s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47200l = z11;
        this.f47201m = new b2.j1();
        this.f47202n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f47203o = new y(h, null, null);
            this.f47207s = true;
            return;
        }
        this.f47203o = new y(new z(aVar.i()), b2.j1.f3291q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f47200l) {
            this.f47205q = true;
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
        xVar.d = this.f47375k;
        if (this.f47206r) {
            Object obj = f0Var.f47254a;
            if (this.f47203o.f47445g != null && obj.equals(y.h)) {
                obj = this.f47203o.f47445g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f47204p = xVar;
        if (!this.f47205q) {
            this.f47205q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f47204p;
        int b10 = this.f47203o.b(xVar.f47428a.f47254a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f47203o;
        b2.h1 h1Var = this.f47202n;
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
        return this.f47375k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f47431e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f47431e);
        }
        if (d0Var == this.f47204p) {
            this.f47204p = null;
        }
    }

    @Override
    public final void q() {
        this.f47206r = false;
        this.f47205q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f47207s) {
            y yVar = this.f47203o;
            this.f47203o = new y(new i2.l1(this.f47203o.f47376e, k0Var), yVar.f47444f, yVar.f47445g);
        } else {
            this.f47203o = new y(new z(k0Var), b2.j1.f3291q, y.h);
        }
        this.f47375k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f47254a;
        Object obj2 = this.f47203o.f47445g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
