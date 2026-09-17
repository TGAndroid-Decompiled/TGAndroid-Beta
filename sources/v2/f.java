package v2;

import n4.y;
import u2.a1;
import u2.b1;
public final class f implements b1 {
    public final h f47334a;
    public final a1 f47335b;
    public final int f47336c;
    public boolean d;
    public final h f47337e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.f47337e = hVar;
        this.f47334a = hVar2;
        this.f47335b = a1Var;
        this.f47336c = i10;
    }

    public final void a() {
        if (!this.d) {
            h hVar = this.f47337e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f47339b;
            int i10 = this.f47336c;
            aVar.j(iArr[i10], hVar.f47340c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f47337e;
        if (!hVar.z() && this.f47335b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        h hVar2 = this.f47337e;
        if (!hVar2.z()) {
            a aVar = hVar2.L;
            a1 a1Var = this.f47335b;
            if (aVar != null && aVar.d(this.f47336c + 1) <= a1Var.t()) {
                return -3;
            }
            a();
            return a1Var.C(yVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int m(long j3) {
        h hVar = this.f47337e;
        if (hVar.z()) {
            return 0;
        }
        boolean z10 = hVar.O;
        a1 a1Var = this.f47335b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f47336c + 1) - a1Var.t());
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
