package v2;

import n4.x;
import u2.a1;
import u2.b1;
public final class f implements b1 {
    public final h f49101a;
    public final a1 f49102b;
    public final int f49103c;
    public boolean d;
    public final h f49104e;

    public f(h hVar, h hVar2, a1 a1Var, int i10) {
        this.f49104e = hVar;
        this.f49101a = hVar2;
        this.f49102b = a1Var;
        this.f49103c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f49104e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f49106b;
            int i10 = this.f49103c;
            aVar.l(iArr[i10], hVar.f49107c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f49104e;
        if (!hVar.v() && this.f49102b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        h hVar2 = this.f49104e;
        if (!hVar2.v()) {
            a aVar = hVar2.L;
            a1 a1Var = this.f49102b;
            if (aVar != null && aVar.d(this.f49103c + 1) <= a1Var.t()) {
                return -3;
            }
            b();
            return a1Var.C(xVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        h hVar = this.f49104e;
        if (hVar.v()) {
            return 0;
        }
        boolean z10 = hVar.O;
        a1 a1Var = this.f49102b;
        int v = a1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f49103c + 1) - a1Var.t());
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
