package x2;

import a8.xa;
public final class i0 implements h2.j {
    public final int f60150a;
    public final xa f60151b;
    public final u f60152c;
    public final c0 d;

    public i0(xa xaVar, u uVar, c0 c0Var, int i7) {
        this.f60150a = i7;
        this.f60151b = xaVar;
        this.f60152c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f60150a) {
            case 0:
                xa xaVar = this.f60151b;
                k0Var.G(xaVar.f713b, (g0) xaVar.f714c, this.f60152c, this.d);
                return;
            default:
                xa xaVar2 = this.f60151b;
                k0Var.A(xaVar2.f713b, (g0) xaVar2.f714c, this.f60152c, this.d);
                return;
        }
    }
}
