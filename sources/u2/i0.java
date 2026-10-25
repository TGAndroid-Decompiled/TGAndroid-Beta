package u2;

import a8.ng;
public final class i0 implements e2.j {
    public final int f49314a;
    public final ng f49315b;
    public final u f49316c;
    public final c0 d;

    public i0(ng ngVar, u uVar, c0 c0Var, int i10) {
        this.f49314a = i10;
        this.f49315b = ngVar;
        this.f49316c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f49314a) {
            case 0:
                ng ngVar = this.f49315b;
                k0Var.e(ngVar.f639b, (g0) ngVar.f640c, this.f49316c, this.d);
                return;
            default:
                ng ngVar2 = this.f49315b;
                k0Var.j(ngVar2.f639b, (g0) ngVar2.f640c, this.f49316c, this.d);
                return;
        }
    }
}
