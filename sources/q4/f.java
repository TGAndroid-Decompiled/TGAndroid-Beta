package q4;

import b4.e0;
import o4.k0;
import o4.l0;
public final class f implements l0 {
    public final h f44480a;
    public final k0 f44481b;
    public final int f44482c;
    public boolean d;
    public final h f44483e;

    public f(h hVar, h hVar2, k0 k0Var, int i10) {
        this.f44483e = hVar;
        this.f44480a = hVar2;
        this.f44481b = k0Var;
        this.f44482c = i10;
    }

    public final void b() {
        if (!this.d) {
            h hVar = this.f44483e;
            e0 e0Var = hVar.h;
            int[] iArr = hVar.f44485b;
            int i10 = this.f44482c;
            e0Var.h(iArr[i10], hVar.f44486c[i10], 0, null, hVar.G);
            this.d = true;
        }
    }

    @Override
    public final boolean h() {
        h hVar = this.f44483e;
        if (!hVar.y() && this.f44481b.u(hVar.J)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j10) {
        h hVar = this.f44483e;
        if (hVar.y()) {
            return 0;
        }
        boolean z4 = hVar.J;
        k0 k0Var = this.f44481b;
        int s6 = k0Var.s(j10, z4);
        a aVar = hVar.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.d(this.f44482c + 1) - k0Var.q());
        }
        k0Var.E(s6);
        if (s6 > 0) {
            b();
        }
        return s6;
    }

    @Override
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        h hVar = this.f44483e;
        if (!hVar.y()) {
            a aVar = hVar.I;
            k0 k0Var = this.f44481b;
            if (aVar != null && aVar.d(this.f44482c + 1) <= k0Var.q()) {
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
