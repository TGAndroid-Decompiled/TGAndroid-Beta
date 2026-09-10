package v2;

import u2.c1;
import u2.d1;
public final class f implements d1 {
    public final h f42868a;
    public final c1 f42869b;
    public final int f42870c;
    public boolean d;
    public final h e;

    public f(h hVar, h hVar2, c1 c1Var, int i10) {
        this.e = hVar;
        this.f42868a = hVar2;
        this.f42869b = c1Var;
        this.f42870c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f42872b;
            int i10 = this.f42870c;
            aVar.i(iArr[i10], hVar.f42873c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.e;
        if (!hVar.y() && this.f42869b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(long j3) {
        h hVar = this.e;
        if (hVar.y()) {
            return 0;
        }
        boolean z10 = hVar.O;
        c1 c1Var = this.f42869b;
        int v = c1Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f42870c + 1) - c1Var.t());
        }
        c1Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        h hVar2 = this.e;
        if (!hVar2.y()) {
            a aVar = hVar2.L;
            c1 c1Var = this.f42869b;
            if (aVar != null && aVar.d(this.f42870c + 1) <= c1Var.t()) {
                return -3;
            }
            b();
            return c1Var.C(bVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
