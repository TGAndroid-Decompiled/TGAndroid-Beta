package u2;

import v7.u6;
public final class b0 extends u1 {
    public final boolean f47261l;
    public final b2.n1 f47262m;
    public final b2.l1 f47263n;
    public z f47264o;
    public y f47265p;
    public boolean f47266q;
    public boolean f47267r;
    public boolean f47268s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47261l = z11;
        this.f47262m = new b2.n1();
        this.f47263n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f47264o = new z(h, null, null);
            this.f47268s = true;
            return;
        }
        this.f47264o = new z(new a0(aVar.i()), b2.n1.f3858q, z.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f47261l) {
            this.f47266q = true;
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
        yVar.d = this.f47457k;
        if (this.f47267r) {
            Object obj = g0Var.f47317a;
            if (this.f47264o.f47497g != null && obj.equals(z.h)) {
                obj = this.f47264o.f47497g;
            }
            yVar.b(g0Var.a(obj));
            return yVar;
        }
        this.f47265p = yVar;
        if (!this.f47266q) {
            this.f47266q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f47265p;
        int b10 = this.f47264o.b(yVar.f47489a.f47317a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f47264o;
        b2.l1 l1Var = this.f47263n;
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
        return this.f47457k.a(o0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f47265p) {
            this.f47265p = null;
        }
    }

    @Override
    public final void q() {
        this.f47267r = false;
        this.f47266q = false;
        super.q();
    }

    @Override
    public final void t(b2.o0 o0Var) {
        r1 r1Var;
        if (this.f47268s) {
            z zVar = this.f47264o;
            b2.o1 o1Var = zVar.e;
            if (o1Var instanceof r1) {
                r1Var = new r1(((r1) o1Var).e, o0Var);
            } else {
                r1Var = new r1(o1Var, o0Var);
            }
            this.f47264o = new z(r1Var, zVar.f47496f, zVar.f47497g);
        } else {
            this.f47264o = new z(new a0(o0Var), b2.n1.f3858q, z.h);
        }
        this.f47457k.t(o0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f47317a;
        Object obj2 = this.f47264o.f47497g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
