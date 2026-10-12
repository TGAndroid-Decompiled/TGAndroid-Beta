package u2;
public final class i0 implements e2.j {
    public final int f45938a;
    public final a5.a f45939b;
    public final u f45940c;
    public final c0 d;

    public i0(a5.a aVar, u uVar, c0 c0Var, int i10) {
        this.f45938a = i10;
        this.f45939b = aVar;
        this.f45940c = uVar;
        this.d = c0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f45938a) {
            case 0:
                a5.a aVar = this.f45939b;
                k0Var.f(aVar.f279b, (g0) aVar.f280c, this.f45940c, this.d);
                return;
            default:
                a5.a aVar2 = this.f45939b;
                k0Var.k(aVar2.f279b, (g0) aVar2.f280c, this.f45940c, this.d);
                return;
        }
    }
}
