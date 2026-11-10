package x2;

import a8.ia;
public final class a0 extends r1 {
    public final boolean f58284l;
    public final e2.k1 f58285m;
    public final e2.i1 f58286n;
    public y f58287o;
    public x f58288p;
    public boolean f58289q;
    public boolean f58290r;
    public boolean f58291s;

    public a0(a aVar, boolean z9) {
        super(aVar);
        boolean z10;
        if (z9 && aVar.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f58284l = z10;
        this.f58285m = new e2.k1();
        this.f58286n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h != null) {
            this.f58287o = new y(h, null, null);
            this.f58291s = true;
            return;
        }
        this.f58287o = new y(new z(aVar.i()), e2.k1.f10320q, y.h);
    }

    @Override
    public final void A(e2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: x2.a0.A(e2.l1):void");
    }

    @Override
    public final void C() {
        if (!this.f58284l) {
            this.f58289q = true;
            B();
        }
    }

    @Override
    public final x c(f0 f0Var, h6.m mVar, long j3) {
        boolean z9;
        x xVar = new x(f0Var, mVar, j3);
        if (xVar.d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        xVar.d = this.f58466k;
        if (this.f58290r) {
            Object obj = f0Var.f58342a;
            if (this.f58287o.f58542g != null && obj.equals(y.h)) {
                obj = this.f58287o.f58542g;
            }
            xVar.f(f0Var.a(obj));
            return xVar;
        }
        this.f58288p = xVar;
        if (!this.f58289q) {
            this.f58289q = true;
            B();
        }
        return xVar;
    }

    public final boolean E(long j3) {
        x xVar = this.f58288p;
        int b10 = this.f58287o.b(xVar.f58524a.f58342a);
        if (b10 == -1) {
            return false;
        }
        y yVar = this.f58287o;
        e2.i1 i1Var = this.f58286n;
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
        return this.f58466k.a(l0Var);
    }

    @Override
    public final void o(d0 d0Var) {
        x xVar = (x) d0Var;
        if (xVar.f58527e != null) {
            a aVar = xVar.d;
            aVar.getClass();
            aVar.o(xVar.f58527e);
        }
        if (d0Var == this.f58288p) {
            this.f58288p = null;
        }
    }

    @Override
    public final void q() {
        this.f58290r = false;
        this.f58289q = false;
        super.q();
    }

    @Override
    public final void t(e2.l0 l0Var) {
        o1 o1Var;
        if (this.f58291s) {
            y yVar = this.f58287o;
            e2.l1 l1Var = yVar.f58462e;
            if (l1Var instanceof o1) {
                o1Var = new o1(((o1) l1Var).f58462e, l0Var);
            } else {
                o1Var = new o1(l1Var, l0Var);
            }
            this.f58287o = new y(o1Var, yVar.f58541f, yVar.f58542g);
        } else {
            this.f58287o = new y(new z(l0Var), e2.k1.f10320q, y.h);
        }
        this.f58466k.t(l0Var);
    }

    @Override
    public final f0 z(f0 f0Var) {
        Object obj = f0Var.f58342a;
        Object obj2 = this.f58287o.f58542g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = y.h;
        }
        return f0Var.a(obj);
    }
}
