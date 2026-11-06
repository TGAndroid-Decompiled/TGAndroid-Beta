package x2;

import a8.wa;
public final class i0 implements h2.j {
    public final int f58253a;
    public final wa f58254b;
    public final u f58255c;
    public final c0 d;

    public i0(wa waVar, u uVar, c0 c0Var, int i7) {
        this.f58253a = i7;
        this.f58254b = waVar;
        this.f58255c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f58253a) {
            case 0:
                wa waVar = this.f58254b;
                k0Var.G(waVar.f700b, (g0) waVar.f701c, this.f58255c, this.d);
                return;
            default:
                wa waVar2 = this.f58254b;
                k0Var.A(waVar2.f700b, (g0) waVar2.f701c, this.f58255c, this.d);
                return;
        }
    }
}
