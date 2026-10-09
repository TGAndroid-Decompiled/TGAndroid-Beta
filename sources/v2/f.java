package v2;

import n4.x;
import u2.a1;
import u2.b1;
public final class f implements b1 {
    public final h f49055a;
    public final a1 f49056b;
    public final int f49057c;
    public boolean d;
    public final h f49058e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.f49058e = hVar;
        this.f49055a = hVar2;
        this.f49056b = a1Var;
        this.f49057c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f49058e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f49060b;
            int i10 = this.f49057c;
            aVar.l(iArr[i10], hVar.f49061c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f49058e;
        if (!hVar.v() && this.f49056b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        h hVar2 = this.f49058e;
        if (!hVar2.v()) {
            a aVar = hVar2.L;
            a1 a1Var = this.f49056b;
            if (aVar != null && aVar.d(this.f49057c + 1) <= a1Var.t()) {
                return -3;
            }
            b();
            return a1Var.C(xVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        h hVar = this.f49058e;
        if (hVar.v()) {
            return 0;
        }
        boolean z10 = hVar.O;
        a1 a1Var = this.f49056b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f49057c + 1) - a1Var.t());
        }
        a1Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override
    public final void a() {
    }
}
