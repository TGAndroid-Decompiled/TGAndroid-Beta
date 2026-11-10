package x2;

import a8.wa;
public final class h0 implements h2.j {
    public final int f58358a;
    public final wa f58359b;
    public final t f58360c;
    public final b0 d;

    public h0(wa waVar, t tVar, b0 b0Var, int i7) {
        this.f58358a = i7;
        this.f58359b = waVar;
        this.f58360c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f58358a) {
            case 0:
                wa waVar = this.f58359b;
                j0Var.G(waVar.f700b, (f0) waVar.f701c, this.f58360c, this.d);
                return;
            default:
                wa waVar2 = this.f58359b;
                j0Var.A(waVar2.f700b, (f0) waVar2.f701c, this.f58360c, this.d);
                return;
        }
    }
}
