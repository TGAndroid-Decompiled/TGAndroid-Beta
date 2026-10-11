package v2;

import n4.x;
import u2.a1;
import u2.z0;
public final class f implements a1 {
    public final h f49144a;
    public final z0 f49145b;
    public final int f49146c;
    public boolean d;
    public final h f49147e;

    public f(h hVar, h hVar2, z0 z0Var, int i10) {
        this.f49147e = hVar;
        this.f49144a = hVar2;
        this.f49145b = z0Var;
        this.f49146c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f49147e;
            a5.a aVar = hVar.h;
            int[] iArr = hVar.f49149b;
            int i10 = this.f49146c;
            aVar.l(iArr[i10], hVar.f49150c[i10], 0, null, hVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        h hVar = this.f49147e;
        if (!hVar.v() && this.f49145b.x(hVar.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        h hVar2 = this.f49147e;
        if (!hVar2.v()) {
            a aVar = hVar2.L;
            z0 z0Var = this.f49145b;
            if (aVar != null && aVar.d(this.f49146c + 1) <= z0Var.t()) {
                return -3;
            }
            b();
            return z0Var.C(xVar, hVar, i10, hVar2.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        h hVar = this.f49147e;
        if (hVar.v()) {
            return 0;
        }
        boolean z10 = hVar.O;
        z0 z0Var = this.f49145b;
        int v = z0Var.v(j3, z10);
        a aVar = hVar.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(this.f49146c + 1) - z0Var.t());
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
