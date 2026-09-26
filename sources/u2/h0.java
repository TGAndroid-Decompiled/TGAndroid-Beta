package u2;
public final class h0 implements e2.h {
    public final int f43656a;
    public final a5.a f43657b;
    public final t f43658c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f43656a = i10;
        this.f43657b = aVar;
        this.f43658c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f43656a) {
            case 0:
                a5.a aVar = this.f43657b;
                j0Var.e(aVar.f277b, (f0) aVar.f278c, this.f43658c, this.d);
                return;
            default:
                a5.a aVar2 = this.f43657b;
                j0Var.j(aVar2.f277b, (f0) aVar2.f278c, this.f43658c, this.d);
                return;
        }
    }
}
