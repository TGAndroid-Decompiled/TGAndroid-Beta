package u2;
public final class h0 implements e2.j {
    public final int f47365a;
    public final a5.a f47366b;
    public final t f47367c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f47365a = i10;
        this.f47366b = aVar;
        this.f47367c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f47365a) {
            case 0:
                a5.a aVar = this.f47366b;
                j0Var.f(aVar.f280b, (f0) aVar.f281c, this.f47367c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47366b;
                j0Var.k(aVar2.f280b, (f0) aVar2.f281c, this.f47367c, this.d);
                return;
        }
    }
}
