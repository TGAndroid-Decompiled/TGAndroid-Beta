package u2;
public final class h0 implements e2.h {
    public final int f47274a;
    public final a5.a f47275b;
    public final t f47276c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f47274a = i10;
        this.f47275b = aVar;
        this.f47276c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f47274a) {
            case 0:
                a5.a aVar = this.f47275b;
                k0Var.e(aVar.f299b, (f0) aVar.f300c, this.f47276c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47275b;
                k0Var.j(aVar2.f299b, (f0) aVar2.f300c, this.f47276c, this.d);
                return;
        }
    }
}
