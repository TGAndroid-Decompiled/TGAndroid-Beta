package u2;
public final class i0 implements e2.j {
    public final int f47335a;
    public final a5.a f47336b;
    public final u f47337c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f47335a = i10;
        this.f47336b = aVar;
        this.f47337c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        l0 l0Var = (l0) obj;
        switch (this.f47335a) {
            case 0:
                a5.a aVar = this.f47336b;
                l0Var.f(aVar.f281b, (g0) aVar.f282c, this.f47337c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47336b;
                l0Var.k(aVar2.f281b, (g0) aVar2.f282c, this.f47337c, this.d);
                return;
        }
    }
}
