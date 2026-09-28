package u2;
public final class a0 extends q1 {
    public final boolean f43589l;
    public final b2.j1 f43590m;
    public final b2.h1 f43591n;
    public y f43592o;
    public x f43593p;
    public boolean f43594q;
    public boolean f43595r;
    public boolean f43596s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43589l = z11;
        this.f43590m = new b2.j1();
        this.f43591n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43592o = new y(h, null, null);
            this.f43596s = true;
            return;
        }
        this.f43592o = new y(new z(aVar.i()), b2.j1.f3041q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43589l) {
            this.f43594q = true;
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
        xVar.d = this.f43755k;
        if (this.f43595r) {
            Object obj = f0Var.f43642a;
            if (this.f43592o.f43821g != null && obj.equals(y.h)) {
                obj = this.f43592o.f43821g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f43593p = xVar;
        if (!this.f43594q) {
            this.f43594q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43593p;
        int b10 = this.f43592o.b(xVar.f43813a.f43642a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43592o;
        b2.h1 h1Var = this.f43591n;
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
        return this.f43755k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43593p) {
            this.f43593p = null;
        }
    }

    @Override
    public final void q() {
        this.f43595r = false;
        this.f43594q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43596s) {
            y yVar = this.f43592o;
            this.f43592o = new y(new i2.l1(this.f43592o.e, k0Var), yVar.f43820f, yVar.f43821g);
        } else {
            this.f43592o = new y(new z(k0Var), b2.j1.f3041q, y.h);
        }
        this.f43755k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43642a;
        Object obj2 = this.f43592o.f43821g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
