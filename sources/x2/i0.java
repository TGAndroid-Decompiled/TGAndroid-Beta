package x2;

import a8.xa;
public final class i0 implements h2.j {
    public final int f60109a;
    public final xa f60110b;
    public final u f60111c;
    public final c0 d;

    public i0(xa xaVar, u uVar, c0 c0Var, int i7) {
        this.f60109a = i7;
        this.f60110b = xaVar;
        this.f60111c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f60109a) {
            case 0:
                xa xaVar = this.f60110b;
                k0Var.G(xaVar.f713b, (g0) xaVar.f714c, this.f60111c, this.d);
                return;
            default:
                xa xaVar2 = this.f60110b;
                k0Var.A(xaVar2.f713b, (g0) xaVar2.f714c, this.f60111c, this.d);
                return;
        }
    }
}
