package v2;

import n4.x;
import u2.a1;
import u2.z0;
public final class f implements a1 {
    public final h f49178a;
    public final z0 f49179b;
    public final int f49180c;
    public boolean d;
    public final h f49181e;

    public f(h hVar, h hVar2, z0 z0Var, int i10) {
        this.f49181e = hVar;
        this.f49178a = hVar2;
        this.f49179b = z0Var;
        this.f49180c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f49181e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f49183b;
            int i10 = this.f49180c;
            aVar.l(iArr[i10], hVar.f49184c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f49181e;
        if (!hVar.v() && this.f49179b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        h hVar2 = this.f49181e;
        if (!hVar2.v()) {
            a aVar = hVar2.L;
            z0 z0Var = this.f49179b;
            if (aVar != null && aVar.d(this.f49180c + 1) <= z0Var.t()) {
                return -3;
            }
            b();
            return z0Var.C(xVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        h hVar = this.f49181e;
        if (hVar.v()) {
            return 0;
        }
        boolean z10 = hVar.O;
        z0 z0Var = this.f49179b;
        int v = z0Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f49180c + 1) - z0Var.t());
        }
        z0Var.H(v);
        if (v > 0) {
            b();
        }
        return v;
    }

    @Override
    public final void a() {
    }
}
