package u2;

import v7.u6;
public final class b0 extends u1 {
    public final boolean f47249l;
    public final b2.n1 f47250m;
    public final b2.l1 f47251n;
    public z f47252o;
    public y f47253p;
    public boolean f47254q;
    public boolean f47255r;
    public boolean f47256s;

    public b0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47249l = z11;
        this.f47250m = new b2.n1();
        this.f47251n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f47252o = new z(h, null, null);
            this.f47256s = true;
            return;
        }
        this.f47252o = new z(new a0(aVar.i()), b2.n1.f3862q, z.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.b0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f47249l) {
            this.f47254q = true;
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
        yVar.d = this.f47445k;
        if (this.f47255r) {
            Object obj = g0Var.f47305a;
            if (this.f47252o.f47485g != null && obj.equals(z.h)) {
                obj = this.f47252o.f47485g;
            }
            yVar.a(g0Var.a(obj));
            return yVar;
        }
        this.f47253p = yVar;
        if (!this.f47254q) {
            this.f47254q = true;
            B();
        }
        return yVar;
    }

    public final boolean E(long j10) {
        y yVar = this.f47253p;
        int b10 = this.f47252o.b(yVar.f47477a.f47305a);
        if (b10 == -1) {
            return false;
        }
        z zVar = this.f47252o;
        b2.l1 l1Var = this.f47251n;
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
        return this.f47445k.a(o0Var);
    }

    @Override
    public final void o(e0 e0Var) {
        y yVar = (y) e0Var;
        if (yVar.e != null) {
            a aVar = yVar.d;
            aVar.getClass();
            aVar.o(yVar.e);
        }
        if (e0Var == this.f47253p) {
            this.f47253p = null;
        }
    }

    @Override
    public final void q() {
        this.f47255r = false;
        this.f47254q = false;
        super.q();
    }

    @Override
    public final void t(b2.o0 o0Var) {
        r1 r1Var;
        if (this.f47256s) {
            z zVar = this.f47252o;
            b2.o1 o1Var = zVar.e;
            if (o1Var instanceof r1) {
                r1Var = new r1(((r1) o1Var).e, o0Var);
            } else {
                r1Var = new r1(o1Var, o0Var);
            }
            this.f47252o = new z(r1Var, zVar.f47484f, zVar.f47485g);
        } else {
            this.f47252o = new z(new a0(o0Var), b2.n1.f3862q, z.h);
        }
        this.f47445k.t(o0Var);
    }

    @Override
    public final g0 z(g0 g0Var) {
        Object obj = g0Var.f47305a;
        Object obj2 = this.f47252o.f47485g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = z.h;
        }
        return g0Var.a(obj);
    }
}
