package u2;
public final class a0 extends p1 {
    public final boolean f46638l;
    public final b2.j1 f46639m;
    public final b2.h1 f46640n;
    public y f46641o;
    public x f46642p;
    public boolean f46643q;
    public boolean f46644r;
    public boolean f46645s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46638l = z11;
        this.f46639m = new b2.j1();
        this.f46640n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f46641o = new y(h, null, null);
            this.f46645s = true;
            return;
        }
        this.f46641o = new y(new z(aVar.i()), b2.j1.f2124q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f46638l) {
            this.f46643q = true;
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
        xVar.d = this.f46813k;
        if (this.f46644r) {
            Object obj = f0Var.f46695a;
            if (this.f46641o.f46886g != null && obj.equals(y.h)) {
                obj = this.f46641o.f46886g;
            }
            xVar.e(f0Var.a(obj));
            return xVar;
        }
        this.f46642p = xVar;
        if (!this.f46643q) {
            this.f46643q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f46642p;
        int b10 = this.f46641o.b(xVar.f46877a.f46695a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f46641o;
        b2.h1 h1Var = this.f46640n;
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
        return this.f46813k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f46880e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f46880e);
        }
        if (d0Var == this.f46642p) {
            this.f46642p = null;
        }
    }

    @Override
    public final void q() {
        this.f46644r = false;
        this.f46643q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f46645s) {
            y yVar = this.f46641o;
            this.f46641o = new y(new i2.k1(this.f46641o.f46815e, k0Var), yVar.f46885f, yVar.f46886g);
        } else {
            this.f46641o = new y(new z(k0Var), b2.j1.f2124q, y.h);
        }
        this.f46813k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f46695a;
        Object obj2 = this.f46641o.f46886g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
