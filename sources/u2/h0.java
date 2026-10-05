package u2;
public final class h0 implements e2.h {
    public final int f47289a;
    public final a5.a f47290b;
    public final t f47291c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f47289a = i10;
        this.f47290b = aVar;
        this.f47291c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f47289a) {
            case 0:
                a5.a aVar = this.f47290b;
                k0Var.e(aVar.f299b, (f0) aVar.f300c, this.f47291c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47290b;
                k0Var.j(aVar2.f299b, (f0) aVar2.f300c, this.f47291c, this.d);
                return;
        }
    }
}
