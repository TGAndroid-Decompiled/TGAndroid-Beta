package v2;

import u2.c1;
import u2.d1;
public final class g implements d1 {
    public final i f50311a;
    public final c1 f50312b;
    public final int f50313c;
    public boolean d;
    public final i e;

    public g(i iVar, i iVar2, c1 c1Var, int i10) {
        this.e = iVar;
        this.f50311a = iVar2;
        this.f50312b = c1Var;
        this.f50313c = i10;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.e;
            a5.a aVar = iVar.h;
            int[] iArr = iVar.f50315b;
            int i10 = this.f50313c;
            aVar.l(iArr[i10], iVar.f50316c[i10], 0, null, iVar.J);
            this.d = true;
        }
    }

    @Override
    public final boolean e() {
        i iVar = this.e;
        if (!iVar.y() && this.f50312b.A(iVar.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.P;
        c1 c1Var = this.f50312b;
        int x10 = c1Var.x(j10, z10);
        a aVar = iVar.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f50313c + 1) - c1Var.v());
        }
        c1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        i iVar = this.e;
        if (!iVar.y()) {
            a aVar = iVar.L;
            c1 c1Var = this.f50312b;
            if (aVar != null && aVar.d(this.f50313c + 1) <= c1Var.v()) {
                return -3;
            }
            b();
            return c1Var.F(bVar, hVar, i10, iVar.P);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
