package u2;
public final class a0 extends p1 {
    public final boolean f48559l;
    public final b2.j1 f48560m;
    public final b2.h1 f48561n;
    public y f48562o;
    public x f48563p;
    public boolean f48564q;
    public boolean f48565r;
    public boolean f48566s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f48559l = z11;
        this.f48560m = new b2.j1();
        this.f48561n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f48562o = new y(h, null, null);
            this.f48566s = true;
            return;
        }
        this.f48562o = new y(new z(aVar.i()), b2.j1.f3370q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f48559l) {
            this.f48564q = true;
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
        xVar.d = this.f48733k;
        if (this.f48565r) {
            Object obj = f0Var.f48616a;
            if (this.f48562o.f48806g != null && obj.equals(y.h)) {
                obj = this.f48562o.f48806g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f48563p = xVar;
        if (!this.f48564q) {
            this.f48564q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f48563p;
        int b10 = this.f48562o.b(xVar.f48797a.f48616a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f48562o;
        b2.h1 h1Var = this.f48561n;
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
        return this.f48733k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f48800e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f48800e);
        }
        if (d0Var == this.f48563p) {
            this.f48563p = null;
        }
    }

    @Override
    public final void q() {
        this.f48565r = false;
        this.f48564q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f48566s) {
            y yVar = this.f48562o;
            this.f48562o = new y(new i2.l1(this.f48562o.f48735e, k0Var), yVar.f48805f, yVar.f48806g);
        } else {
            this.f48562o = new y(new z(k0Var), b2.j1.f3370q, y.h);
        }
        this.f48733k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f48616a;
        Object obj2 = this.f48562o.f48806g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
