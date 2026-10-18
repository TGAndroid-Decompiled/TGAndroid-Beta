package u2;

import v7.u6;
public final class a0 extends s1 {
    public final boolean f47296l;
    public final b2.n1 f47297m;
    public final b2.l1 f47298n;
    public y f47299o;
    public x f47300p;
    public boolean f47301q;
    public boolean f47302r;
    public boolean f47303s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47296l = z11;
        this.f47297m = new b2.n1();
        this.f47298n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f47299o = new y(h, null, null);
            this.f47303s = true;
            return;
        }
        this.f47299o = new y(new z(aVar.i()), b2.n1.f3862q, y.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f47296l) {
            this.f47301q = true;
            B();
        }
    }

    @Override
    public final x c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        boolean z10;
        x xVar = new x(f0Var, eVar, j10);
        if (xVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        xVar.d = this.f47479k;
        if (this.f47302r) {
            Object obj = f0Var.f47347a;
            if (this.f47299o.f47536g != null && obj.equals(y.h)) {
                obj = this.f47299o.f47536g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f47300p = xVar;
        if (!this.f47301q) {
            this.f47301q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j10) {
        x xVar = this.f47300p;
        int b10 = this.f47299o.b(xVar.f47519a.f47347a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f47299o;
        b2.l1 l1Var = this.f47298n;
        yVar.f(b10, l1Var, false);
        long j11 = l1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        xVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        return this.f47479k.a(o0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.e);
        }
        if (d0Var == this.f47300p) {
            this.f47300p = null;
        }
    }

    @Override
    public final void q() {
        this.f47302r = false;
        this.f47301q = false;
        super.q();
    }

    @Override
    public final void t(b2.o0 o0Var) {
        p1 p1Var;
        if (this.f47303s) {
            y yVar = this.f47299o;
            b2.o1 o1Var = yVar.e;
            if (o1Var instanceof p1) {
                p1Var = new p1(((p1) o1Var).e, o0Var);
            } else {
                p1Var = new p1(o1Var, o0Var);
            }
            this.f47299o = new y(p1Var, yVar.f47535f, yVar.f47536g);
        } else {
            this.f47299o = new y(new z(o0Var), b2.n1.f3862q, y.h);
        }
        this.f47479k.t(o0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f47347a;
        Object obj2 = this.f47299o.f47536g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
