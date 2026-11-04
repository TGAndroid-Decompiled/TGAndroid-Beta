package w2;

import b8.kg;
public final class i0 implements g2.k {
    public final int f57102a;
    public final kg f57103b;
    public final u f57104c;
    public final c0 d;

    public i0(kg kgVar, u uVar, c0 c0Var, int i3) {
        this.f57102a = i3;
        this.f57103b = kgVar;
        this.f57104c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f57102a) {
            case 0:
                kg kgVar = this.f57103b;
                k0Var.t(kgVar.f2722b, (g0) kgVar.f2723c, this.f57104c, this.d);
                return;
            default:
                kg kgVar2 = this.f57103b;
                k0Var.z(kgVar2.f2722b, (g0) kgVar2.f2723c, this.f57104c, this.d);
                return;
        }
    }
}
