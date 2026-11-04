package w2;

import b8.zb;
public final class b0 extends t1 {
    public final boolean f57026l;
    public final d2.m1 f57027m;
    public final d2.k1 f57028n;
    public z f57029o;
    public y f57030p;
    public boolean f57031q;
    public boolean f57032r;
    public boolean f57033s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57026l = z11;
        this.f57027m = new d2.m1();
        this.f57028n = new d2.k1();
        d2.n1 h = aVar.h();
        if (h != null) {
            this.f57029o = new z(h, null, null);
            this.f57033s = true;
            return;
        }
        this.f57029o = new z(new a0(aVar.i()), d2.m1.f8199q, z.h);
    }

    @Override
    public final void A(d2.n1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: w2.b0.A(d2.n1):void");
    }

    @Override
    public final void C() {
        if (!this.f57026l) {
            this.f57031q = true;
            B();
        }
    }

    @Override
    public final y c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        boolean z10;
        y yVar = new y(g0Var, a0Var, j10);
        if (yVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        yVar.d = this.f57229k;
        if (this.f57032r) {
            Object obj = g0Var.f57081a;
            if (this.f57029o.f57291g != null && obj.equals(z.h)) {
                obj = this.f57029o.f57291g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f57030p = yVar;
        if (!this.f57031q) {
            this.f57031q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f57030p;
        int b10 = this.f57029o.b(yVar.f57273a.f57081a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f57029o;
        d2.k1 k1Var = this.f57028n;
        zVar.f(b10, k1Var, false);
        long j11 = k1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(d2.n0 n0Var) {
        return this.f57229k.a(n0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.f57276e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.f57276e);
        }
        if (e0Var == this.f57030p) {
            this.f57030p = null;
        }
    }

    @Override
    public final void q() {
        this.f57032r = false;
        this.f57031q = false;
        super.q();
    }

    @Override
    public final void t(d2.n0 n0Var) {
        q1 q1Var;
        if (this.f57033s) {
            z zVar = this.f57029o;
            d2.n1 n1Var = zVar.f57209e;
            if (n1Var instanceof q1) {
                q1Var = new q1(((q1) n1Var).f57209e, n0Var);
            } else {
                q1Var = new q1(n1Var, n0Var);
            }
            this.f57029o = new z(q1Var, zVar.f57290f, zVar.f57291g);
        } else {
            this.f57029o = new z(new a0(n0Var), d2.m1.f8199q, z.h);
        }
        this.f57229k.t(n0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f57081a;
        Object obj2 = this.f57029o.f57291g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
