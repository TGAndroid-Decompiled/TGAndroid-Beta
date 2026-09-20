package u2;
public final class h0 implements e2.h {
    public final int f43671a;
    public final a5.a f43672b;
    public final t f43673c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f43671a = i10;
        this.f43672b = aVar;
        this.f43673c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        switch (this.f43671a) {
            case 0:
                a5.a aVar = this.f43672b;
                l0Var.e(aVar.f277b, (f0) aVar.f278c, this.f43673c, this.d);
                return;
            default:
                a5.a aVar2 = this.f43672b;
                l0Var.j(aVar2.f277b, (f0) aVar2.f278c, this.f43673c, this.d);
                return;
        }
    }
}
