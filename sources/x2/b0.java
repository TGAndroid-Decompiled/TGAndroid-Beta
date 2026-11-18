package x2;

import a8.la;
public final class b0 extends t1 {
    public final boolean f60033l;
    public final e2.k1 f60034m;
    public final e2.i1 f60035n;
    public z f60036o;
    public y f60037p;
    public boolean f60038q;
    public boolean f60039r;
    public boolean f60040s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f60033l = z11;
        this.f60034m = new e2.k1();
        this.f60035n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h != null) {
            this.f60036o = new z(h, null, null);
            this.f60040s = true;
            return;
        }
        this.f60036o = new z(new a0(aVar.i()), e2.k1.f10466q, z.h);
    }

    @Override
    public final void A(e2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: x2.b0.A(e2.l1):void");
    }

    @Override
    public final void C() {
        if (!this.f60033l) {
            this.f60038q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, h6.m mVar, long j3) {
        boolean z10;
        y yVar = new y(g0Var, mVar, j3);
        if (yVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        yVar.d = this.f60236k;
        if (this.f60039r) {
            Object obj = g0Var.f60088a;
            if (this.f60036o.f60298g != null && obj.equals(z.h)) {
                obj = this.f60036o.f60298g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f60037p = yVar;
        if (!this.f60038q) {
            this.f60038q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j3) {
        y yVar = this.f60037p;
        int b10 = this.f60036o.b(yVar.f60280a.f60088a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f60036o;
        e2.i1 i1Var = this.f60035n;
        zVar.f(b10, i1Var, false);
        long j10 = i1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        yVar.h = j3;
        return true;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        return this.f60236k.a(l0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.f60283e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.f60283e);
        }
        if (e0Var == this.f60037p) {
            this.f60037p = null;
        }
    }

    @Override
    public final void q() {
        this.f60039r = false;
        this.f60038q = false;
        super.q();
    }

    @Override
    public final void t(e2.l0 l0Var) {
        q1 q1Var;
        if (this.f60040s) {
            z zVar = this.f60036o;
            e2.l1 l1Var = zVar.f60216e;
            if (l1Var instanceof q1) {
                q1Var = new q1(((q1) l1Var).f60216e, l0Var);
            } else {
                q1Var = new q1(l1Var, l0Var);
            }
            this.f60036o = new z(q1Var, zVar.f60297f, zVar.f60298g);
        } else {
            this.f60036o = new z(new a0(l0Var), e2.k1.f10466q, z.h);
        }
        this.f60236k.t(l0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f60088a;
        Object obj2 = this.f60036o.f60298g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
