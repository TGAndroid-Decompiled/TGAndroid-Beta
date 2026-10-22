package u2;
public final class i0 implements e2.j {
    public final int f47334a;
    public final a5.a f47335b;
    public final u f47336c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f47334a = i10;
        this.f47335b = aVar;
        this.f47336c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        switch (this.f47334a) {
            case 0:
                a5.a aVar = this.f47335b;
                l0Var.f(aVar.f281b, (g0) aVar.f282c, this.f47336c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47335b;
                l0Var.k(aVar2.f281b, (g0) aVar2.f282c, this.f47336c, this.d);
                return;
        }
    }
}
