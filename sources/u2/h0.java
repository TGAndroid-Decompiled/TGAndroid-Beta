package u2;
public final class h0 implements e2.h {
    public final int f46712a;
    public final a5.a f46713b;
    public final t f46714c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f46712a = i10;
        this.f46713b = aVar;
        this.f46714c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f46712a) {
            case 0:
                a5.a aVar = this.f46713b;
                k0Var.e(aVar.f297b, (f0) aVar.f298c, this.f46714c, this.d);
                return;
            default:
                a5.a aVar2 = this.f46713b;
                k0Var.j(aVar2.f297b, (f0) aVar2.f298c, this.f46714c, this.d);
                return;
        }
    }
}
