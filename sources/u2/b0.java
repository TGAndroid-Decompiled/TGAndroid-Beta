package u2;

import v7.u6;
public final class b0 extends u1 {
    public final boolean f47258l;
    public final b2.n1 f47259m;
    public final b2.l1 f47260n;
    public z f47261o;
    public y f47262p;
    public boolean f47263q;
    public boolean f47264r;
    public boolean f47265s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47258l = z11;
        this.f47259m = new b2.n1();
        this.f47260n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f47261o = new z(h, null, null);
            this.f47265s = true;
            return;
        }
        this.f47261o = new z(new a0(aVar.i()), b2.n1.f3858q, z.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f47258l) {
            this.f47263q = true;
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
        yVar.d = this.f47454k;
        if (this.f47264r) {
            Object obj = g0Var.f47314a;
            if (this.f47261o.f47494g != null && obj.equals(z.h)) {
                obj = this.f47261o.f47494g;
            }
            yVar.b(g0Var.a(obj));
            return yVar;
        }
        this.f47262p = yVar;
        if (!this.f47263q) {
            this.f47263q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f47262p;
        int b10 = this.f47261o.b(yVar.f47486a.f47314a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f47261o;
        b2.l1 l1Var = this.f47260n;
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
        return this.f47454k.a(o0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f47262p) {
            this.f47262p = null;
        }
    }

    @Override
    public final void q() {
        this.f47264r = false;
        this.f47263q = false;
        super.q();
    }

    @Override
    public final void t(b2.o0 o0Var) {
        r1 r1Var;
        if (this.f47265s) {
            z zVar = this.f47261o;
            b2.o1 o1Var = zVar.e;
            if (o1Var instanceof r1) {
                r1Var = new r1(((r1) o1Var).e, o0Var);
            } else {
                r1Var = new r1(o1Var, o0Var);
            }
            this.f47261o = new z(r1Var, zVar.f47493f, zVar.f47494g);
        } else {
            this.f47261o = new z(new a0(o0Var), b2.n1.f3858q, z.h);
        }
        this.f47454k.t(o0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f47314a;
        Object obj2 = this.f47261o.f47494g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
