package u2;
public final class h0 implements e2.h {
    public final int f46711a;
    public final a5.a f46712b;
    public final t f46713c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f46711a = i10;
        this.f46712b = aVar;
        this.f46713c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f46711a) {
            case 0:
                a5.a aVar = this.f46712b;
                k0Var.e(aVar.f297b, (f0) aVar.f298c, this.f46713c, this.d);
                return;
            default:
                a5.a aVar2 = this.f46712b;
                k0Var.j(aVar2.f297b, (f0) aVar2.f298c, this.f46713c, this.d);
                return;
        }
    }
}
