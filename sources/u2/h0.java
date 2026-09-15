package u2;
public final class h0 implements e2.h {
    public final int f43372a;
    public final a5.a f43373b;
    public final t f43374c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f43372a = i10;
        this.f43373b = aVar;
        this.f43374c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f43372a) {
            case 0:
                a5.a aVar = this.f43373b;
                k0Var.e(aVar.f275b, (f0) aVar.f276c, this.f43374c, this.d);
                return;
            default:
                a5.a aVar2 = this.f43373b;
                k0Var.j(aVar2.f275b, (f0) aVar2.f276c, this.f43374c, this.d);
                return;
        }
    }
}
