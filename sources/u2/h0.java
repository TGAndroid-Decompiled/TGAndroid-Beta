package u2;
public final class h0 implements e2.h {
    public final int f48632a;
    public final a5.a f48633b;
    public final t f48634c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f48632a = i10;
        this.f48633b = aVar;
        this.f48634c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f48632a) {
            case 0:
                a5.a aVar = this.f48633b;
                j0Var.e(aVar.f299b, (f0) aVar.f300c, this.f48634c, this.d);
                return;
            default:
                a5.a aVar2 = this.f48633b;
                j0Var.j(aVar2.f299b, (f0) aVar2.f300c, this.f48634c, this.d);
                return;
        }
    }
}
