package u2;

import v7.u6;
public final class c0 extends v1 {
    public final boolean f47714l;
    public final b2.n1 f47715m;
    public final b2.l1 f47716n;
    public a0 f47717o;
    public z f47718p;
    public boolean f47719q;
    public boolean f47720r;
    public boolean f47721s;

    public c0(a aVar, boolean z10) {
        super(aVar);
        boolean z11;
        if (z10 && aVar.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47714l = z11;
        this.f47715m = new b2.n1();
        this.f47716n = new b2.l1();
        b2.o1 h = aVar.h();
        if (h != null) {
            this.f47717o = new a0(h, null, null);
            this.f47721s = true;
            return;
        }
        this.f47717o = new a0(new b0(aVar.i()), b2.n1.f3865q, a0.h);
    }

    @Override
    public final void A(b2.o1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: u2.c0.A(b2.o1):void");
    }

    @Override
    public final void C() {
        if (!this.f47714l) {
            this.f47719q = true;
            B();
        }
    }

    @Override
    public final z c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        boolean z10;
        z zVar = new z(h0Var, eVar, j10);
        if (zVar.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        zVar.d = this.f47912k;
        if (this.f47720r) {
            Object obj = h0Var.f47767a;
            if (this.f47717o.f47695g != null && obj.equals(a0.h)) {
                obj = this.f47717o.f47695g;
            }
            zVar.e(h0Var.a(obj));
            return zVar;
        }
        this.f47718p = zVar;
        if (!this.f47719q) {
            this.f47719q = true;
            B();
        }
        return zVar;
    }

    public final boolean E(long j10) {
        z zVar = this.f47718p;
        int b10 = this.f47717o.b(zVar.f47944a.f47767a);
        if (b10 == -1) {
            return false;
        }
        a0 a0Var = this.f47717o;
        b2.l1 l1Var = this.f47716n;
        a0Var.f(b10, l1Var, false);
        long j11 = l1Var.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zVar.h = j10;
        return true;
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        return this.f47912k.a(o0Var);
    }

    @Override
    public final void o(f0 f0Var) {
        z zVar = (z) f0Var;
        if (zVar.e != null) {
            a aVar = zVar.d;
            aVar.getClass();
            aVar.o(zVar.e);
        }
        if (f0Var == this.f47718p) {
            this.f47718p = null;
        }
    }

    @Override
    public final void q() {
        this.f47720r = false;
        this.f47719q = false;
        super.q();
    }

    @Override
    public final void t(b2.o0 o0Var) {
        s1 s1Var;
        if (this.f47721s) {
            a0 a0Var = this.f47717o;
            b2.o1 o1Var = a0Var.e;
            if (o1Var instanceof s1) {
                s1Var = new s1(((s1) o1Var).e, o0Var);
            } else {
                s1Var = new s1(o1Var, o0Var);
            }
            this.f47717o = new a0(s1Var, a0Var.f47694f, a0Var.f47695g);
        } else {
            this.f47717o = new a0(new b0(o0Var), b2.n1.f3865q, a0.h);
        }
        this.f47912k.t(o0Var);
    }

    @Override
    public final h0 z(h0 h0Var) {
        Object obj = h0Var.f47767a;
        Object obj2 = this.f47717o.f47695g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a0.h;
        }
        return h0Var.a(obj);
    }
}
