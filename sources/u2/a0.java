package u2;
public final class a0 extends q1 {
    public final boolean f43696l;
    public final b2.j1 f43697m;
    public final b2.h1 f43698n;
    public y f43699o;
    public x f43700p;
    public boolean f43701q;
    public boolean f43702r;
    public boolean f43703s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43696l = z11;
        this.f43697m = new b2.j1();
        this.f43698n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43699o = new y(h, null, null);
            this.f43703s = true;
            return;
        }
        this.f43699o = new y(new z(aVar.i()), b2.j1.f3048q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43696l) {
            this.f43701q = true;
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
        xVar.d = this.f43862k;
        if (this.f43702r) {
            Object obj = f0Var.f43749a;
            if (this.f43699o.f43928g != null && obj.equals(y.h)) {
                obj = this.f43699o.f43928g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f43700p = xVar;
        if (!this.f43701q) {
            this.f43701q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43700p;
        int b10 = this.f43699o.b(xVar.f43920a.f43749a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43699o;
        b2.h1 h1Var = this.f43698n;
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
        return this.f43862k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43700p) {
            this.f43700p = null;
        }
    }

    @Override
    public final void q() {
        this.f43702r = false;
        this.f43701q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43703s) {
            y yVar = this.f43699o;
            this.f43699o = new y(new i2.l1(this.f43699o.e, k0Var), yVar.f43927f, yVar.f43928g);
        } else {
            this.f43699o = new y(new z(k0Var), b2.j1.f3048q, y.h);
        }
        this.f43862k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43749a;
        Object obj2 = this.f43699o.f43928g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
