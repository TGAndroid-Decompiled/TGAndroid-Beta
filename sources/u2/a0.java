package u2;
public final class a0 extends p1 {
    public final boolean f46610l;
    public final b2.j1 f46611m;
    public final b2.h1 f46612n;
    public y f46613o;
    public x f46614p;
    public boolean f46615q;
    public boolean f46616r;
    public boolean f46617s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46610l = z11;
        this.f46611m = new b2.j1();
        this.f46612n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f46613o = new y(h, null, null);
            this.f46617s = true;
            return;
        }
        this.f46613o = new y(new z(aVar.i()), b2.j1.f2097q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f46610l) {
            this.f46615q = true;
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
        xVar.d = this.f46785k;
        if (this.f46616r) {
            Object obj = f0Var.f46667a;
            if (this.f46613o.f46858g != null && obj.equals(y.h)) {
                obj = this.f46613o.f46858g;
            }
            xVar.e(f0Var.a(obj));
            return xVar;
        }
        this.f46614p = xVar;
        if (!this.f46615q) {
            this.f46615q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f46614p;
        int b10 = this.f46613o.b(xVar.f46849a.f46667a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f46613o;
        b2.h1 h1Var = this.f46612n;
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
        return this.f46785k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f46852e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f46852e);
        }
        if (d0Var == this.f46614p) {
            this.f46614p = null;
        }
    }

    @Override
    public final void q() {
        this.f46616r = false;
        this.f46615q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f46617s) {
            y yVar = this.f46613o;
            this.f46613o = new y(new i2.k1(this.f46613o.f46787e, k0Var), yVar.f46857f, yVar.f46858g);
        } else {
            this.f46613o = new y(new z(k0Var), b2.j1.f2097q, y.h);
        }
        this.f46785k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f46667a;
        Object obj2 = this.f46613o.f46858g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
