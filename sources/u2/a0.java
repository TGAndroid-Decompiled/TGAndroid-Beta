package u2;
public final class a0 extends q1 {
    public final boolean f43588l;
    public final b2.j1 f43589m;
    public final b2.h1 f43590n;
    public y f43591o;
    public x f43592p;
    public boolean f43593q;
    public boolean f43594r;
    public boolean f43595s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43588l = z11;
        this.f43589m = new b2.j1();
        this.f43590n = new b2.h1();
        b2.k1 h = aVar.h();
        if (h != null) {
            this.f43591o = new y(h, null, null);
            this.f43595s = true;
            return;
        }
        this.f43591o = new y(new z(aVar.i()), b2.j1.f3041q, y.h);
    }

    @Override
    public final void A(b2.k1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.k1):void");
    }

    @Override
    public final void C() {
        if (!this.f43588l) {
            this.f43593q = true;
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
        xVar.d = this.f43754k;
        if (this.f43594r) {
            Object obj = f0Var.f43641a;
            if (this.f43591o.f43820g != null && obj.equals(y.h)) {
                obj = this.f43591o.f43820g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f43592p = xVar;
        if (!this.f43593q) {
            this.f43593q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f43592p;
        int b10 = this.f43591o.b(xVar.f43812a.f43641a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f43591o;
        b2.h1 h1Var = this.f43590n;
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
        return this.f43754k.a(k0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f43592p) {
            this.f43592p = null;
        }
    }

    @Override
    public final void q() {
        this.f43594r = false;
        this.f43593q = false;
        super.q();
    }

    @Override
    public final void t(b2.k0 k0Var) {
        if (this.f43595s) {
            y yVar = this.f43591o;
            this.f43591o = new y(new i2.l1(this.f43591o.e, k0Var), yVar.f43819f, yVar.f43820g);
        } else {
            this.f43591o = new y(new z(k0Var), b2.j1.f3041q, y.h);
        }
        this.f43754k.t(k0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f43641a;
        Object obj2 = this.f43591o.f43820g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
