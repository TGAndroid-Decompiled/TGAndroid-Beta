package u2;
public final class i0 implements e2.j {
    public final int f49895a;
    public final a5.a f49896b;
    public final u f49897c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f49895a = i10;
        this.f49896b = aVar;
        this.f49897c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f49895a) {
            case 0:
                a5.a aVar = this.f49896b;
                k0Var.t(aVar.f281b, (g0) aVar.f282c, this.f49897c, this.d);
                return;
            default:
                a5.a aVar2 = this.f49896b;
                k0Var.L(aVar2.f281b, (g0) aVar2.f282c, this.f49897c, this.d);
                return;
        }
    }
}
