package x2;

import a8.xa;
public final class i0 implements h2.j {
    public final int f60237a;
    public final xa f60238b;
    public final u f60239c;
    public final c0 d;

    public i0(xa xaVar, u uVar, c0 c0Var, int i7) {
        this.f60237a = i7;
        this.f60238b = xaVar;
        this.f60239c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f60237a) {
            case 0:
                xa xaVar = this.f60238b;
                k0Var.G(xaVar.f713b, (g0) xaVar.f714c, this.f60239c, this.d);
                return;
            default:
                xa xaVar2 = this.f60238b;
                k0Var.A(xaVar2.f713b, (g0) xaVar2.f714c, this.f60239c, this.d);
                return;
        }
    }
}
