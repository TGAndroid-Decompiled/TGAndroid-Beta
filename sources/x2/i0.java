package x2;

import a8.wa;
public final class i0 implements h2.j {
    public final int f58357a;
    public final wa f58358b;
    public final u f58359c;
    public final c0 d;

    public i0(wa waVar, u uVar, c0 c0Var, int i7) {
        this.f58357a = i7;
        this.f58358b = waVar;
        this.f58359c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f58357a) {
            case 0:
                wa waVar = this.f58358b;
                k0Var.G(waVar.f700b, (g0) waVar.f701c, this.f58359c, this.d);
                return;
            default:
                wa waVar2 = this.f58358b;
                k0Var.A(waVar2.f700b, (g0) waVar2.f701c, this.f58359c, this.d);
                return;
        }
    }
}
