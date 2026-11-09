package x2;

import a8.ia;
public final class b0 extends s1 {
    public final boolean f58281l;
    public final e2.k1 f58282m;
    public final e2.i1 f58283n;
    public z f58284o;
    public y f58285p;
    public boolean f58286q;
    public boolean f58287r;
    public boolean f58288s;

    public b0(a aVar, boolean z9) {
        super(aVar);
        boolean z10;
        if (z9 && aVar.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f58281l = z10;
        this.f58282m = new e2.k1();
        this.f58283n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h != null) {
            this.f58284o = new z(h, null, null);
            this.f58288s = true;
            return;
        }
        this.f58284o = new z(new a0(aVar.i()), e2.k1.f10315q, z.h);
    }

    @Override
    public final void A(e2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: x2.b0.A(e2.l1):void");
    }

    @Override
    public final void C() {
        if (!this.f58281l) {
            this.f58286q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, h6.m mVar, long j3) {
        boolean z9;
        y yVar = new y(g0Var, mVar, j3);
        if (yVar.d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        yVar.d = this.f58469k;
        if (this.f58287r) {
            Object obj = g0Var.f58339a;
            if (this.f58284o.f58545g != null && obj.equals(z.h)) {
                obj = this.f58284o.f58545g;
            }
            yVar.f(g0Var.a(obj));
            return yVar;
        }
        this.f58285p = yVar;
        if (!this.f58286q) {
            this.f58286q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j3) {
        y yVar = this.f58285p;
        int b10 = this.f58284o.b(yVar.f58527a.f58339a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f58284o;
        e2.i1 i1Var = this.f58283n;
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
        return this.f58469k.a(l0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.f58530e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.f58530e);
        }
        if (e0Var == this.f58285p) {
            this.f58285p = null;
        }
    }

    @Override
    public final void q() {
        this.f58287r = false;
        this.f58286q = false;
        super.q();
    }

    @Override
    public final void t(e2.l0 l0Var) {
        p1 p1Var;
        if (this.f58288s) {
            z zVar = this.f58284o;
            e2.l1 l1Var = zVar.f58465e;
            if (l1Var instanceof p1) {
                p1Var = new p1(((p1) l1Var).f58465e, l0Var);
            } else {
                p1Var = new p1(l1Var, l0Var);
            }
            this.f58284o = new z(p1Var, zVar.f58544f, zVar.f58545g);
        } else {
            this.f58284o = new z(new a0(l0Var), e2.k1.f10315q, z.h);
        }
        this.f58469k.t(l0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f58339a;
        Object obj2 = this.f58284o.f58545g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
