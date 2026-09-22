package u2;
public final class h0 implements e2.h {
    public final int f43692a;
    public final a5.a f43693b;
    public final t f43694c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f43692a = i10;
        this.f43693b = aVar;
        this.f43694c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        switch (this.f43692a) {
            case 0:
                a5.a aVar = this.f43693b;
                l0Var.e(aVar.f276b, (f0) aVar.f277c, this.f43694c, this.d);
                return;
            default:
                a5.a aVar2 = this.f43693b;
                l0Var.j(aVar2.f276b, (f0) aVar2.f277c, this.f43694c, this.d);
                return;
        }
    }
}
