package u2;
public final class a0 extends p1 {
    public final boolean f48515l;
    public final b2.j1 f48516m;
    public final b2.h1 f48517n;
    public y f48518o;
    public x f48519p;
    public boolean f48520q;
    public boolean f48521r;
    public boolean f48522s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f48515l = z11;
        this.f48516m = new b2.j1();
        this.f48517n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f48518o = new y(h, null, null);
            this.f48522s = true;
            return;
        }
        this.f48518o = new y(new z(aVar.i()), b2.j1.f3370q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f48515l) {
            this.f48520q = true;
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
        xVar.d = this.f48689k;
        if (this.f48521r) {
            Object obj = f0Var.f48572a;
            if (this.f48518o.f48762g != null && obj.equals(y.h)) {
                obj = this.f48518o.f48762g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f48519p = xVar;
        if (!this.f48520q) {
            this.f48520q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f48519p;
        int b10 = this.f48518o.b(xVar.f48753a.f48572a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f48518o;
        b2.h1 h1Var = this.f48517n;
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
        return this.f48689k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f48756e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f48756e);
        }
        if (d0Var == this.f48519p) {
            this.f48519p = null;
        }
    }

    @Override
    public final void q() {
        this.f48521r = false;
        this.f48520q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f48522s) {
            y yVar = this.f48518o;
            this.f48518o = new y(new i2.l1(this.f48518o.f48691e, k0Var), yVar.f48761f, yVar.f48762g);
        } else {
            this.f48518o = new y(new z(k0Var), b2.j1.f3370q, y.h);
        }
        this.f48689k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f48572a;
        Object obj2 = this.f48518o.f48762g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
