package u2;

import a8.yb;
public final class b0 extends t1 {
    public final boolean f49243l;
    public final b2.o1 f49244m;
    public final b2.m1 f49245n;
    public z f49246o;
    public y f49247p;
    public boolean f49248q;
    public boolean f49249r;
    public boolean f49250s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49243l = z11;
        this.f49244m = new b2.o1();
        this.f49245n = new b2.m1();
        b2.p1 h = aVar.h();
        if (h != null) {
            this.f49246o = new z(h, null, null);
            this.f49250s = true;
            return;
        }
        this.f49246o = new z(new a0(aVar.i()), b2.o1.f3316q, z.h);
    }

    @Override
    public final void A(b2.p1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.p1):void");
    }

    @Override
    public final void C() {
        if (!this.f49243l) {
            this.f49248q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, a8.h0 h0Var, long j10) {
        boolean z10;
        y yVar = new y(g0Var, h0Var, j10);
        if (yVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        yVar.d = this.f49431k;
        if (this.f49249r) {
            Object obj = g0Var.f49294a;
            if (this.f49246o.f49488g != null && obj.equals(z.h)) {
                obj = this.f49246o.f49488g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f49247p = yVar;
        if (!this.f49248q) {
            this.f49248q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f49247p;
        int b10 = this.f49246o.b(yVar.f49471a.f49294a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f49246o;
        b2.m1 m1Var = this.f49245n;
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
        return this.f49431k.a(p0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f49247p) {
            this.f49247p = null;
        }
    }

    @Override
    public final void q() {
        this.f49249r = false;
        this.f49248q = false;
        super.q();
    }

    @Override
    public final void t(b2.p0 p0Var) {
        q1 q1Var;
        if (this.f49250s) {
            z zVar = this.f49246o;
            b2.p1 p1Var = zVar.e;
            if (p1Var instanceof q1) {
                q1Var = new q1(((q1) p1Var).e, p0Var);
            } else {
                q1Var = new q1(p1Var, p0Var);
            }
            this.f49246o = new z(q1Var, zVar.f49487f, zVar.f49488g);
        } else {
            this.f49246o = new z(new a0(p0Var), b2.o1.f3316q, z.h);
        }
        this.f49431k.t(p0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f49294a;
        Object obj2 = this.f49246o.f49488g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
