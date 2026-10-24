package u2;
public final class j0 implements e2.j {
    public final int f47785a;
    public final a5.a f47786b;
    public final v f47787c;
    public final d0 d;

    public j0(a5.a aVar, v vVar, d0 d0Var, int i10) {
        this.f47785a = i10;
        this.f47786b = aVar;
        this.f47787c = vVar;
        this.d = d0Var;
    }

    @Override
    public final void accept(Object obj) {
        m0 m0Var = (m0) obj;
        switch (this.f47785a) {
            case 0:
                a5.a aVar = this.f47786b;
                m0Var.f(aVar.f281b, (h0) aVar.f282c, this.f47787c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47786b;
                m0Var.k(aVar2.f281b, (h0) aVar2.f282c, this.f47787c, this.d);
                return;
        }
    }
}
