package u2;
public final class a0 extends p1 {
    public final boolean f43300l;
    public final b2.j1 f43301m;
    public final b2.h1 f43302n;
    public y f43303o;
    public x f43304p;
    public boolean f43305q;
    public boolean f43306r;
    public boolean f43307s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43300l = z11;
        this.f43301m = new b2.j1();
        this.f43302n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43303o = new y(h, null, null);
            this.f43307s = true;
            return;
        }
        this.f43303o = new y(new z(aVar.i()), b2.j1.f3046q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43300l) {
            this.f43305q = true;
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
        xVar.d = this.f43464k;
        if (this.f43306r) {
            Object obj = f0Var.f43353a;
            if (this.f43303o.f43531g != null && obj.equals(y.h)) {
                obj = this.f43303o.f43531g;
            }
            xVar.b(f0Var.a(obj));
            return xVar;
        }
        this.f43304p = xVar;
        if (!this.f43305q) {
            this.f43305q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43304p;
        int b10 = this.f43303o.b(xVar.f43523a.f43353a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43303o;
        b2.h1 h1Var = this.f43302n;
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
        return this.f43464k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43304p) {
            this.f43304p = null;
        }
    }

    @Override
    public final void q() {
        this.f43306r = false;
        this.f43305q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43307s) {
            y yVar = this.f43303o;
            this.f43303o = new y(new i2.k1(this.f43303o.e, k0Var), yVar.f43530f, yVar.f43531g);
        } else {
            this.f43303o = new y(new z(k0Var), b2.j1.f3046q, y.h);
        }
        this.f43464k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43353a;
        Object obj2 = this.f43303o.f43531g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
