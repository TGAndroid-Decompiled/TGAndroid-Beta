package v2;

import n4.y;
import u2.a1;
import u2.b1;
public final class f implements b1 {
    public final h f47305a;
    public final a1 f47306b;
    public final int f47307c;
    public boolean d;
    public final h f47308e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.f47308e = hVar;
        this.f47305a = hVar2;
        this.f47306b = a1Var;
        this.f47307c = i10;
    }

    public final void a() {
        if (!this.d) {
            h hVar = this.f47308e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f47310b;
            int i10 = this.f47307c;
            aVar.j(iArr[i10], hVar.f47311c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f47308e;
        if (!hVar.z() && this.f47306b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.g gVar, int i10) {
        h hVar = this.f47308e;
        if (!hVar.z()) {
            a aVar = hVar.L;
            a1 a1Var = this.f47306b;
            if (aVar != null && aVar.d(this.f47307c + 1) <= a1Var.t()) {
                return -3;
            }
            a();
            return a1Var.C(yVar, gVar, i10, hVar.O);
        }
        return -3;
    }

    @Override
    public final int m(long j3) {
        h hVar = this.f47308e;
        if (hVar.z()) {
            return 0;
        }
        boolean z10 = hVar.O;
        a1 a1Var = this.f47306b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f47307c + 1) - a1Var.t());
        }
        a1Var.H(v);
        if (v > 0) {
            a();
        }
        return v;
    }

    @Override
    public final void b() {
    }
}
