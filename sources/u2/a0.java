package u2;
public final class a0 extends q1 {
    public final boolean f43574l;
    public final b2.j1 f43575m;
    public final b2.h1 f43576n;
    public y f43577o;
    public x f43578p;
    public boolean f43579q;
    public boolean f43580r;
    public boolean f43581s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43574l = z11;
        this.f43575m = new b2.j1();
        this.f43576n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43577o = new y(h, null, null);
            this.f43581s = true;
            return;
        }
        this.f43577o = new y(new z(aVar.i()), b2.j1.f3041q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43574l) {
            this.f43579q = true;
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
        xVar.d = this.f43740k;
        if (this.f43580r) {
            Object obj = f0Var.f43627a;
            if (this.f43577o.f43806g != null && obj.equals(y.h)) {
                obj = this.f43577o.f43806g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f43578p = xVar;
        if (!this.f43579q) {
            this.f43579q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43578p;
        int b10 = this.f43577o.b(xVar.f43798a.f43627a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43577o;
        b2.h1 h1Var = this.f43576n;
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
        return this.f43740k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43578p) {
            this.f43578p = null;
        }
    }

    @Override
    public final void q() {
        this.f43580r = false;
        this.f43579q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43581s) {
            y yVar = this.f43577o;
            this.f43577o = new y(new i2.l1(this.f43577o.e, k0Var), yVar.f43805f, yVar.f43806g);
        } else {
            this.f43577o = new y(new z(k0Var), b2.j1.f3041q, y.h);
        }
        this.f43740k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43627a;
        Object obj2 = this.f43577o.f43806g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
