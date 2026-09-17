package u2;
public final class h0 implements e2.h {
    public final int f43395a;
    public final a5.a f43396b;
    public final t f43397c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f43395a = i10;
        this.f43396b = aVar;
        this.f43397c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f43395a) {
            case 0:
                a5.a aVar = this.f43396b;
                k0Var.e(aVar.f277b, (f0) aVar.f278c, this.f43397c, this.d);
                return;
            default:
                a5.a aVar2 = this.f43396b;
                k0Var.j(aVar2.f277b, (f0) aVar2.f278c, this.f43397c, this.d);
                return;
        }
    }
}
