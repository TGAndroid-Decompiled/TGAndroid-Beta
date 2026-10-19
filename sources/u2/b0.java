package u2;

import v7.u6;
public final class b0 extends t1 {
    public final boolean f47250l;
    public final b2.n1 f47251m;
    public final b2.l1 f47252n;
    public z f47253o;
    public y f47254p;
    public boolean f47255q;
    public boolean f47256r;
    public boolean f47257s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47250l = z11;
        this.f47251m = new b2.n1();
        this.f47252n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f47253o = new z(h, null, null);
            this.f47257s = true;
            return;
        }
        this.f47253o = new z(new a0(aVar.i()), b2.n1.f3860q, z.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f47250l) {
            this.f47255q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        boolean z10;
        y yVar = new y(g0Var, eVar, j10);
        if (yVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        yVar.d = this.f47436k;
        if (this.f47256r) {
            Object obj = g0Var.f47304a;
            if (this.f47253o.f47493g != null && obj.equals(z.h)) {
                obj = this.f47253o.f47493g;
            }
            yVar.b(g0Var.a(obj));
            return yVar;
        }
        this.f47254p = yVar;
        if (!this.f47255q) {
            this.f47255q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f47254p;
        int b10 = this.f47253o.b(yVar.f47476a.f47304a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f47253o;
        b2.l1 l1Var = this.f47252n;
        zVar.f(b10, l1Var, false);
        long j11 = l1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        return this.f47436k.a(o0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f47254p) {
            this.f47254p = null;
        }
    }

    @Override
    public final void q() {
        this.f47256r = false;
        this.f47255q = false;
        super.q();
    }

    @Override
    public final void t(b2.o0 o0Var) {
        q1 q1Var;
        if (this.f47257s) {
            z zVar = this.f47253o;
            b2.o1 o1Var = zVar.e;
            if (o1Var instanceof q1) {
                q1Var = new q1(((q1) o1Var).e, o0Var);
            } else {
                q1Var = new q1(o1Var, o0Var);
            }
            this.f47253o = new z(q1Var, zVar.f47492f, zVar.f47493g);
        } else {
            this.f47253o = new z(new a0(o0Var), b2.n1.f3860q, z.h);
        }
        this.f47436k.t(o0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f47304a;
        Object obj2 = this.f47253o.f47493g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
