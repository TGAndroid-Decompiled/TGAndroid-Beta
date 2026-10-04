package v2;

import n4.y;
import u2.b1;
import u2.c1;
public final class f implements c1 {
    public final h f47793a;
    public final b1 f47794b;
    public final int f47795c;
    public boolean d;
    public final h f47796e;

    public f(h hVar, h hVar2, b1 b1Var, int i10) {
        this.f47796e = hVar;
        this.f47793a = hVar2;
        this.f47794b = b1Var;
        this.f47795c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f47796e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f47798b;
            int i10 = this.f47795c;
            aVar.k(iArr[i10], hVar.f47799c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f47796e;
        if (!hVar.y() && this.f47794b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.f47796e;
        if (!hVar2.y()) {
            a aVar = hVar2.L;
            b1 b1Var = this.f47794b;
            if (aVar != null && aVar.d(this.f47795c + 1) <= b1Var.t()) {
                return -3;
            }
            b();
            return b1Var.C(yVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        h hVar = this.f47796e;
        if (hVar.y()) {
            return 0;
        }
        boolean z10 = hVar.O;
        b1 b1Var = this.f47794b;
        int v = b1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f47795c + 1) - b1Var.t());
        }
        b1Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override
    public final void a() {
    }
}
