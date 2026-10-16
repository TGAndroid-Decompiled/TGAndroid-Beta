package u2;

import v7.u6;
public final class b0 extends t1 {
    public final boolean f45866l;
    public final b2.o1 f45867m;
    public final b2.m1 f45868n;
    public z f45869o;
    public y f45870p;
    public boolean f45871q;
    public boolean f45872r;
    public boolean f45873s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45866l = z11;
        this.f45867m = new b2.o1();
        this.f45868n = new b2.m1();
        b2.p1 h = aVar.h();
        if (h != null) {
            this.f45869o = new z(h, null, null);
            this.f45873s = true;
            return;
        }
        this.f45869o = new z(new a0(aVar.i()), b2.o1.f2253q, z.h);
    }

    @Override
    public final void A(b2.p1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.p1):void");
    }

    @Override
    public final void C() {
        if (!this.f45866l) {
            this.f45871q = true;
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
        yVar.d = this.f46052k;
        if (this.f45872r) {
            Object obj = g0Var.f45920a;
            if (this.f45869o.f46109g != null && obj.equals(z.h)) {
                obj = this.f45869o.f46109g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f45870p = yVar;
        if (!this.f45871q) {
            this.f45871q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f45870p;
        int b10 = this.f45869o.b(yVar.f46092a.f45920a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f45869o;
        b2.m1 m1Var = this.f45868n;
        zVar.f(b10, m1Var, false);
        long j11 = m1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        return this.f46052k.a(p0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f45870p) {
            this.f45870p = null;
        }
    }

    @Override
    public final void q() {
        this.f45872r = false;
        this.f45871q = false;
        super.q();
    }

    @Override
    public final void t(b2.p0 p0Var) {
        q1 q1Var;
        if (this.f45873s) {
            z zVar = this.f45869o;
            b2.p1 p1Var = zVar.e;
            if (p1Var instanceof q1) {
                q1Var = new q1(((q1) p1Var).e, p0Var);
            } else {
                q1Var = new q1(p1Var, p0Var);
            }
            this.f45869o = new z(q1Var, zVar.f46108f, zVar.f46109g);
        } else {
            this.f45869o = new z(new a0(p0Var), b2.o1.f2253q, z.h);
        }
        this.f46052k.t(p0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f45920a;
        Object obj2 = this.f45869o.f46109g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
