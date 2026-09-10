package u2;
public final class b0 extends r1 {
    public final boolean f42273l;
    public final b2.j1 f42274m;
    public final b2.h1 f42275n;
    public z f42276o;
    public y f42277p;
    public boolean f42278q;
    public boolean f42279r;
    public boolean f42280s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42273l = z11;
        this.f42274m = new b2.j1();
        this.f42275n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f42276o = new z(h, null, null);
            this.f42280s = true;
            return;
        }
        this.f42276o = new z(new a0(aVar.i()), b2.j1.f1742q, z.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f42273l) {
            this.f42278q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, y2.d dVar, long j3) {
        boolean z10;
        y yVar = new y(g0Var, dVar, j3);
        if (yVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        yVar.d = this.f42441k;
        if (this.f42279r) {
            Object obj = g0Var.f42324a;
            if (this.f42276o.f42505g != null && obj.equals(z.h)) {
                obj = this.f42276o.f42505g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f42277p = yVar;
        if (!this.f42278q) {
            this.f42278q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j3) {
        y yVar = this.f42277p;
        int b10 = this.f42276o.b(yVar.f42489a.f42324a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f42276o;
        b2.h1 h1Var = this.f42275n;
        zVar.f(b10, h1Var, false);
        long j10 = h1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        yVar.h = j3;
        return true;
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        return this.f42441k.a(k0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f42277p) {
            this.f42277p = null;
        }
    }

    @Override
    public final void q() {
        this.f42279r = false;
        this.f42278q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f42280s) {
            z zVar = this.f42276o;
            this.f42276o = new z(new i2.j1(this.f42276o.e, k0Var), zVar.f42504f, zVar.f42505g);
        } else {
            this.f42276o = new z(new a0(k0Var), b2.j1.f1742q, z.h);
        }
        this.f42441k.t(k0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f42324a;
        Object obj2 = this.f42276o.f42505g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
