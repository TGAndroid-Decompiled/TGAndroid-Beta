package u2;
public final class h0 implements e2.h {
    public final int f46683a;
    public final a5.a f46684b;
    public final t f46685c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f46683a = i10;
        this.f46684b = aVar;
        this.f46685c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f46683a) {
            case 0:
                a5.a aVar = this.f46684b;
                k0Var.e(aVar.f285b, (f0) aVar.f286c, this.f46685c, this.d);
                return;
            default:
                a5.a aVar2 = this.f46684b;
                k0Var.j(aVar2.f285b, (f0) aVar2.f286c, this.f46685c, this.d);
                return;
        }
    }
}
