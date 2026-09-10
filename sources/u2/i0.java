package u2;
public final class i0 implements e2.h {
    public final int f42342a;
    public final a5.a f42343b;
    public final u f42344c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f42342a = i10;
        this.f42343b = aVar;
        this.f42344c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        m0 m0Var = (m0) obj;
        switch (this.f42342a) {
            case 0:
                a5.a aVar = this.f42343b;
                m0Var.e(aVar.f275b, (g0) aVar.f276c, this.f42344c, this.d);
                return;
            default:
                a5.a aVar2 = this.f42343b;
                m0Var.j(aVar2.f275b, (g0) aVar2.f276c, this.f42344c, this.d);
                return;
        }
    }
}
