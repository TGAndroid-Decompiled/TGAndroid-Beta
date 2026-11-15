package x2;

import a8.xa;
public final class h0 implements h2.j {
    public final int f59539a;
    public final xa f59540b;
    public final t f59541c;
    public final b0 d;

    public h0(xa xaVar, t tVar, b0 b0Var, int i7) {
        this.f59539a = i7;
        this.f59540b = xaVar;
        this.f59541c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f59539a) {
            case 0:
                xa xaVar = this.f59540b;
                j0Var.G(xaVar.f713b, (f0) xaVar.f714c, this.f59541c, this.d);
                return;
            default:
                xa xaVar2 = this.f59540b;
                j0Var.A(xaVar2.f713b, (f0) xaVar2.f714c, this.f59541c, this.d);
                return;
        }
    }
}
