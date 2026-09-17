package u2;
public final class a0 extends p1 {
    public final boolean f46639l;
    public final b2.j1 f46640m;
    public final b2.h1 f46641n;
    public y f46642o;
    public x f46643p;
    public boolean f46644q;
    public boolean f46645r;
    public boolean f46646s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46639l = z11;
        this.f46640m = new b2.j1();
        this.f46641n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f46642o = new y(h, null, null);
            this.f46646s = true;
            return;
        }
        this.f46642o = new y(new z(aVar.i()), b2.j1.f2124q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f46639l) {
            this.f46644q = true;
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
        xVar.d = this.f46814k;
        if (this.f46645r) {
            Object obj = f0Var.f46696a;
            if (this.f46642o.f46887g != null && obj.equals(y.h)) {
                obj = this.f46642o.f46887g;
            }
            xVar.e(f0Var.a(obj));
            return xVar;
        }
        this.f46643p = xVar;
        if (!this.f46644q) {
            this.f46644q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f46643p;
        int b10 = this.f46642o.b(xVar.f46878a.f46696a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f46642o;
        b2.h1 h1Var = this.f46641n;
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
        return this.f46814k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f46881e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f46881e);
        }
        if (d0Var == this.f46643p) {
            this.f46643p = null;
        }
    }

    @Override
    public final void q() {
        this.f46645r = false;
        this.f46644q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f46646s) {
            y yVar = this.f46642o;
            this.f46642o = new y(new i2.k1(this.f46642o.f46816e, k0Var), yVar.f46886f, yVar.f46887g);
        } else {
            this.f46642o = new y(new z(k0Var), b2.j1.f2124q, y.h);
        }
        this.f46814k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f46696a;
        Object obj2 = this.f46642o.f46887g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
