package u2;
public final class i0 implements e2.j {
    public final int f47324a;
    public final a5.a f47325b;
    public final u f47326c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f47324a = i10;
        this.f47325b = aVar;
        this.f47326c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f47324a) {
            case 0:
                a5.a aVar = this.f47325b;
                k0Var.f(aVar.f281b, (g0) aVar.f282c, this.f47326c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47325b;
                k0Var.k(aVar2.f281b, (g0) aVar2.f282c, this.f47326c, this.d);
                return;
        }
    }
}
