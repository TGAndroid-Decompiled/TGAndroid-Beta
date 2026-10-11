package u2;
public final class h0 implements e2.h {
    public final int f48701a;
    public final a5.a f48702b;
    public final t f48703c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f48701a = i10;
        this.f48702b = aVar;
        this.f48703c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f48701a) {
            case 0:
                a5.a aVar = this.f48702b;
                j0Var.e(aVar.f299b, (f0) aVar.f300c, this.f48703c, this.d);
                return;
            default:
                a5.a aVar2 = this.f48702b;
                j0Var.j(aVar2.f299b, (f0) aVar2.f300c, this.f48703c, this.d);
                return;
        }
    }
}
