package x2;

import a8.ja;
public final class a0 extends s1 {
    public final boolean f59465l;
    public final e2.k1 f59466m;
    public final e2.i1 f59467n;
    public y f59468o;
    public x f59469p;
    public boolean f59470q;
    public boolean f59471r;
    public boolean f59472s;

    public a0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f59465l = z11;
        this.f59466m = new e2.k1();
        this.f59467n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h != null) {
            this.f59468o = new y(h, null, null);
            this.f59472s = true;
            return;
        }
        this.f59468o = new y(new z(aVar.i()), e2.k1.f10151q, y.h);
    }

    @Override
    public final void A(e2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: x2.a0.A(e2.l1):void");
    }

    @Override
    public final void C() {
        if (!this.f59465l) {
            this.f59470q = true;
            B();
        }
    }

    @Override
    public final x c(f0 f0Var, h6.m mVar, long j3) {
        boolean z10;
        x xVar = new x(f0Var, mVar, j3);
        if (xVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        xVar.d = this.f59663k;
        if (this.f59471r) {
            Object obj = f0Var.f59523a;
            if (this.f59468o.f59725g != null && obj.equals(y.h)) {
                obj = this.f59468o.f59725g;
            }
            xVar.a(f0Var.a(obj));
            return xVar;
        }
        this.f59469p = xVar;
        if (!this.f59470q) {
            this.f59470q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f59469p;
        int b10 = this.f59468o.b(xVar.f59707a.f59523a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f59468o;
        e2.i1 i1Var = this.f59467n;
        yVar.f(b10, i1Var, false);
        long j10 = i1Var.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        xVar.h = j3;
        return true;
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        return this.f59663k.a(l0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f59710e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f59710e);
        }
        if (d0Var == this.f59469p) {
            this.f59469p = null;
        }
    }

    @Override
    public final void q() {
        this.f59471r = false;
        this.f59470q = false;
        super.q();
    }

    @Override
    public final void t(e2.l0 l0Var) {
        o1 o1Var;
        if (this.f59472s) {
            y yVar = this.f59468o;
            e2.l1 l1Var = yVar.f59643e;
            if (l1Var instanceof o1) {
                o1Var = new o1(((o1) l1Var).f59643e, l0Var);
            } else {
                o1Var = new o1(l1Var, l0Var);
            }
            this.f59468o = new y(o1Var, yVar.f59724f, yVar.f59725g);
        } else {
            this.f59468o = new y(new z(l0Var), e2.k1.f10151q, y.h);
        }
        this.f59663k.t(l0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f59523a;
        Object obj2 = this.f59468o.f59725g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
