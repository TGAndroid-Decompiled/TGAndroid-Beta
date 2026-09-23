package u2;
public final class a0 extends o1 {
    public final boolean f43255l;
    public final b2.j1 f43256m;
    public final b2.h1 f43257n;
    public y f43258o;
    public x f43259p;
    public boolean f43260q;
    public boolean f43261r;
    public boolean f43262s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43255l = z11;
        this.f43256m = new b2.j1();
        this.f43257n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43258o = new y(h, null, null);
            this.f43262s = true;
            return;
        }
        this.f43258o = new y(new z(aVar.i()), b2.j1.f3041q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43255l) {
            this.f43260q = true;
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
        xVar.d = this.f43388k;
        if (this.f43261r) {
            Object obj = f0Var.f43287a;
            if (this.f43258o.f43463g != null && obj.equals(y.h)) {
                obj = this.f43258o.f43463g;
            }
            xVar.b(f0Var.a(obj));
            return xVar;
        }
        this.f43259p = xVar;
        if (!this.f43260q) {
            this.f43260q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43259p;
        int b10 = this.f43258o.b(xVar.f43456a.f43287a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43258o;
        b2.h1 h1Var = this.f43257n;
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
        return this.f43388k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43259p) {
            this.f43259p = null;
        }
    }

    @Override
    public final void q() {
        this.f43261r = false;
        this.f43260q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43262s) {
            y yVar = this.f43258o;
            this.f43258o = new y(new i2.l1(this.f43258o.e, k0Var), yVar.f43462f, yVar.f43463g);
        } else {
            this.f43258o = new y(new z(k0Var), b2.j1.f3041q, y.h);
        }
        this.f43388k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43287a;
        Object obj2 = this.f43258o.f43463g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
