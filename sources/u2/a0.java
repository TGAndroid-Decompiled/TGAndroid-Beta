package u2;
public final class a0 extends q1 {
    public final boolean f43624l;
    public final b2.j1 f43625m;
    public final b2.h1 f43626n;
    public y f43627o;
    public x f43628p;
    public boolean f43629q;
    public boolean f43630r;
    public boolean f43631s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43624l = z11;
        this.f43625m = new b2.j1();
        this.f43626n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43627o = new y(h, null, null);
            this.f43631s = true;
            return;
        }
        this.f43627o = new y(new z(aVar.i()), b2.j1.f3048q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43624l) {
            this.f43629q = true;
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
        xVar.d = this.f43791k;
        if (this.f43630r) {
            Object obj = f0Var.f43674a;
            if (this.f43627o.f43855g != null && obj.equals(y.h)) {
                obj = this.f43627o.f43855g;
            }
            xVar.b(f0Var.a(obj));
            return xVar;
        }
        this.f43628p = xVar;
        if (!this.f43629q) {
            this.f43629q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43628p;
        int b10 = this.f43627o.b(xVar.f43839a.f43674a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43627o;
        b2.h1 h1Var = this.f43626n;
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
        return this.f43791k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43628p) {
            this.f43628p = null;
        }
    }

    @Override
    public final void q() {
        this.f43630r = false;
        this.f43629q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43631s) {
            y yVar = this.f43627o;
            this.f43627o = new y(new i2.k1(this.f43627o.e, k0Var), yVar.f43854f, yVar.f43855g);
        } else {
            this.f43627o = new y(new z(k0Var), b2.j1.f3048q, y.h);
        }
        this.f43791k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43674a;
        Object obj2 = this.f43627o.f43855g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
