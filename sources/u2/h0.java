package u2;
public final class h0 implements e2.h {
    public final int f43627a;
    public final a5.a f43628b;
    public final t f43629c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f43627a = i10;
        this.f43628b = aVar;
        this.f43629c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f43627a) {
            case 0:
                a5.a aVar = this.f43628b;
                k0Var.e(aVar.f277b, (f0) aVar.f278c, this.f43629c, this.d);
                return;
            default:
                a5.a aVar2 = this.f43628b;
                k0Var.j(aVar2.f277b, (f0) aVar2.f278c, this.f43629c, this.d);
                return;
        }
    }
}
