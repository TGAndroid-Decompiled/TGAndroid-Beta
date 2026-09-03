package q4;

import b4.e0;
import o4.k0;
import o4.l0;
public final class f implements l0 {
    public final h f42765a;
    public final k0 f42766b;
    public final int f42767c;
    public boolean d;
    public final h e;

    public f(h hVar, h hVar2, k0 k0Var, int i10) {
        this.e = hVar;
        this.f42765a = hVar2;
        this.f42766b = k0Var;
        this.f42767c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.e;
            e0 e0Var = hVar.h;
            int[] iArr = hVar.f42769b;
            int i10 = this.f42767c;
            e0Var.h(iArr[i10], hVar.f42770c[i10], 0, null, hVar.G);
            this.d = true;
        }
    }

    @Override
    public final boolean d() {
        h hVar = this.e;
        if (!hVar.j() && this.f42766b.u(hVar.J)) {
            return true;
        }
        return false;
    }

    @Override
    public final int e(long j10) {
        h hVar = this.e;
        if (hVar.j()) {
            return 0;
        }
        boolean z4 = hVar.J;
        k0 k0Var = this.f42766b;
        int s6 = k0Var.s(j10, z4);
        a aVar = hVar.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.e(this.f42767c + 1) - k0Var.q());
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
        if (!hVar.j()) {
            a aVar = hVar.I;
            k0 k0Var = this.f42766b;
            if (aVar != null && aVar.e(this.f42767c + 1) <= k0Var.q()) {
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
