package q4;

import b4.e0;
import o4.k0;
import o4.l0;
public final class f implements l0 {
    public final h f42735a;
    public final k0 f42736b;
    public final int f42737c;
    public boolean d;
    public final h e;

    public f(h hVar, h hVar2, k0 k0Var, int i10) {
        this.e = hVar;
        this.f42735a = hVar2;
        this.f42736b = k0Var;
        this.f42737c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.e;
            e0 e0Var = hVar.h;
            int[] iArr = hVar.f42739b;
            int i10 = this.f42737c;
            e0Var.g(iArr[i10], hVar.f42740c[i10], 0, null, hVar.G);
            this.d = true;
        }
    }

    @Override
    public final boolean d() {
        h hVar = this.e;
        if (!hVar.k() && this.f42736b.u(hVar.J)) {
            return true;
        }
        return false;
    }

    @Override
    public final int e(long j10) {
        h hVar = this.e;
        if (hVar.k()) {
            return 0;
        }
        boolean z4 = hVar.J;
        k0 k0Var = this.f42736b;
        int s6 = k0Var.s(j10, z4);
        a aVar = hVar.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.d(this.f42737c + 1) - k0Var.q());
        }
        k0Var.E(s6);
        if (s6 > 0) {
            b();
        }
        return s6;
    }

    @Override
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        h hVar = this.e;
        if (!hVar.k()) {
            a aVar = hVar.I;
            k0 k0Var = this.f42736b;
            if (aVar != null && aVar.d(this.f42737c + 1) <= k0Var.q()) {
                return -3;
            }
            b();
            return k0Var.z(bVar, iVar, i10, hVar.J);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
