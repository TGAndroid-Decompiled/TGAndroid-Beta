package u2;

import v7.t6;
public final class b0 extends t1 {
    public final boolean f49824l;
    public final b2.n1 f49825m;
    public final b2.l1 f49826n;
    public z f49827o;
    public y f49828p;
    public boolean f49829q;
    public boolean f49830r;
    public boolean f49831s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f49824l = z11;
        this.f49825m = new b2.n1();
        this.f49826n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f49827o = new z(h, null, null);
            this.f49831s = true;
            return;
        }
        this.f49827o = new z(new a0(aVar.i()), b2.n1.f2128q, z.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f49824l) {
            this.f49829q = true;
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
        t6.p(z10);
        yVar.d = this.f50013k;
        if (this.f49830r) {
            Object obj = g0Var.f49875a;
            if (this.f49827o.f50070g != null && obj.equals(z.h)) {
                obj = this.f49827o.f50070g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f49828p = yVar;
        if (!this.f49829q) {
            this.f49829q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f49828p;
        int b10 = this.f49827o.b(yVar.f50053a.f49875a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f49827o;
        b2.l1 l1Var = this.f49826n;
        zVar.f(b10, l1Var, false);
        long j11 = l1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        yVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        return this.f50013k.a(p0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f49828p) {
            this.f49828p = null;
        }
    }

    @Override
    public final void q() {
        this.f49830r = false;
        this.f49829q = false;
        super.q();
    }

    @Override
    public final void t(b2.p0 p0Var) {
        q1 q1Var;
        if (this.f49831s) {
            z zVar = this.f49827o;
            b2.o1 o1Var = zVar.e;
            if (o1Var instanceof q1) {
                q1Var = new q1(((q1) o1Var).e, p0Var);
            } else {
                q1Var = new q1(o1Var, p0Var);
            }
            this.f49827o = new z(q1Var, zVar.f50069f, zVar.f50070g);
        } else {
            this.f49827o = new z(new a0(p0Var), b2.n1.f2128q, z.h);
        }
        this.f50013k.t(p0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f49875a;
        Object obj2 = this.f49827o.f50070g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
