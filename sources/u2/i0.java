package u2;
public final class i0 implements e2.j {
    public final int f47322a;
    public final a5.a f47323b;
    public final u f47324c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f47322a = i10;
        this.f47323b = aVar;
        this.f47324c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f47322a) {
            case 0:
                a5.a aVar = this.f47323b;
                k0Var.f(aVar.f280b, (g0) aVar.f281c, this.f47324c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47323b;
                k0Var.k(aVar2.f280b, (g0) aVar2.f281c, this.f47324c, this.d);
                return;
        }
    }
}
