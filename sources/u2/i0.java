package u2;

import a8.ng;
public final class i0 implements e2.j {
    public final int f49317a;
    public final ng f49318b;
    public final u f49319c;
    public final c0 d;

    public i0(ng ngVar, u uVar, c0 c0Var, int i10) {
        this.f49317a = i10;
        this.f49318b = ngVar;
        this.f49319c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f49317a) {
            case 0:
                ng ngVar = this.f49318b;
                k0Var.e(ngVar.f639b, (g0) ngVar.f640c, this.f49319c, this.d);
                return;
            default:
                ng ngVar2 = this.f49318b;
                k0Var.j(ngVar2.f639b, (g0) ngVar2.f640c, this.f49319c, this.d);
                return;
        }
    }
}
