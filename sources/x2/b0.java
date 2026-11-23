package x2;

import a8.ma;
public final class b0 extends t1 {
    public final boolean f60043l;
    public final e2.k1 f60044m;
    public final e2.i1 f60045n;
    public z f60046o;
    public y f60047p;
    public boolean f60048q;
    public boolean f60049r;
    public boolean f60050s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f60043l = z11;
        this.f60044m = new e2.k1();
        this.f60045n = new e2.i1();
        e2.l1 h = aVar.h();
        if (h != null) {
            this.f60046o = new z(h, null, null);
            this.f60050s = true;
            return;
        }
        this.f60046o = new z(new a0(aVar.i()), e2.k1.f10461q, z.h);
    }

    @Override
    public final void A(e2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: x2.b0.A(e2.l1):void");
    }

    @Override
    public final void C() {
        if (!this.f60043l) {
            this.f60048q = true;
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
        ma.p(z10);
        yVar.d = this.f60246k;
        if (this.f60049r) {
            Object obj = g0Var.f60098a;
            if (this.f60046o.f60308g != null && obj.equals(z.h)) {
                obj = this.f60046o.f60308g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f60047p = yVar;
        if (!this.f60048q) {
            this.f60048q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j3) {
        y yVar = this.f60047p;
        int b10 = this.f60046o.b(yVar.f60290a.f60098a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f60046o;
        e2.i1 i1Var = this.f60045n;
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
        return this.f60246k.a(l0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.f60293e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.f60293e);
        }
        if (e0Var == this.f60047p) {
            this.f60047p = null;
        }
    }

    @Override
    public final void q() {
        this.f60049r = false;
        this.f60048q = false;
        super.q();
    }

    @Override
    public final void t(e2.l0 l0Var) {
        q1 q1Var;
        if (this.f60050s) {
            z zVar = this.f60046o;
            e2.l1 l1Var = zVar.f60226e;
            if (l1Var instanceof q1) {
                q1Var = new q1(((q1) l1Var).f60226e, l0Var);
            } else {
                q1Var = new q1(l1Var, l0Var);
            }
            this.f60046o = new z(q1Var, zVar.f60307f, zVar.f60308g);
        } else {
            this.f60046o = new z(new a0(l0Var), e2.k1.f10461q, z.h);
        }
        this.f60246k.t(l0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f60098a;
        Object obj2 = this.f60046o.f60308g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
